package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f41447a;
    public final qn f41448b;
    public final ArrayList f41449c;

    public sf(qn qnVar, ArrayList arrayList, int i10) {
        this.f41447a = i10;
        this.f41448b = qnVar;
        this.f41449c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41447a) {
            case 0:
                qn qnVar = this.f41448b;
                hi hiVar = new hi(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f40667ea, this.f41449c);
                hiVar.setCalcMandatoryInsets(qnVar.C9());
                hiVar.setDimBehind(false);
                qnVar.D7(false);
                qnVar.showDialog(hiVar);
                return;
            default:
                qn qnVar2 = this.f41448b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(qnVar2, qnVar2.getParentActivity(), qnVar2.f40667ea, this.f41449c).show();
                    qnVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
