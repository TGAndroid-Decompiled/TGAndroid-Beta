package org.telegram.ui;

import android.content.Context;
public final class vr extends jg.e {
    public final ContactsActivity P;

    public vr(ContactsActivity contactsActivity, Context context, int i7, boolean z10, a0.h hVar, int i10) {
        super(context, i7, z10, hVar, i10);
        this.P = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.vr.R():int");
    }

    @Override
    public final void f() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.P;
        org.telegram.ui.Components.ck0 ck0Var = contactsActivity.d;
        if (ck0Var != null && ck0Var.getAdapter() == this) {
            int b10 = b();
            if (contactsActivity.G) {
                org.telegram.ui.Components.ck0 ck0Var2 = contactsActivity.d;
                if (b10 != 2) {
                    z10 = true;
                }
                ck0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.ck0 ck0Var3 = contactsActivity.d;
            if (b10 != 0) {
                z10 = true;
            }
            ck0Var3.setFastScrollVisible(z10);
        }
    }
}
