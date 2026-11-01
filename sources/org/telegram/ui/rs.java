package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class rs extends zf.f1 {
    public final ContactsActivity K;

    public rs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f55502c = context;
        this.h = hVar;
        this.f55505r = z10;
        this.f55506s = z11;
        this.f55509y = 0;
        this.f55507w = z12;
        this.f55508x = true;
        zf.m1 m1Var = new zf.m1(true);
        this.f55503f = m1Var;
        m1Var.f55593a = new zf.d1(this);
    }

    @Override
    public final void F() {
        if (!this.D && !this.f55503f.e() && b() == 0) {
            this.K.f33289c.e(false, true);
        }
    }
}
