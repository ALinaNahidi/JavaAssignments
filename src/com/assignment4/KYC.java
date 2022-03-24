package com.assignment4;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class KYCDates {
    Date signUpDate, currentDate;
    String startDateString, endDateString;
    Date startDate, endDate;

    public void getKYCRange(String inputSignUpDate, String inputCurrentDate) {
        try {

            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
            signUpDate = dateFormatter.parse(inputSignUpDate);
            currentDate = dateFormatter.parse(inputCurrentDate);

            if (signUpDate.after(currentDate)) {
                System.out.println("No range");
            } else {
                startDate = signUpDate;
                startDate.setYear(currentDate.getYear());

                Calendar calendar = Calendar.getInstance();

                //Setting calender to StartDate
                calendar.setTime(startDate);
                calendar.add(Calendar.DATE, -30);

                startDate = calendar.getTime();
                calendar.add(Calendar.DATE, 60);
                endDate = calendar.getTime();

                if (endDate.after(currentDate)) {
                    endDate = currentDate;
                }
            }

            startDateString = dateFormatter.format(startDate);
            endDateString = dateFormatter.format(endDate);

            System.out.println(startDateString+"	"+endDateString);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
};

class KYC {

    public static void main(String[] args) {

        KYCDates obj = new KYCDates();

        obj.getKYCRange("16-07-1998", "27-06-2017");
        obj.getKYCRange("04-02-2016", "04-04-2017");
        obj.getKYCRange("04-05-2017", "04-04-2017");
        obj.getKYCRange("04-04-2015", "04-04-2016");
        obj.getKYCRange("04-04-2015", "15-03-2016");
    }

}