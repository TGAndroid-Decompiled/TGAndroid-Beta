package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class xs extends gg.t1 {
    public final ContactsActivity K;

    public xs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f10814e = new ArrayList();
        this.H = new ArrayList();
        this.f10813c = context;
        this.h = iVar;
        this.f10817r = z10;
        this.f10818s = z11;
        this.f10820x = 0;
        this.v = z12;
        this.f10819w = true;
        gg.b2 b2Var = new gg.b2(true);
        this.f10815f = b2Var;
        b2Var.f10532a = new gg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f10821y && !this.f10815f.e() && h() == 0) {
            this.K.f33736e.e(false, true);
        }
    }
}
