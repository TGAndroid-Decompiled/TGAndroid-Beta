package org.telegram.ui;

import android.content.Context;
public final class ur extends jg.e {
    public final ContactsActivity O;

    public ur(ContactsActivity contactsActivity, Context context, int i7, boolean z9, a0.h hVar, int i10) {
        super(context, i7, z9, hVar, i10);
        this.O = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ur.R():int");
    }

    @Override
    public final void f() {
        boolean z9 = false;
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.qj0 qj0Var = contactsActivity.d;
        if (qj0Var != null && qj0Var.getAdapter() == this) {
            int b10 = b();
            if (contactsActivity.F) {
                org.telegram.ui.Components.qj0 qj0Var2 = contactsActivity.d;
                if (b10 != 2) {
                    z9 = true;
                }
                qj0Var2.setFastScrollVisible(z9);
                return;
            }
            org.telegram.ui.Components.qj0 qj0Var3 = contactsActivity.d;
            if (b10 != 0) {
                z9 = true;
            }
            qj0Var3.setFastScrollVisible(z9);
        }
    }
}
