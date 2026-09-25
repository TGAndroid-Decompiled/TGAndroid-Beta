package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class xf implements View.OnClickListener {
    public final int f39913a;
    public final wn f39914b;
    public final ArrayList f39915c;

    public xf(wn wnVar, ArrayList arrayList, int i10) {
        this.f39913a = i10;
        this.f39914b = wnVar;
        this.f39915c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39913a) {
            case 0:
                wn wnVar = this.f39914b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39470ea, this.f39915c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                return;
            default:
                wn wnVar2 = this.f39914b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(wnVar2, wnVar2.getParentActivity(), wnVar2.f39470ea, this.f39915c).show();
                    wnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
