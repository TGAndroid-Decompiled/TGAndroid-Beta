package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ur extends jg.s1 {
    public final ContactsActivity L;

    public ur(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.f17654e = new ArrayList();
        this.I = new ArrayList();
        this.f17653c = context;
        this.h = hVar;
        this.f17657r = z10;
        this.f17658s = z11;
        this.f17661y = 0;
        this.f17659w = z12;
        this.f17660x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f17655f = z1Var;
        z1Var.f17730a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f17655f.e() && b() == 0) {
            this.L.f42980c.e(false, true);
        }
    }
}
