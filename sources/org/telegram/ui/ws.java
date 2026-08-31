package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ws extends uf.c1 {
    public final ContactsActivity H;

    public ws(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.f48520e = new ArrayList();
        this.E = new ArrayList();
        this.f48519c = context;
        this.h = hVar;
        this.f48523r = z4;
        this.f48524s = z10;
        this.f48526x = 0;
        this.v = z11;
        this.f48525w = true;
        uf.k1 k1Var = new uf.k1(true);
        this.f48521f = k1Var;
        k1Var.f48618a = new uf.a1(this);
    }

    @Override
    public final void F() {
        if (!this.f48527y && !this.f48521f.e() && h() == 0) {
            this.H.f34058e.e(false, true);
        }
    }
}
