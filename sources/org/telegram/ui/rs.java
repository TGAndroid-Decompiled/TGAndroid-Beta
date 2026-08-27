package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ContactsController;

public final class rs extends pf.d {
    public final ContactsActivity H;

    public rs(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.H = contactsActivity;
    }

    @Override
    public final int R() {
        int size;
        boolean z10;
        boolean zIsEmpty;
        boolean z11 = false;
        this.E = false;
        int i10 = this.B;
        int i11 = this.f45761r;
        int i12 = this.v;
        int i13 = 1;
        if (i10 != 2) {
            size = (i12 == 2 ? ContactsController.getInstance(i11).sortedUsersMutualSectionsArray : ContactsController.getInstance(i11).sortedUsersSectionsArray).size();
            if (size == 0) {
                this.E = true;
            }
            if (i12 == 0) {
                size++;
            }
            z10 = this.A;
            if (z10) {
                size++;
            }
            zIsEmpty = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
            this.F = !zIsEmpty;
            if (this.E && this.f45763w && !z10 && i12 == 0) {
                z11 = true;
            }
            this.G = z11;
            if (z11) {
                i13 = size;
            } else if (!zIsEmpty) {
                i13 = 2;
            }
            ContactsActivity contactsActivity = this.H;
            ContactsActivity.e0(contactsActivity);
            contactsActivity.m0();
            contactsActivity.l0();
            return i13;
        }
        this.E = this.f45765y.isEmpty();
        size = 1;
        if (i12 == 0) {
            size++;
        }
        z10 = this.A;
        if (z10) {
            size++;
        }
        zIsEmpty = ContactsController.getInstance(i11).phoneBookContacts.isEmpty();
        this.F = !zIsEmpty;
        if (this.E) {
            z11 = true;
        }
        this.G = z11;
        if (z11) {
            i13 = size;
        } else if (!zIsEmpty) {
            i13 = 2;
        }
        ContactsActivity contactsActivity2 = this.H;
        ContactsActivity.e0(contactsActivity2);
        contactsActivity2.m0();
        contactsActivity2.l0();
        return i13;
    }

    @Override
    public final void l() {
        X(false);
        ContactsActivity contactsActivity = this.H;
        org.telegram.ui.Components.zk0 zk0Var = contactsActivity.f35423f;
        if (zk0Var == null || zk0Var.getAdapter() != this) {
            return;
        }
        int iH = h();
        if (contactsActivity.D) {
            contactsActivity.f35423f.setFastScrollVisible(iH != 2);
        } else {
            contactsActivity.f35423f.setFastScrollVisible(iH != 0);
        }
    }
}
