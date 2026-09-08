package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class zs extends hg.u1 {
    public final ContactsActivity K;

    public zs(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f11296e = new ArrayList();
        this.H = new ArrayList();
        this.f11295c = context;
        this.h = iVar;
        this.f11299r = z10;
        this.f11300s = z11;
        this.f11302x = 0;
        this.v = z12;
        this.f11301w = true;
        hg.b2 b2Var = new hg.b2(true);
        this.f11297f = b2Var;
        b2Var.f11005a = new hg.r1(this);
    }

    @Override
    public final void F() {
        if (!this.f11303y && !this.f11297f.e() && h() == 0) {
            this.K.f33371e.e(false, true);
        }
    }
}
