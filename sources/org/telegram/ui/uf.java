package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
public final class uf implements View.OnClickListener {
    public final int f42128a;
    public final un f42129b;
    public final ArrayList f42130c;

    public uf(un unVar, ArrayList arrayList, int i10) {
        this.f42128a = i10;
        this.f42129b = unVar;
        this.f42130c = arrayList;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42128a) {
            case 0:
                un unVar = this.f42129b;
                si siVar = new si(unVar, unVar, unVar.getParentActivity(), unVar.f42477xa, this.f42130c);
                boolean J9 = unVar.J9();
                siVar.f21601h0 = J9;
                siVar.f21606n = J9;
                siVar.f21608o0 = false;
                unVar.I7(false);
                unVar.showDialog(siVar);
                return;
            default:
                un unVar2 = this.f42129b;
                if (unVar2.getParentActivity() != null && unVar2.getParentActivity() != null) {
                    new org.telegram.ui.Components.cv(unVar2, unVar2.getParentActivity(), unVar2.f42477xa, this.f42130c).show();
                    unVar2.I7(true);
                    return;
                }
                return;
        }
    }
}
