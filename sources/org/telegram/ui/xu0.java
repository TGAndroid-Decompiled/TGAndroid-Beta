package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class xu0 implements org.telegram.messenger.l9, org.telegram.ui.Components.ik0, r50 {
    public final av0 f43654a;

    public xu0(av0 av0Var) {
        this.f43654a = av0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z10, boolean z11) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f43654a.Z();
        } else {
            Long l4 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean f(int i10, View view) {
        av0 av0Var = this.f43654a;
        if (i10 >= av0Var.f35756r && i10 < av0Var.f35757s) {
            if (av0Var.D == 1) {
                av0Var.Y(Long.valueOf(av0Var.getMessagesController().G0.keyAt(i10 - av0Var.f35756r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object l(Object obj) {
        av0 av0Var = this.f43654a;
        av0Var.getClass();
        if (((Integer) obj).intValue() != av0Var.f35759x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.t6.r1(0.12f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21153p7, false)));
    }
}
