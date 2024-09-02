public class Main {
    public static void main(String[] args) {
//        int num = 11;
//        int currentTime = 10;
//        int timeStartShop = 9;
//        int timeEndShop = 17;
//        int operationTimeStart = 10;
//        int operationTimeEnd = 16;
//        boolean isOpen;// = false

//        if (currentTime >= timeStartShop && currentTime <= timeEndShop) {
//            isOpen = true;
//        } else {
//            isOpen = false;
//        }

//          if
//        not boolean values
//        if (num < 10) {
//            System.out.println("In the if body");
//            System.out.println("num == 10");
//        }

//        boolean value
//        if(isOpen) {
//            System.out.println("Shop is open");
//        }

//        System.out.println("After if");


//        if-else
//        if (isOpen) {
//            System.out.println("Shop is opened");
//            System.out.println("Enter into the shop");
//        } else {
//            System.out.println("Shop is closed");
//            System.out.println("Can wait till shop is open");
//        }

//        if (num % 2 == 0) {
//            System.out.println("num is even");
//        } else {
//            System.out.println("num is odd");
//        }
//
//        boolean isCanBuy;
//        if (currentTime >= operationTimeStart && currentTime <= operationTimeEnd) {
//            isCanBuy = true;
//        } else {
//            isCanBuy = false;
//        }
//
//
//        if(isOpen && isCanBuy) {
//            System.out.println("Buy something");
//        } else {
//            System.out.println("Can't buy");
//        }

//        nested if
//        boolean isOpen = true;
//        boolean isCanBuy = false;
//        boolean isIPhoneMax = true;
//        if(isOpen) {
//            System.out.println("Shop is open and you can buy");
//            if(isCanBuy) {
//                if (isIPhoneMax) {
//                    System.out.println("We can buy IPhoneMax");
//                } else {
//                    System.out.println("We can't buy IPhoneMax");
//                }
//            } else {
//                System.out.println("We can't buy");
//            }
//        } else {
//            System.out.println("Shop is close");
//        }


//        if-else-if ladder
//        int a1 = -1;
//        int b1 = 1;
//        int a2 = 2;
//        int b2 = 10;
//        int point = -1;
//
//        if (point >= a1 && point <= b1) {
//            System.out.println("First line");
//        } else if (point >= a2 && point <= b2) {
//            System.out.println("Second line");
//        } else {
//            System.out.println("Not in first nor second");
//        }
////  if
//        if (point >= a1 && point <= b1) {
//            System.out.println("First line");
//            if (point < 0) {
//                System.out.println("point less than 0");
//            }
//        }
//        if (point >= a2 && point <= b2) {
//            System.out.println("Second line");
//        }
//        if (!((point >= a1 && point <= b1) || (point >= a2 && point <= b2)))
//        {
//            System.out.println("Not in first nor second");
//        }

//        if (false) {
//            System.out.println("In if");
//            return;
//        }
//        System.out.println("After if return");

        int balance = 100;
        int withdraw = 200;
        if (balance > 0 && balance < 200) {
            System.out.println("Balance is OK");
            return;
        }
        if (withdraw <= balance) {
            System.out.println("Withdraw");
        } else {
            System.out.println("Not enough money");
        }
    }
}