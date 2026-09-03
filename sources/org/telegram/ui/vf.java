package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class vf implements View.OnClickListener {
    public final int f39082a;
    public final zn f39083b;
    public final ArrayList f39084c;

    public vf(zn znVar, ArrayList arrayList, int i10) {
        this.f39082a = i10;
        this.f39083b = znVar;
        this.f39084c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39082a) {
            case 0:
                zn znVar = this.f39083b;
                ni niVar = new ni(znVar, znVar, znVar.getParentActivity(), znVar.f40534ba, this.f39084c);
                niVar.setCalcMandatoryInsets(znVar.x9());
                niVar.setDimBehind(false);
                znVar.A7(false);
                znVar.showDialog(niVar);
                return;
            default:
                zn znVar2 = this.f39083b;
                if (znVar2.getParentActivity() != null && znVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.lv(znVar2, znVar2.getParentActivity(), znVar2.f40534ba, this.f39084c).show();
                    znVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
