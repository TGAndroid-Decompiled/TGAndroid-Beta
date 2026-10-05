package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f43766a;
    public final yn f43767b;
    public final ArrayList f43768c;

    public zf(yn ynVar, ArrayList arrayList, int i10) {
        this.f43766a = i10;
        this.f43767b = ynVar;
        this.f43768c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43766a) {
            case 0:
                yn ynVar = this.f43767b;
                ni niVar = new ni(ynVar, ynVar, ynVar.getParentActivity(), ynVar.f43300ca, this.f43768c);
                niVar.setCalcMandatoryInsets(ynVar.w9());
                niVar.setDimBehind(false);
                ynVar.A7(false);
                ynVar.showDialog(niVar);
                return;
            default:
                yn ynVar2 = this.f43767b;
                if (ynVar2.getParentActivity() != null && ynVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.wv(ynVar2, ynVar2.getParentActivity(), ynVar2.f43300ca, this.f43768c).show();
                    ynVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
