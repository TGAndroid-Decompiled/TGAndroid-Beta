package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class qx0 implements GenericProvider, org.telegram.ui.Components.kl0, v60 {
    public final tx0 f40710a;

    public qx0(tx0 tx0Var) {
        this.f40710a = tx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z4, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f40710a.V();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        tx0 tx0Var = this.f40710a;
        if (i10 >= tx0Var.f41655r && i10 < tx0Var.f41656s) {
            if (tx0Var.f41659y == 1) {
                tx0Var.U(Long.valueOf(tx0Var.getMessagesController().blockePeers.keyAt(i10 - tx0Var.f41655r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        tx0 tx0Var = this.f40710a;
        tx0Var.getClass();
        if (((Integer) obj).intValue() != tx0Var.f41657w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.k6.l1(0.12f, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21878p7, false)));
    }
}
