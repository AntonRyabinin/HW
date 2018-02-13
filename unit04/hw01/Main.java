package by.htp.jd01.unit04.hw01;


class Main {

    public static void main(String[] args){

        Group gr = new Group();

        gr.setGroupSize();
        gr.showStudentsInfo();
        gr.averageMarkEachStudent();
        gr.averageMarkAllGroup();
        gr.countGoodStudents();
        gr.countBadStudents();
    }
}
