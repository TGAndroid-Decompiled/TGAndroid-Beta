package org.telegram.ui;

import android.content.Context;
public final class ws extends gg.e {
    public final ContactsActivity L;

    public ws(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.i iVar, int i11) {
        super(context, i10, z10, iVar, i11);
        this.L = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ws.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.L;
        org.telegram.ui.Components.ml0 ml0Var = contactsActivity.f30713f;
        if (ml0Var != null && ml0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.H) {
                org.telegram.ui.Components.ml0 ml0Var2 = contactsActivity.f30713f;
                if (h != 2) {
                    z10 = true;
                }
                ml0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.ml0 ml0Var3 = contactsActivity.f30713f;
            if (h != 0) {
                z10 = true;
            }
            ml0Var3.setFastScrollVisible(z10);
        }
    }
}
