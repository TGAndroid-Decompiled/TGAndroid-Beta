package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class xf implements View.OnClickListener {
    public final int f39896a;
    public final wn f39897b;
    public final ArrayList f39898c;

    public xf(wn wnVar, ArrayList arrayList, int i10) {
        this.f39896a = i10;
        this.f39897b = wnVar;
        this.f39898c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39896a) {
            case 0:
                wn wnVar = this.f39897b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39454ea, this.f39898c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                return;
            default:
                wn wnVar2 = this.f39897b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.uv(wnVar2, wnVar2.getParentActivity(), wnVar2.f39454ea, this.f39898c).show();
                    wnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
