package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f43772a;
    public final yn f43773b;
    public final ArrayList f43774c;

    public zf(yn ynVar, ArrayList arrayList, int i10) {
        this.f43772a = i10;
        this.f43773b = ynVar;
        this.f43774c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43772a) {
            case 0:
                yn ynVar = this.f43773b;
                ni niVar = new ni(ynVar, ynVar, ynVar.getParentActivity(), ynVar.f43307ca, this.f43774c);
                niVar.setCalcMandatoryInsets(ynVar.w9());
                niVar.setDimBehind(false);
                ynVar.A7(false);
                ynVar.showDialog(niVar);
                return;
            default:
                yn ynVar2 = this.f43773b;
                if (ynVar2.getParentActivity() != null && ynVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wv(ynVar2, ynVar2.getParentActivity(), ynVar2.f43307ca, this.f43774c).show();
                    ynVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
