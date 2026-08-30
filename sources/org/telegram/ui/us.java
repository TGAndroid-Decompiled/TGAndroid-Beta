package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class us extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f38993a;

    public us(ContactsActivity contactsActivity) {
        this.f38993a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f38993a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
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
            a0.h hVar = contactsActivity.f31536a0;
            if (hVar.m() == 1) {
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f19503a.O = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new rs(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.kh0(18));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19503a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z4 = SharedConfig.sortContactsByName;
            contactsActivity.v = z4;
            ws wsVar = contactsActivity.d;
            if (!z4) {
                i12 = 2;
            }
            wsVar.Y(i12, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f31558s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f31543f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.W.f23815r, new zi(this, 14));
        }
    }
}
