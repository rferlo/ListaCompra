package org.rferlo.listacompra;

import java.util.Vector;

import org.rferlo.listacompra.controlador.Base;
import org.rferlo.listacompra.modelo.Unidad;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView tx = (TextView)findViewById(R.id.tx01);

		// Arrancar el entorno
		Base.InicializaEntorno();
		Log.d("UNIDADES" ,Base.getListaUnidades());
		
		Vector<Unidad> v = Base.getListaUnidadesEmpiezaPor("g");
		System.out.println("UNIDADES QUE CONTIENEN G");
		StringBuffer sb = new StringBuffer();
		for(Unidad u: v) {
			sb.append(u.toString() + "\n");
		}
		tx.setText(sb.toString());

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
