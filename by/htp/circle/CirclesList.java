package by.htp.circle;


import java.util.ArrayList;
import java.util.List;




public class CirclesList {
    private List<Circle> circlesList;


    public CirclesList() {
        circlesList = new ArrayList<>();
    }

    public void addCircle(Circle a) {
        circlesList.add(a);
    }

    public void maxMinSp() {
        double k = 0;
        double maxS = 0;
        int maxInd = 0;
        double t = 0;
        double minS = 0;
        int minInd = 0;
        for (int i = 0; i < circlesList.size() - 1; i++) {

            if (circlesList.get(i).findS() > circlesList.get(i + 1).findS()) {
                k = circlesList.get(i).findS();
                if (k > maxS) {
                    maxS = k;
                }
            }
            if (circlesList.get(i).findS() < circlesList.get(i + 1).findS()) {
                t = circlesList.get(i).findS();
                if (t > minS) {
                    minS = t;
                    minInd = i;
                }
            }
        }
        System.out.println("ќкружность с максимальной площадью/периметром" + circlesList.get(maxInd));
        System.out.println("ќкружность с минимальной площадью/периметром" + circlesList.get(minInd));
    }

    public void pointsBelongLine() {
        for (int i = 0; i < circlesList.size() - 1; i++) {
            for (int j = 1; j < circlesList.size(); j++) {
                if (j == i) {
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Ћинии, проход€щей через точку ").append(circlesList.get(i).getX()).append(" ").append(circlesList.get(i).getY())
                        .append(" и точку ").append(circlesList.get(j).getX()).append(" ").append(circlesList.get(j).getY());

                for (int y = 2; y < circlesList.size(); y++) {
                    if (y == i | y == j) {
                        continue;
                    }
                    if ((circlesList.get(i).getX() - circlesList.get(y).getX()) * (circlesList.get(j).getY()
                            - circlesList.get(y).getY()) == (circlesList.get(j).getX() - circlesList.get(y).getX())
                            * (circlesList.get(i).getY() - circlesList.get(y).getY())) {

                        System.out.print(sb);
                        System.out.print(" принадлежит точка X:" + circlesList.get(y).getX() + "; Y:" + circlesList.get(y).getY());
                        System.out.println();
                    }
                }
            }
        }
    }
}
