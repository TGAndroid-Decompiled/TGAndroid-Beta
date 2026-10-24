package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f41385a;
    public final sn f41386b;
    public final ArrayList f41387c;

    public sf(sn snVar, ArrayList arrayList, int i10) {
        this.f41385a = i10;
        this.f41386b = snVar;
        this.f41387c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41385a) {
            case 0:
                sn snVar = this.f41386b;
                hi hiVar = new hi(snVar, snVar, snVar.getParentActivity(), snVar.f41651qa, this.f41387c);
                hiVar.setCalcMandatoryInsets(snVar.C9());
                hiVar.setDimBehind(false);
                snVar.D7(false);
                snVar.showDialog(hiVar);
                return;
            default:
                sn snVar2 = this.f41386b;
                if (snVar2.getParentActivity() != null && snVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.yv(snVar2, snVar2.getParentActivity(), snVar2.f41651qa, this.f41387c).show();
                    snVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
