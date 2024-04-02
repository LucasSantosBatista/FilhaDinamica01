package view;

import model.FilaInt;

public class Main {

	public static void main(String[] args) {
		int[] vet = { 36, 28, 146, 14, -65, 117, -40, 24, 138, 116 };
		FilaInt f = new FilaInt();

		for (int valor : vet) {
			if (f.isEmpty()) {
				f.insert(valor * 10);
			} else if (valor >= 0) {
				f.insert(valor + 10);
			} else if (valor < 0) {
				int aux = 0;
				try {
					aux = f.remove();
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					System.out.println(aux);
					f.insert(valor);
				}
			}
		}

		try {
			f.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(f.size());
	}

}
