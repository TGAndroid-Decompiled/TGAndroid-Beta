package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class rr extends jg.s1 {
    public final ContactsActivity K;

    public rr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z9, boolean z10, boolean z11) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f16914e = new ArrayList();
        this.H = new ArrayList();
        this.f16913c = context;
        this.h = hVar;
        this.f16917r = z9;
        this.f16918s = z10;
        this.f16921y = 0;
        this.f16919w = z11;
        this.f16920x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f16915f = z1Var;
        z1Var.f16989a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.D && !this.f16915f.e() && b() == 0) {
            this.K.f41155c.e(false, true);
        }
    }
}
