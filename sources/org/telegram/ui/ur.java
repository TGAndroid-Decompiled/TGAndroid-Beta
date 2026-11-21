package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ur extends jg.s1 {
    public final ContactsActivity L;

    public ur(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.f17676e = new ArrayList();
        this.I = new ArrayList();
        this.f17675c = context;
        this.h = hVar;
        this.f17679r = z10;
        this.f17680s = z11;
        this.f17683y = 0;
        this.f17681w = z12;
        this.f17682x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f17677f = z1Var;
        z1Var.f17752a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f17677f.e() && b() == 0) {
            this.L.f43021c.e(false, true);
        }
    }
}
