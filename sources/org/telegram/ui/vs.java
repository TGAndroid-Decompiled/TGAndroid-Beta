package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vs extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f38697a;

    public vs(ContactsActivity contactsActivity) {
        this.f38697a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.l lVar;
        ContactsActivity contactsActivity = this.f38697a;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (lVar.t()) {
                contactsActivity.o0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        int i12 = 1;
        if (i10 == 100) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
            a0.i iVar = contactsActivity.f31028d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f18655a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f18655a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ss(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(3));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            xs xsVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            xsVar.Y(i12, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f31045s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f31030f.y0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f23850r, new cj(this, 14));
        }
    }
}
