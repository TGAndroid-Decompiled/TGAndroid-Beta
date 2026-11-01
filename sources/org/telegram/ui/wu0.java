package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class wu0 implements org.telegram.messenger.m9, org.telegram.ui.Components.jk0, q50 {
    public final zu0 f43170a;

    public wu0(zu0 zu0Var) {
        this.f43170a = zu0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f43170a.a0();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        zu0 zu0Var = this.f43170a;
        if (i10 >= zu0Var.f44099r && i10 < zu0Var.f44100s) {
            if (zu0Var.D == 1) {
                zu0Var.Z(Long.valueOf(zu0Var.getMessagesController().G0.keyAt(i10 - zu0Var.f44099r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object l(Object obj) {
        zu0 zu0Var = this.f43170a;
        zu0Var.getClass();
        if (((Integer) obj).intValue() != zu0Var.f44102x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21154p7, false)));
    }
}
