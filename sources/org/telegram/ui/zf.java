package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f43393a;
    public final co f43394b;
    public final ArrayList f43395c;

    public zf(co coVar, ArrayList arrayList, int i10) {
        this.f43393a = i10;
        this.f43394b = coVar;
        this.f43395c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43393a) {
            case 0:
                co coVar = this.f43394b;
                pi piVar = new pi(coVar, coVar, coVar.getParentActivity(), coVar.f35248ea, this.f43395c);
                piVar.setCalcMandatoryInsets(coVar.x9());
                piVar.setDimBehind(false);
                coVar.A7(false);
                coVar.showDialog(piVar);
                return;
            default:
                co coVar2 = this.f43394b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.rv(coVar2, coVar2.getParentActivity(), coVar2.f35248ea, this.f43395c).show();
                    coVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
