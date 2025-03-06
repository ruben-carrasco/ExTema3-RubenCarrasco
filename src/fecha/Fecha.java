package fecha;

public class Fecha {
<<<<<<< HEAD
	/**
	 * Atributo para el dia de la fecha
	 */
	private int d; //d�a
	/**
	 * Atributo para el mes de la fecha
	 */
	private int m; //mes
	/**
	 * Atributo para el año de la fecha
	 */
	private int a; //a�o
=======
	public static final int DIEZ = 10;
	private int dia; //d�a
	private int mes; //mes
	private int año; //a�o
>>>>>>> PMD-Refactor

	/**
	 * Constructor vacío
	 */
	public Fecha() {

	}

	/**
	 * Constructor con todos los atributos
	 * @param dia dia de la fecha
	 * @param mes mes de la fecha
	 * @param anio año de la fecha
	 */
	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.año = anio;
	}

	
	/**
	 * Funcion que verifica si es correcta al fecha
	 * @return boolean que es true si es correcta
	 */
	public boolean fechaCorrecta() {
		boolean diaCorrecto; 
		boolean mesCorrecto;
		boolean anioCorrecto;
		anioCorrecto = año > 0;
		mesCorrecto = mes >= 1 && mes <= 12;
		boolean diaMayor1 = dia >= 1;
		switch (mes) {
		case 2:
			if (esBisiesto()) {
				diaCorrecto = diaMayor1 && dia <= 29;
			} else {
				diaCorrecto = diaMayor1 && dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = diaMayor1 && dia <= 30;
			break;
		default:
			diaCorrecto = diaMayor1 && dia <= 31;
		}
		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

<<<<<<< HEAD
	/**
	 * Metodo que comprueba si es bisiesto
	 * @return boolean que es true si es bisiesto
	 */
=======
	// M�todo esBisiesto. Solo lo usa fechaCorrecta, por eso es privado
>>>>>>> PMD-Refactor
	private boolean esBisiesto() {
		return año % 4 == 0 && año % 100 != 0 || año % 400 == 0;
	}

<<<<<<< HEAD
	/**
	 * Metodo díaSiguiente, añade un dia a la fecha
	 */
	public void diaSiguiente() {
		d++;
=======
	// M�todo diaSiguiente
	public void nextDay() {
		dia++;
>>>>>>> PMD-Refactor
		if (!fechaCorrecta()) {
			dia = 1;
			mes++;
			if (!fechaCorrecta()) {
				mes = 1;
				año++;
			}
		}
	}

<<<<<<< HEAD
	/**
	 * Metodo toString
	 */
=======
	// M�todo toString
>>>>>>> PMD-Refactor
	public String toString() {
		String res = "";
		if (dia < DIEZ && mes < DIEZ) {
			res = "0" + dia + "-0" + mes + "-" + año;
		} else if (dia < DIEZ && mes >= DIEZ) {
			res = "0" + dia + "-" + mes + "-" + año;
		} else if (dia >= DIEZ && mes < DIEZ) {
			res = dia + "-0" + mes + "-" + año;
		} else {
			res = dia + "-" + mes + "-" + año;
		}
		return res;
	}

}
