package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class vs extends tf.c1 {
    public final ContactsActivity H;

    public vs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = new ArrayList();
        this.f44679c = context;
        this.h = hVar;
        this.f44682r = z4;
        this.f44683s = z10;
        this.f44685x = 0;
        this.v = z11;
        this.f44684w = true;
        tf.k1 k1Var = new tf.k1(true);
        this.f44680f = k1Var;
        k1Var.f44769a = new tf.a1(this);
    }

    @Override
    public final void F() {
        if (!this.f44686y && !this.f44680f.e() && h() == 0) {
            this.H.e.e(false, true);
        }
    }
}
