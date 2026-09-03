package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class qx0 implements GenericProvider, org.telegram.ui.Components.jl0, w60 {
    public final tx0 f37516a;

    public qx0(tx0 tx0Var) {
        this.f37516a = tx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f37516a.V();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        tx0 tx0Var = this.f37516a;
        if (i10 >= tx0Var.f38608r && i10 < tx0Var.f38609s) {
            if (tx0Var.f38612y == 1) {
                tx0Var.U(Long.valueOf(tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f38608r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        tx0 tx0Var = this.f37516a;
        tx0Var.getClass();
        if (((Integer) obj).intValue() != tx0Var.f38610w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.j6.l1(0.12f, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20097p7, false)));
    }
}
