package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class wx0 implements GenericProvider, org.telegram.ui.Components.cl0, x60 {
    public final zx0 f39124a;

    public wx0(zx0 zx0Var) {
        this.f39124a = zx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f39124a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        zx0 zx0Var = this.f39124a;
        if (i10 >= zx0Var.f40269r && i10 < zx0Var.f40270s) {
            if (zx0Var.f40273y == 1) {
                zx0Var.U(Long.valueOf(zx0Var.getMessagesController().blockePeers.keyAt(i10 - zx0Var.f40269r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        zx0 zx0Var = this.f39124a;
        zx0Var.getClass();
        if (((Integer) obj).intValue() != zx0Var.f40271w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19008p7, false)));
    }
}
