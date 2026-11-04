package org.telegram.ui;

import android.content.Context;
public final class qr extends kg.e {
    public final ContactsActivity P;

    public qr(ContactsActivity contactsActivity, Context context, int i3, boolean z10, a0.h hVar, int i10) {
        super(context, i3, z10, hVar, i10);
        this.P = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qr.R():int");
    }

    @Override
    public final void f() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.P;
        org.telegram.ui.Components.tj0 tj0Var = contactsActivity.d;
        if (tj0Var != null && tj0Var.getAdapter() == this) {
            int b10 = b();
            if (contactsActivity.G) {
                org.telegram.ui.Components.tj0 tj0Var2 = contactsActivity.d;
                if (b10 != 2) {
                    z10 = true;
                }
                tj0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.tj0 tj0Var3 = contactsActivity.d;
            if (b10 != 0) {
                z10 = true;
            }
            tj0Var3.setFastScrollVisible(z10);
        }
    }
}
