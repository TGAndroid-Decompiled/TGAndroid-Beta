package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.u0 {
    public boolean f53514a;
    public boolean f53515b;
    public final ContactsActivity f53516c;

    public wr(ContactsActivity contactsActivity) {
        this.f53516c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f53516c;
            if (contactsActivity.E && contactsActivity.f43045y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f53515b = true;
            return;
        }
        this.f53515b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f53516c;
        if (contactsActivity.f43042s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f53514a && (z10 || this.f53515b)) {
                contactsActivity.f43043w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f53514a = true;
        }
    }
}
