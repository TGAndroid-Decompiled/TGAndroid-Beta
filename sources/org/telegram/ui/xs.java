package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class xs extends gg.u1 {
    public final ContactsActivity K;

    public xs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f10812e = new ArrayList();
        this.H = new ArrayList();
        this.f10811c = context;
        this.h = iVar;
        this.f10815r = z10;
        this.f10816s = z11;
        this.f10818x = 0;
        this.v = z12;
        this.f10817w = true;
        gg.c2 c2Var = new gg.c2(true);
        this.f10813f = c2Var;
        c2Var.f10532a = new gg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f10819y && !this.f10813f.e() && h() == 0) {
            this.K.f33708e.e(false, true);
        }
    }
}
