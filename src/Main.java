import com.mt9408.ooppractice3.ConversorTemperatura.ConversorTemperaturaPadrao;
import com.mt9408.ooppractice3.calculadorageometrica.CalculadoraSalaRetangular;
import com.mt9408.ooppractice3.conversordemoeda.ConversorMoeda;
import com.mt9408.ooppractice3.livraria.Livro;
import com.mt9408.ooppractice3.livraria.ProdutoFisico;
import com.mt9408.ooppractice3.tabuada.TabuadaMultiplicacao;

public class Main {
    public static void main(String[] args) {

        /*Conversor de Moeda
        ConversorMoeda conv1 = new ConversorMoeda();
        conv1.converterDolarParaReal(100.00);*/

        /*CalculadoraSalaRetangular sala1 = new CalculadoraSalaRetangular();
        sala1.calcularArea(10,10);

        sala1.calcularPerimetro(10,10,10,10);*/

        /*TabuadaMultiplicacao num1 = new TabuadaMultiplicacao();
        num1.mostrarTabuada(5);*/

        /*ConversorTemperaturaPadrao temp1 = new ConversorTemperaturaPadrao();
        temp1.celsiusParaFahrenheit(100);
        temp1.fahrenheitParaCelsius(200);*/

        Livro livro1 = new Livro();
        livro1.calculaPrecoFinal(100);

        ProdutoFisico prod1 = new ProdutoFisico();
        prod1.calculaPrecoFinal(100);

    }
}
