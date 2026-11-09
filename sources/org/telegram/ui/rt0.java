package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
public final class rt0 implements org.telegram.messenger.k9, org.telegram.ui.Components.ej0, u40 {
    public final ut0 f49602a;

    public rt0(ut0 ut0Var) {
        this.f49602a = ut0Var;
    }

    @Override
    public void a(ArrayList arrayList, boolean z9, boolean z10) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            this.f49602a.a0();
        } else {
            Long l10 = (Long) it.next();
            throw null;
        }
    }

    @Override
    public boolean c(int i7, View view) {
        ut0 ut0Var = this.f49602a;
        if (i7 >= ut0Var.f50465r && i7 < ut0Var.f50466s) {
            if (ut0Var.D == 1) {
                ut0Var.Z(Long.valueOf(ut0Var.getMessagesController().G0.keyAt(i7 - ut0Var.f50465r)), view);
                return true;
            }
            throw null;
        }
        return false;
    }

    @Override
    public Object j(Object obj) {
        ut0 ut0Var = this.f49602a;
        ut0Var.getClass();
        if (((Integer) obj).intValue() != ut0Var.f50468x) {
            return null;
        }
        return Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.12f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28086p7, false)));
    }
}
