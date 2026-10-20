package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f41453a;
    public final qn f41454b;
    public final ArrayList f41455c;

    public sf(qn qnVar, ArrayList arrayList, int i10) {
        this.f41453a = i10;
        this.f41454b = qnVar;
        this.f41455c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41453a) {
            case 0:
                qn qnVar = this.f41454b;
                hi hiVar = new hi(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f40673ea, this.f41455c);
                hiVar.setCalcMandatoryInsets(qnVar.C9());
                hiVar.setDimBehind(false);
                qnVar.D7(false);
                qnVar.showDialog(hiVar);
                return;
            default:
                qn qnVar2 = this.f41454b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(qnVar2, qnVar2.getParentActivity(), qnVar2.f40673ea, this.f41455c).show();
                    qnVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
