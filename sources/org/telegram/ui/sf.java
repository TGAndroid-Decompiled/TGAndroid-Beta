package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class sf implements View.OnClickListener {
    public final int f43493a;
    public final un f43494b;
    public final ArrayList f43495c;

    public sf(un unVar, ArrayList arrayList, int i10) {
        this.f43493a = i10;
        this.f43494b = unVar;
        this.f43495c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43493a) {
            case 0:
                un unVar = this.f43494b;
                ii iiVar = new ii(unVar, unVar, unVar.getParentActivity(), unVar.f44388qa, this.f43495c);
                iiVar.setCalcMandatoryInsets(unVar.F9());
                iiVar.setDimBehind(false);
                unVar.H7(false);
                unVar.showDialog(iiVar);
                return;
            default:
                un unVar2 = this.f43494b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.aw(unVar2, unVar2.getParentActivity(), unVar2.f44388qa, this.f43495c).show();
                    unVar2.H7(true);
                    return;
                }
                return;
        }
    }
}
