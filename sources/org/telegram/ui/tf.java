package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class tf implements View.OnClickListener {
    public final int f38649a;
    public final xn f38650b;
    public final ArrayList f38651c;

    public tf(xn xnVar, ArrayList arrayList, int i10) {
        this.f38649a = i10;
        this.f38650b = xnVar;
        this.f38651c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38649a) {
            case 0:
                xn xnVar = this.f38650b;
                li liVar = new li(xnVar, xnVar, xnVar.getParentActivity(), xnVar.f39968ba, this.f38651c);
                liVar.setCalcMandatoryInsets(xnVar.x9());
                liVar.setDimBehind(false);
                xnVar.A7(false);
                xnVar.showDialog(liVar);
                return;
            default:
                xn xnVar2 = this.f38650b;
                if (xnVar2.getParentActivity() != null && xnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.mv(xnVar2, xnVar2.getParentActivity(), xnVar2.f39968ba, this.f38651c).show();
                    xnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
