package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.u0 {
    public boolean f53510a;
    public boolean f53511b;
    public final ContactsActivity f53512c;

    public wr(ContactsActivity contactsActivity) {
        this.f53512c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f53512c;
            if (contactsActivity.E && contactsActivity.f43041y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f53511b = true;
            return;
        }
        this.f53511b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f53512c;
        if (contactsActivity.f43038s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f53510a && (z10 || this.f53511b)) {
                contactsActivity.f43039w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f53510a = true;
        }
    }
}
