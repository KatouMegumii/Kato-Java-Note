package ThinkingInJava4Edition.Exercise.Ch2Exercise;

public class Exercise11 {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
        System.out.println(a.anIntegerRepresentingColors);

        a.changeTheColor(1);
        System.out.println(a.anIntegerRepresentingColors);

		a.changeTheHueOfTheColor(2);
		System.out.println(a.hue);

    }

    public static class AllTheColorsOfTheRainbow {
        public int anIntegerRepresentingColors = 0;
        public int hue = 0;

        public void changeTheColor(int newColor) {
           this.anIntegerRepresentingColors = newColor;
        }

        public void changeTheHueOfTheColor(int newHue) {
            this.hue = newHue;
        }
    }
}
