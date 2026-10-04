package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class xs extends gg.u1 {
    public final ContactsActivity K;

    public xs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f10811e = new ArrayList();
        this.H = new ArrayList();
        this.f10810c = context;
        this.h = iVar;
        this.f10814r = z10;
        this.f10815s = z11;
        this.f10817x = 0;
        this.v = z12;
        this.f10816w = true;
        gg.c2 c2Var = new gg.c2(true);
        this.f10812f = c2Var;
        c2Var.f10531a = new gg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f10818y && !this.f10812f.e() && h() == 0) {
            this.K.f33689e.e(false, true);
        }
    }
}
