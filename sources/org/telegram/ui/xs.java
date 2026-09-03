package org.telegram.ui;

import android.content.Context;
public final class xs extends uf.d {
    public final ContactsActivity I;

    public xs(ContactsActivity contactsActivity, Context context, int i10, boolean z4, a0.h hVar, int i11) {
        super(context, i10, z4, hVar, i11);
        this.I = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xs.R():int");
    }

    @Override
    public final void l() {
        boolean z4 = false;
        X(false);
        ContactsActivity contactsActivity = this.I;
        org.telegram.ui.Components.sl0 sl0Var = contactsActivity.f34060f;
        if (sl0Var != null && sl0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.E) {
                org.telegram.ui.Components.sl0 sl0Var2 = contactsActivity.f34060f;
                if (h != 2) {
                    z4 = true;
                }
                sl0Var2.setFastScrollVisible(z4);
                return;
            }
            org.telegram.ui.Components.sl0 sl0Var3 = contactsActivity.f34060f;
            if (h != 0) {
                z4 = true;
            }
            sl0Var3.setFastScrollVisible(z4);
        }
    }
}
