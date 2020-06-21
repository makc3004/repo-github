package HomeWorkOOP;

public class Animals {
    String kindAnimal;
    int maxrun;
    int maxswim;
    double maxjump;

    double maxDistance;
    String action;
    String kind;

    Animals(String kind, int maxrun, int maxswim, double maxjump) {


        this.maxrun = maxrun;
        this.maxswim = maxswim;
        this.maxjump = maxjump;
        this.kind = kind;
    }

//    int maxrun;
//    int maxswim;
//    double maxjump;
//
//    public Animals(int maxrun, int maxswim, double maxjump){
//        this.maxrun = maxrun;
//        this.maxswim = maxswim;
//        this.maxjump = maxjump;
//    }


//    protected int maxrun;
//    protected int maxswim;
//    protected double maxjump;
//
//    public Animals(int maxrun, int maxswim, double maxjump ) {
//        this.maxrun = maxrun;
//        this.maxswim = maxswim;
//        this.maxjump = maxjump;

//    public void defaultBehaviour(String actionId, double obsLength) {
//        double maxDistance = getMaxDistance(actionId);
//        String actionPlural = getActionPlural(actionId);
//        if (maxDistance == 0) {
//            System.out.printf("%s не умеют %s\n", getSpeciesPlural(), actionPlural);
//        } else if (obsLength > maxDistance) {
//            System.out.printf("%s по кличке %s не умеет %s дальше %.1f м.\n", getSpeciesSingular(), getName(), actionPlural, maxDistance);
//        } else {
//            System.out.printf("%s по кличке %s %s %.1f м.\n", getSpeciesSingular(), getName(), getActionSingular(actionId), obsLength);
//        }
//    }

    public void move() {
        if (maxrun == 0) {
            System.out.println(kind + " не умеет бегать");
        } else {
            System.out.println(kind + " пробегает " + maxrun + " м");
        }
        if (maxswim == 0) {
            System.out.println(kind + " не умеет плавать");
        } else {
            System.out.println(kind + " проплывет " + maxswim + " м");
        }
        if (maxjump == 0) {
            System.out.println(kind + " не умеет прыгать");
        } else {
            System.out.println(kind + " прыгает на высоту " + maxjump + " м");
        }
    }
}

