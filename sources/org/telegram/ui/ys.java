package org.telegram.ui;

import android.content.Context;
public final class ys extends tf.d {
    public final ContactsActivity I;

    public ys(ContactsActivity contactsActivity, Context context, int i10, boolean z4, a0.h hVar, int i11) {
        super(context, i10, z4, hVar, i11);
        this.I = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ys.R():int");
    }

    @Override
    public final void l() {
        boolean z4 = false;
        X(false);
        ContactsActivity contactsActivity = this.I;
        org.telegram.ui.Components.rl0 rl0Var = contactsActivity.f31517f;
        if (rl0Var != null && rl0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.E) {
                org.telegram.ui.Components.rl0 rl0Var2 = contactsActivity.f31517f;
                if (h != 2) {
                    z4 = true;
                }
                rl0Var2.setFastScrollVisible(z4);
                return;
            }
            org.telegram.ui.Components.rl0 rl0Var3 = contactsActivity.f31517f;
            if (h != 0) {
                z4 = true;
            }
            rl0Var3.setFastScrollVisible(z4);
        }
    }
}
