package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class xs extends tf.c1 {
    public final ContactsActivity H;

    public xs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = new ArrayList();
        this.f44741c = context;
        this.h = hVar;
        this.f44744r = z4;
        this.f44745s = z10;
        this.f44747x = 0;
        this.v = z11;
        this.f44746w = true;
        tf.j1 j1Var = new tf.j1(true);
        this.f44742f = j1Var;
        j1Var.f44819a = new tf.a1(this);
    }

    @Override
    public final void F() {
        if (!this.f44748y && !this.f44742f.e() && h() == 0) {
            this.H.e.e(false, true);
        }
    }
}
