package steps;

import java.util.List;
import java.util.Map;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given ("[Search] generar numeros a partir del numero solicitado")
	public void search_generar_numeros_a_partir_del_numero_solicitado() {
		
	}
	
	@Given ("[Search] usando los siguientes parametros")
	public void search_usando_los_siguientes_parametros(List<Map<String, String>> parametria) {
		Imprimir a1 = new Imprimir();
		Map<String,String> parametro = parametria.get(0);
		a1.entradaDatos(Integer.parseInt(parametro.get("int")),Integer.parseInt(parametro.get("limit")));
	}
	
	@When ("[Search] recibimos un numero de entrada")
	public void search_recibimos_un_numero_de_entradaDeEntrada() {
		
	}
	@Then ("[Search] listamos del 0 al numero ingresado ordenado de 5 en 5")
	public void search_listamos_del_al_numero_ingresado_ordenado_de_en() {
		
	}
		
}
