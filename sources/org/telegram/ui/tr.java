package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class tr extends jg.s1 {
    public final ContactsActivity K;

    public tr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z9, boolean z10, boolean z11) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f16917e = new ArrayList();
        this.H = new ArrayList();
        this.f16916c = context;
        this.h = hVar;
        this.f16920r = z9;
        this.f16921s = z10;
        this.f16924y = 0;
        this.f16922w = z11;
        this.f16923x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f16918f = z1Var;
        z1Var.f16992a = new jg.p1(this);
    }

    @Override
    public final void F() {
        if (!this.D && !this.f16918f.e() && b() == 0) {
            this.K.f41190c.e(false, true);
        }
    }
}
