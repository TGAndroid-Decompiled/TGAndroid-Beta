package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ws extends uf.c1 {
    public final ContactsActivity H;

    public ws(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.f48556e = new ArrayList();
        this.E = new ArrayList();
        this.f48555c = context;
        this.h = hVar;
        this.f48559r = z4;
        this.f48560s = z10;
        this.f48562x = 0;
        this.v = z11;
        this.f48561w = true;
        uf.k1 k1Var = new uf.k1(true);
        this.f48557f = k1Var;
        k1Var.f48654a = new uf.a1(this);
    }

    @Override
    public final void F() {
        if (!this.f48563y && !this.f48557f.e() && h() == 0) {
            this.H.f34058e.e(false, true);
        }
    }
}
