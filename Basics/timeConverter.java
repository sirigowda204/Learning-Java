// Implement TimeConverter class that aims to convert time from hours or days to minutes. 

public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if (hours<0){
            return -1;
        }
        int min = hours*60;
        return min;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if (days<0){
            return -1;
        }
        int min = days*24*60;
        return min;
    }
}