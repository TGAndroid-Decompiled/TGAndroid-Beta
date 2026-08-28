package org.telegram.ui;

import android.content.Context;
public final class qs extends of.e {
    public final ContactsActivity H;

    public qs(ContactsActivity contactsActivity, Context context, int i9, boolean z10, a0.h hVar, int i10) {
        super(context, i9, z10, hVar, i10);
        this.H = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.H;
        org.telegram.ui.Components.wk0 wk0Var = contactsActivity.f35420f;
        if (wk0Var != null && wk0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.D) {
                org.telegram.ui.Components.wk0 wk0Var2 = contactsActivity.f35420f;
                if (h != 2) {
                    z10 = true;
                }
                wk0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.wk0 wk0Var3 = contactsActivity.f35420f;
            if (h != 0) {
                z10 = true;
            }
            wk0Var3.setFastScrollVisible(z10);
        }
    }
}
