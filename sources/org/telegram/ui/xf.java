package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class xf implements View.OnClickListener {
    public final int f39912a;
    public final wn f39913b;
    public final ArrayList f39914c;

    public xf(wn wnVar, ArrayList arrayList, int i10) {
        this.f39912a = i10;
        this.f39913b = wnVar;
        this.f39914c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39912a) {
            case 0:
                wn wnVar = this.f39913b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39469ea, this.f39914c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                return;
            default:
                wn wnVar2 = this.f39913b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.tv(wnVar2, wnVar2.getParentActivity(), wnVar2.f39469ea, this.f39914c).show();
                    wnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
