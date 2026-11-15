package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ur extends jg.s1 {
    public final ContactsActivity L;

    public ur(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.f17268e = new ArrayList();
        this.I = new ArrayList();
        this.f17267c = context;
        this.h = hVar;
        this.f17271r = z10;
        this.f17272s = z11;
        this.f17275y = 0;
        this.f17273w = z12;
        this.f17274x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f17269f = z1Var;
        z1Var.f17344a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f17269f.e() && b() == 0) {
            this.L.f42536c.e(false, true);
        }
    }
}
