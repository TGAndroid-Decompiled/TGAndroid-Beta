package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class zf implements View.OnClickListener {
    public final int f43420a;
    public final co f43421b;
    public final ArrayList f43422c;

    public zf(co coVar, ArrayList arrayList, int i10) {
        this.f43420a = i10;
        this.f43421b = coVar;
        this.f43422c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43420a) {
            case 0:
                co coVar = this.f43421b;
                pi piVar = new pi(coVar, coVar, coVar.getParentActivity(), coVar.f35275ea, this.f43422c);
                piVar.setCalcMandatoryInsets(coVar.x9());
                piVar.setDimBehind(false);
                coVar.A7(false);
                coVar.showDialog(piVar);
                return;
            default:
                co coVar2 = this.f43421b;
                if (coVar2.getParentActivity() != null && coVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.rv(coVar2, coVar2.getParentActivity(), coVar2.f35275ea, this.f43422c).show();
                    coVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
