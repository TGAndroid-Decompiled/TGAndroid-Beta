package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class xf implements View.OnClickListener {
    public final int f39911a;
    public final wn f39912b;
    public final ArrayList f39913c;

    public xf(wn wnVar, ArrayList arrayList, int i10) {
        this.f39911a = i10;
        this.f39912b = wnVar;
        this.f39913c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39911a) {
            case 0:
                wn wnVar = this.f39912b;
                mi miVar = new mi(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f39468ea, this.f39913c);
                miVar.setCalcMandatoryInsets(wnVar.x9());
                miVar.setDimBehind(false);
                wnVar.A7(false);
                wnVar.showDialog(miVar);
                return;
            default:
                wn wnVar2 = this.f39912b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.uv(wnVar2, wnVar2.getParentActivity(), wnVar2.f39468ea, this.f39913c).show();
                    wnVar2.A7(true);
                    return;
                }
                return;
        }
    }
}
