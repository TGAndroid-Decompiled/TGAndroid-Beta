package org.telegram.ui;

import android.content.Context;
public final class ss extends zf.d {
    public final ContactsActivity O;

    public ss(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.O = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ss.R():int");
    }

    @Override
    public final void f() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.uk0 uk0Var = contactsActivity.d;
        if (uk0Var != null && uk0Var.getAdapter() == this) {
            int b10 = b();
            if (contactsActivity.F) {
                org.telegram.ui.Components.uk0 uk0Var2 = contactsActivity.d;
                if (b10 != 2) {
                    z10 = true;
                }
                uk0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.uk0 uk0Var3 = contactsActivity.d;
            if (b10 != 0) {
                z10 = true;
            }
            uk0Var3.setFastScrollVisible(z10);
        }
    }
}
