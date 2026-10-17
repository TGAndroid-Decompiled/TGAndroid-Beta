package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class uf implements View.OnClickListener {
    public final int f41973a;
    public final sn f41974b;
    public final ArrayList f41975c;

    public uf(sn snVar, ArrayList arrayList, int i10) {
        this.f41973a = i10;
        this.f41974b = snVar;
        this.f41975c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41973a) {
            case 0:
                sn snVar = this.f41974b;
                ji jiVar = new ji(snVar, snVar, snVar.getParentActivity(), snVar.f41205ea, this.f41975c);
                jiVar.setCalcMandatoryInsets(snVar.C9());
                jiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(jiVar);
                return;
            default:
                sn snVar2 = this.f41974b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(snVar2, snVar2.getParentActivity(), snVar2.f41205ea, this.f41975c).show();
                    snVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
