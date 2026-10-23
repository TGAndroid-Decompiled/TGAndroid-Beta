package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f41398a;
    public final sn f41399b;
    public final ArrayList f41400c;

    public sf(sn snVar, ArrayList arrayList, int i10) {
        this.f41398a = i10;
        this.f41399b = snVar;
        this.f41400c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41398a) {
            case 0:
                sn snVar = this.f41399b;
                hi hiVar = new hi(snVar, snVar, snVar.getParentActivity(), snVar.f41654qa, this.f41400c);
                hiVar.setCalcMandatoryInsets(snVar.C9());
                hiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(hiVar);
                return;
            default:
                sn snVar2 = this.f41399b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(snVar2, snVar2.getParentActivity(), snVar2.f41654qa, this.f41400c).show();
                    snVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
