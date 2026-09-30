package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class xf implements View.OnClickListener {
    public final int f40010a;
    public final wn f40011b;
    public final ArrayList f40012c;

    public xf(wn wnVar, ArrayList arrayList, int i10) {
        this.f40010a = i10;
        this.f40011b = wnVar;
        this.f40012c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40010a) {
            case 0:
                wn wnVar = this.f40011b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39562ea, this.f40012c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                return;
            default:
                wn wnVar2 = this.f40011b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.vv(wnVar2, wnVar2.getParentActivity(), wnVar2.f39562ea, this.f40012c).show();
                    wnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
