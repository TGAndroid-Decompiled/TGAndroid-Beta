package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class rf implements View.OnClickListener {
    public final int f42978a;
    public final wn f42979b;
    public final ArrayList f42980c;

    public rf(wn wnVar, ArrayList arrayList, int i10) {
        this.f42978a = i10;
        this.f42979b = wnVar;
        this.f42980c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42978a) {
            case 0:
                wn wnVar = this.f42979b;
                li liVar = new li(wnVar, wnVar, wnVar.getParentActivity(), wnVar.f45309ua, this.f42980c);
                liVar.setCalcMandatoryInsets(wnVar.I9());
                liVar.setDimBehind(false);
                wnVar.J7(false);
                wnVar.showDialog(liVar);
                return;
            default:
                wn wnVar2 = this.f42979b;
                if (wnVar2.getParentActivity() != null && wnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(wnVar2, wnVar2.getParentActivity(), wnVar2.f45309ua, this.f42980c).show();
                    wnVar2.J7(true);
                    return;
                }
                return;
        }
    }
}
