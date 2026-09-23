package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class yf implements View.OnClickListener {
    public final int f39808a;
    public final xn f39809b;
    public final ArrayList f39810c;

    public yf(xn xnVar, ArrayList arrayList, int i10) {
        this.f39808a = i10;
        this.f39809b = xnVar;
        this.f39810c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39808a) {
            case 0:
                xn xnVar = this.f39809b;
                mi miVar = new mi(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f39370ea, this.f39810c);
                miVar.setCalcMandatoryInsets(xnVar.x9());
                miVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(miVar);
                return;
            default:
                xn xnVar2 = this.f39809b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(xnVar2, xnVar2.getParentActivity(), xnVar2.f39370ea, this.f39810c).show();
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
