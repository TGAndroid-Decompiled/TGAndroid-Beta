package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ur extends jg.s1 {
    public final ContactsActivity L;

    public ur(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.f17679e = new ArrayList();
        this.I = new ArrayList();
        this.f17678c = context;
        this.h = hVar;
        this.f17682r = z10;
        this.f17683s = z11;
        this.f17686y = 0;
        this.f17684w = z12;
        this.f17685x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f17680f = z1Var;
        z1Var.f17755a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f17680f.e() && b() == 0) {
            this.L.f43024c.e(false, true);
        }
    }
}
