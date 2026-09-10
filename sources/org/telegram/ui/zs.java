package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zs extends org.telegram.ui.ActionBar.k {
    public final ContactsActivity f39436a;

    public zs(ContactsActivity contactsActivity) {
        this.f39436a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.l lVar;
        ContactsActivity contactsActivity = this.f39436a;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.p2) contactsActivity).actionBar;
            if (lVar.s()) {
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
            a0.i iVar = contactsActivity.f29853d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f17528a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ws(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.gp0(15));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f17528a;
            d2Var.show();
            d2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            bt btVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            btVar.Y(i12, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f29870s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f29855f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f24572r, new fj(this, 14));
        }
    }
}
