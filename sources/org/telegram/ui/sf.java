package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f41456a;
    public final qn f41457b;
    public final ArrayList f41458c;

    public sf(qn qnVar, ArrayList arrayList, int i10) {
        this.f41456a = i10;
        this.f41457b = qnVar;
        this.f41458c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41456a) {
            case 0:
                qn qnVar = this.f41457b;
                hi hiVar = new hi(qnVar, qnVar, qnVar.getParentActivity(), qnVar.f40676ea, this.f41458c);
                hiVar.setCalcMandatoryInsets(qnVar.C9());
                hiVar.setDimBehind(false);
                qnVar.D7(false);
                qnVar.showDialog(hiVar);
                return;
            default:
                qn qnVar2 = this.f41457b;
                if (qnVar2.getParentActivity() != null && qnVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(qnVar2, qnVar2.getParentActivity(), qnVar2.f40676ea, this.f41458c).show();
                    qnVar2.D7(true);
                    return;
                }
                return;
        }
    }
}
