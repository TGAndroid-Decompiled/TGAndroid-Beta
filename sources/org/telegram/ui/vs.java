package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class vs extends gg.u1 {
    public final ContactsActivity K;

    public vs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f9929c = context;
        this.h = iVar;
        this.f9932r = z10;
        this.f9933s = z11;
        this.f9935x = 0;
        this.v = z12;
        this.f9934w = true;
        gg.c2 c2Var = new gg.c2(true);
        this.f9930f = c2Var;
        c2Var.f9672a = new gg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f9936y && !this.f9930f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
