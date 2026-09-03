package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class tf implements View.OnClickListener {
    public final int f41527a;
    public final xn f41528b;
    public final ArrayList f41529c;

    public tf(xn xnVar, ArrayList arrayList, int i10) {
        this.f41527a = i10;
        this.f41528b = xnVar;
        this.f41529c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41527a) {
            case 0:
                xn xnVar = this.f41528b;
                li liVar = new li(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f43114ba, this.f41529c);
                liVar.setCalcMandatoryInsets(xnVar.x9());
                liVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(liVar);
                return;
            default:
                xn xnVar2 = this.f41528b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ov(xnVar2, xnVar2.getParentActivity(), xnVar2.f43114ba, this.f41529c).show();
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
