package sanberdir.java_lesson;

public class Main {
    public static void main(String[] args) {
        Difficulty gameDifficulty = Difficulty.HARD;
        System.out.println("Наша сложность " + gameDifficulty);

        ToolMaterial swordMaterial = ToolMaterial.IRON;
        ToolMaterial axeMaterial = ToolMaterial.STONE;

        System.out.println("Мой меч имеет " + swordMaterial.getDurability() + " прочность");
        System.out.println("Мой топор имеет " + axeMaterial.getDurability() + " прочность");
        System.out.println("Топор добывает дерево со скоростью " + axeMaterial.getMiningSpeed());
    }
}