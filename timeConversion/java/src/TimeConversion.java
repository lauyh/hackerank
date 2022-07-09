public class Minimax {

    public Minimax() {

    }

    public String timeConversion(String str) {
        boolean isNoon = !str.substring(str.length() - 2).equals("AM");
        boolean isTwelve = str.substring(0, 2).equals("12");
        String cleanStr = str.substring(0, str.length() - 2);
        String[] tmp = cleanStr.split(":");
        String hour = tmp[0];
        String min = tmp[1];
        String sec = tmp[2];

        if (isNoon && !isTwelve) {
            hour = String.valueOf(Integer.parseInt(hour) + 12);
        } else if (!isNoon && isTwelve) {
            hour = "00";
        }

        return (hour + ":" + min + ":" + sec).toString();
    }
}