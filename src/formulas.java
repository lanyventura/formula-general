
public class formulas {

       public static double positivo(int variableA, int variableB, int variableC) {
        double resultadoPositivo;
        double multiplicacion = (variableB * variableB) - (4 * variableA * variableC);

        resultadoPositivo = (-variableB + Math.sqrt(multiplicacion)) / (2 * variableA);

        return resultadoPositivo;
    }

    public static double negativo(int varA, int varB, int varC) {
        double resultadoNegativo;
        double multiplicacion = (varB * varB) - (4 * varA * varC);

        resultadoNegativo = (-varB - Math.sqrt(multiplicacion)) / (2 * varA);

        return resultadoNegativo;
    }
}