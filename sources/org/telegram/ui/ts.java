package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ts extends s4.s0 {
    public boolean f41721a;
    public boolean f41722b;
    public final ContactsActivity f41723c;

    public ts(ContactsActivity contactsActivity) {
        this.f41723c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f41723c;
            if (contactsActivity.D && contactsActivity.f33307y) {
                org.telegram.messenger.i0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f41722b = true;
            return;
        }
        this.f41722b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ContactsActivity contactsActivity = this.f41723c;
        if (contactsActivity.f33304s != null && !contactsActivity.D) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f41721a && (z10 || this.f41722b)) {
                contactsActivity.f33305w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f41721a = true;
        }
    }
}
