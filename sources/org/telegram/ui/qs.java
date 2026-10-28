package org.telegram.ui;

import android.content.Context;
public final class qs extends ig.e {
    public final ContactsActivity O;

    public qs(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.O = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.nm0 nm0Var = contactsActivity.d;
        if (nm0Var != null && nm0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.F) {
                org.telegram.ui.Components.nm0 nm0Var2 = contactsActivity.d;
                if (h != 2) {
                    z10 = true;
                }
                nm0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.nm0 nm0Var3 = contactsActivity.d;
            if (h != 0) {
                z10 = true;
            }
            nm0Var3.setFastScrollVisible(z10);
        }
    }
}
