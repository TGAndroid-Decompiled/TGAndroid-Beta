package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ss extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f37858a;

    public ss(ContactsActivity contactsActivity) {
        this.f37858a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f37858a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.m2) contactsActivity).actionBar;
            if (kVar.s()) {
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
            a0.i iVar = contactsActivity.f31027d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f18662a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f18662a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f18662a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ps(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.e1(2));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f18662a;
            a2Var.show();
            a2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            us usVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            usVar.Y(i12, false);
            org.telegram.ui.ActionBar.u0 u0Var = contactsActivity.f31044s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            u0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f31029f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f23161r, new aj(this, 14));
        }
    }
}
