package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class st0 implements org.telegram.messenger.k9, org.telegram.ui.Components.dj0, v40 {
    public final vt0 f49956a;

    public st0(vt0 vt0Var) {
        this.f49956a = vt0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f49956a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        vt0 vt0Var = this.f49956a;
        if (i7 >= vt0Var.f50794r && i7 < vt0Var.f50795s) {
            if (vt0Var.D == 1) {
                vt0Var.Z(Long.valueOf(vt0Var.getMessagesController().G0.keyAt(i7 - vt0Var.f50794r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object j(Object obj) {
        vt0 vt0Var = this.f49956a;
        vt0Var.getClass();
        if (((Integer) obj).intValue() != vt0Var.f50797x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28111p7, false)));
    }
}
