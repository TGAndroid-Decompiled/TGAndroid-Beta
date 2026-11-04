package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class rr extends u4.t0 {
    public boolean f49267a;
    public boolean f49268b;
    public final ContactsActivity f49269c;

    public rr(ContactsActivity contactsActivity) {
        this.f49269c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i3) {
        if (i3 == 1) {
            ContactsActivity contactsActivity = this.f49269c;
            if (contactsActivity.E && contactsActivity.f41231y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f49268b = true;
            return;
        }
        this.f49268b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f49269c;
        if (contactsActivity.f41228s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f49267a && (z10 || this.f49268b)) {
                contactsActivity.f41229w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f49267a = true;
        }
    }
}
