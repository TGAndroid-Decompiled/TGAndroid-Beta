package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ws extends gg.t1 {
    public final ContactsActivity K;

    public ws(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f10813e = new ArrayList();
        this.H = new ArrayList();
        this.f10812c = context;
        this.h = iVar;
        this.f10816r = z10;
        this.f10817s = z11;
        this.f10819x = 0;
        this.v = z12;
        this.f10818w = true;
        gg.b2 b2Var = new gg.b2(true);
        this.f10814f = b2Var;
        b2Var.f10531a = new gg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f10820y && !this.f10814f.e() && h() == 0) {
            this.K.f33760e.e(false, true);
        }
    }
}
