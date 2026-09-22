package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ys extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f40027a;

    public ys(ContactsActivity contactsActivity) {
        this.f40027a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f40027a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
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
            a0.i iVar = contactsActivity.f31045d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f18669a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vs(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.lg0(21));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f18669a;
            b2Var.show();
            b2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            at atVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            atVar.Y(i12, false);
            org.telegram.ui.ActionBar.v0 v0Var = contactsActivity.f31062s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            v0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f31047f.y0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f22811r, new dj(this, 14));
        }
    }
}
