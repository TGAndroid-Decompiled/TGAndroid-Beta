package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.GenericProvider;
public final class vx0 implements GenericProvider, org.telegram.ui.Components.ml0, v60 {
    public final yx0 f38847a;

    public vx0(yx0 yx0Var) {
        this.f38847a = yx0Var;
    }

    @Override
    public void b(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f38847a.V();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean d(int i10, View view) {
        yx0 yx0Var = this.f38847a;
        if (i10 >= yx0Var.f40274r && i10 < yx0Var.f40275s) {
            if (yx0Var.f40278y == 1) {
                yx0Var.U(Long.valueOf(yx0Var.getMessagesController().blockePeers.keyAt(i10 - yx0Var.f40274r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object provide(Object obj) {
        yx0 yx0Var = this.f38847a;
        yx0Var.getClass();
        if (((Integer) obj).intValue() != yx0Var.f40276w) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.h6.l1(0.12f, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19280p7, false)));
    }
}
