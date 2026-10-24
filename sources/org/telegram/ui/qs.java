package org.telegram.ui;

import android.content.Context;
public final class qs extends hg.e {
    public final ContactsActivity L;

    public qs(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.L = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qs.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.L;
        org.telegram.ui.Components.lm0 lm0Var = contactsActivity.f33387f;
        if (lm0Var != null && lm0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.H) {
                org.telegram.ui.Components.lm0 lm0Var2 = contactsActivity.f33387f;
                if (h != 2) {
                    z10 = true;
                }
                lm0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.lm0 lm0Var3 = contactsActivity.f33387f;
            if (h != 0) {
                z10 = true;
            }
            lm0Var3.setFastScrollVisible(z10);
        }
    }
}
