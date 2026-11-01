package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class uf implements View.OnClickListener {
    public final int f41932a;
    public final un f41933b;
    public final ArrayList f41934c;

    public uf(un unVar, ArrayList arrayList, int i10) {
        this.f41932a = i10;
        this.f41933b = unVar;
        this.f41934c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41932a) {
            case 0:
                un unVar = this.f41933b;
                si siVar = new si(unVar, unVar, unVar.getParentActivity(), unVar.f42288xa, this.f41934c);
                boolean O9 = unVar.O9();
                siVar.f21602h0 = O9;
                siVar.f21607n = O9;
                siVar.f21609o0 = false;
                unVar.M7(false);
                unVar.showDialog(siVar);
                return;
            default:
                un unVar2 = this.f41933b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.cv(unVar2, unVar2.getParentActivity(), unVar2.f42288xa, this.f41934c).show();
                    unVar2.M7(true);
                    return;
                }
                return;
        }
    }
}
