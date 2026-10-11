package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f44683a;
    public final zn f44684b;
    public final ArrayList f44685c;

    public zf(zn znVar, ArrayList arrayList, int i10) {
        this.f44683a = i10;
        this.f44684b = znVar;
        this.f44685c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f44683a) {
            case 0:
                zn znVar = this.f44684b;
                qi qiVar = new qi(znVar, znVar, znVar.getParentActivity(), znVar.f44796ea, this.f44685c);
                qiVar.setCalcMandatoryInsets(znVar.C9());
                qiVar.setDimBehind(false);
                znVar.D7(false);
                znVar.showDialog(qiVar);
                return;
            default:
                zn znVar2 = this.f44684b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.jw(znVar2, znVar2.getParentActivity(), znVar2.f44796ea, this.f44685c).show();
                    znVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
