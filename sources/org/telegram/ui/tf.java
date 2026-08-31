package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class tf implements View.OnClickListener {
    public final int f41603a;
    public final xn f41604b;
    public final ArrayList f41605c;

    public tf(xn xnVar, ArrayList arrayList, int i10) {
        this.f41603a = i10;
        this.f41604b = xnVar;
        this.f41605c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41603a) {
            case 0:
                xn xnVar = this.f41604b;
                li liVar = new li(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f43136ba, this.f41605c);
                liVar.setCalcMandatoryInsets(xnVar.x9());
                liVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(liVar);
                return;
            default:
                xn xnVar2 = this.f41604b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.ov(xnVar2, xnVar2.getParentActivity(), xnVar2.f43136ba, this.f41605c).show();
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
