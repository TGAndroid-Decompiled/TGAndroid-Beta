package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vs extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f43132a;

    public vs(ContactsActivity contactsActivity) {
        this.f43132a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f43132a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
            if (kVar.t()) {
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
            a0.i iVar = contactsActivity.f33725d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f20368a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ss(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.ae0(26));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            xs xsVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            xsVar.Y(i12, false);
            org.telegram.ui.ActionBar.u0 u0Var = contactsActivity.f33743s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            u0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f33728f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f30964r, new cj(this, 15));
        }
    }
}
