package ensayos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import vista.info.EspecialidadesInfo;
import vista.info.MercadoSoldadosInfo;

public class ParaUIMercadoSoldadoEnsayo extends MercadoSoldadosEnsayo {
	ComenzarController comenzarController;

	public ParaUIMercadoSoldadoEnsayo(MercadoSoldadosInfo info,ComenzarController comenzarController) {
		super(info);
		this.comenzarController=comenzarController;
		getBtnOk().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					if(sumaSoldados()<=Integer.valueOf(getLblMaxSoldados().getText())) {
						ArrayList<EspecialidadesInfo> especialidades=getEspecialidades();
						
					}
			}
		});
	}

	
}
