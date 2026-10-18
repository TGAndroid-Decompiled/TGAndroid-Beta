package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class uf implements View.OnClickListener {
    public final int f41947a;
    public final sn f41948b;
    public final ArrayList f41949c;

    public uf(sn snVar, ArrayList arrayList, int i10) {
        this.f41947a = i10;
        this.f41948b = snVar;
        this.f41949c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41947a) {
            case 0:
                sn snVar = this.f41948b;
                ji jiVar = new ji(snVar, snVar, snVar.getParentActivity(), snVar.f41191ea, this.f41949c);
                jiVar.setCalcMandatoryInsets(snVar.C9());
                jiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(jiVar);
                return;
            default:
                sn snVar2 = this.f41948b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(snVar2, snVar2.getParentActivity(), snVar2.f41191ea, this.f41949c).show();
                    snVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
