import java.util.Scanner;

interface Pass {
    default int priceDecider(String vehicleType, String duration) {
        switch (vehicleType) {
            case "Cycle" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 5;
                    }
                    case "Monthly" -> {
                        return 50;
                    }
                    case "Annually" -> {
                        return 500;
                    }
                }
            }
            case "Bike" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 20;
                    }
                    case "Monthly" -> {
                        return 200;
                    }
                    case "Annually" -> {
                        return 2000;
                    }
                }
            }
            case "Car" -> {
                switch (duration) {
                    case "Daily" -> {
                        return 50;
                    }
                    case "Monthly" -> {
                        return 500;
                    }
                    case "Annually" -> {
                        return 5000;
                    }
                }
            }
        }
        return 0 ;
    }
}
class Monthly implements Pass {
}
class Daily implements Pass{

}
class Annually implements Pass{

}
