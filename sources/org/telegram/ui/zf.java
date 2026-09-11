package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f43392a;
    public final co f43393b;
    public final ArrayList f43394c;

    public zf(co coVar, ArrayList arrayList, int i10) {
        this.f43392a = i10;
        this.f43393b = coVar;
        this.f43394c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43392a) {
            case 0:
                co coVar = this.f43393b;
                pi piVar = new pi(coVar, coVar, coVar.getParentActivity(), coVar.f35247ea, this.f43394c);
                piVar.setCalcMandatoryInsets(coVar.x9());
                piVar.setDimBehind(false);
                coVar.A7(false);
                coVar.showDialog(piVar);
                return;
            default:
                co coVar2 = this.f43393b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.rv(coVar2, coVar2.getParentActivity(), coVar2.f35247ea, this.f43394c).show();
                    coVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
