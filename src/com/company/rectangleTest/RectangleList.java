package com.company.rectangleTest;

import java.util.*;

public class RectangleList {
    private static final List<Rectangle> rectangles = new ArrayList<>();

    public List<Rectangle> matchRectangleWithPoint(List<Point> points) {
        List<Rectangle> matchedRectangles = new LinkedList<>();

        Collections.sort(rectangles, new Comparator<Rectangle>() {
            @Override
            public int compare(Rectangle o1, Rectangle o2) {
                if (o1.getLeftBottomX() != o2.getLeftBottomX()) {
                    return o1.getLeftBottomX() - o2.getLeftBottomX();
                } else return o1.getLeftBottomY() - o2.getLeftBottomY();
            }
        });


        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                if (o1.getX() != o2.getX()) {
                    return o1.getX() - o2.getX();
                } else return o1.getY() - o2.getY();
            }
        });

        int counter = 0;
        for (Point point : points) {
            for (int i = counter; i < rectangles.size(); i++) {

                int x = point.getX();
                int y = point.getY();

                int rectangleLeftX = rectangles.get(i).getLeftBottomX(); //left side
                int rectangleRightX = rectangles.get(i).getRightTopX(); //right side
                int rectangleBottomY = rectangles.get(i).getLeftBottomY(); //bottom side
                int rectangleTopY = rectangles.get(i).getRightTopY(); //top side

                if (x > rectangleRightX) {
                    counter++;
                    continue;
                } else if (x < rectangleLeftX) {
                    break;
                } else if (y <= rectangleTopY && y >= rectangleBottomY) {
                    matchedRectangles.add(rectangles.get(i));
                    counter++;
                    break;
                }
            }
        }

        return matchedRectangles;
    }
}
