package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class zs extends gg.u1 {
    public final ContactsActivity K;

    public zs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f9942c = context;
        this.h = iVar;
        this.f9945r = z10;
        this.f9946s = z11;
        this.f9948x = 0;
        this.v = z12;
        this.f9947w = true;
        gg.c2 c2Var = new gg.c2(true);
        this.f9943f = c2Var;
        c2Var.f9685a = new gg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f9949y && !this.f9943f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
