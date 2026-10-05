package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class yx0 implements GenericProvider, org.telegram.ui.Components.ol0, z60 {
    public final by0 f43647a;

    public yx0(by0 by0Var) {
        this.f43647a = by0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f43647a.T();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        by0 by0Var = this.f43647a;
        if (i10 >= by0Var.f35240r && i10 < by0Var.f35241s) {
            if (by0Var.f35244y == 1) {
                by0Var.S(Long.valueOf(by0Var.getMessagesController().blockePeers.keyAt(i10 - by0Var.f35240r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        by0 by0Var = this.f43647a;
        by0Var.getClass();
        if (((Integer) obj).intValue() != by0Var.f35242w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.i6.l1(0.12f, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21049p7, false)));
    }
}
