package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class zs extends hg.u1 {
    public final ContactsActivity K;

    public zs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f11270e = new ArrayList();
        this.H = new ArrayList();
        this.f11269c = context;
        this.h = iVar;
        this.f11273r = z10;
        this.f11274s = z11;
        this.f11276x = 0;
        this.v = z12;
        this.f11275w = true;
        hg.b2 b2Var = new hg.b2(true);
        this.f11271f = b2Var;
        b2Var.f10979a = new hg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f11277y && !this.f11271f.e() && h() == 0) {
            this.K.f33344e.e(false, true);
        }
    }
}
