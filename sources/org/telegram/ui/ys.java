package org.telegram.ui;

import android.content.Context;
public final class ys extends gg.e {
    public final ContactsActivity L;

    public ys(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.i iVar, int i11) {
        super(context, i10, z10, iVar, i11);
        this.L = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ys.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.L;
        org.telegram.ui.Components.qm0 qm0Var = contactsActivity.f33700f;
        if (qm0Var != null && qm0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.H) {
                org.telegram.ui.Components.qm0 qm0Var2 = contactsActivity.f33700f;
                if (h != 2) {
                    z10 = true;
                }
                qm0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.qm0 qm0Var3 = contactsActivity.f33700f;
            if (h != 0) {
                z10 = true;
            }
            qm0Var3.setFastScrollVisible(z10);
        }
    }
}
