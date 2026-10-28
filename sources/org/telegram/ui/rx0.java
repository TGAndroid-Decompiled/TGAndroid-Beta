package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class rx0 implements GenericProvider, org.telegram.ui.Components.cm0, p60 {
    public final ux0 f43188a;

    public rx0(ux0 ux0Var) {
        this.f43188a = ux0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f43188a.W();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i10, View view) {
        ux0 ux0Var = this.f43188a;
        if (i10 >= ux0Var.f44135r && i10 < ux0Var.f44136s) {
            if (ux0Var.f44139y == 1) {
                ux0Var.V(Long.valueOf(ux0Var.getMessagesController().blockePeers.keyAt(i10 - ux0Var.f44135r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        ux0 ux0Var = this.f43188a;
        ux0Var.getClass();
        if (((Integer) obj).intValue() != ux0Var.f44137w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.y6.o1(0.12f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23582p7, false)));
    }
}
