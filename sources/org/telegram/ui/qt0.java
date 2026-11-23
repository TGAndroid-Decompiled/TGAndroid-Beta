package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class qt0 implements org.telegram.messenger.j9, org.telegram.ui.Components.sj0, v40 {
    public final tt0 f51321a;

    public qt0(tt0 tt0Var) {
        this.f51321a = tt0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f51321a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        tt0 tt0Var = this.f51321a;
        if (i7 >= tt0Var.f52358r && i7 < tt0Var.f52359s) {
            if (tt0Var.E == 1) {
                tt0Var.Z(Long.valueOf(tt0Var.getMessagesController().H0.keyAt(i7 - tt0Var.f52358r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object m(Object obj) {
        tt0 tt0Var = this.f51321a;
        tt0Var.getClass();
        if (((Integer) obj).intValue() != tt0Var.f52361x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29568p7, false)));
    }
}
