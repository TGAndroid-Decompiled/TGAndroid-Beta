package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.t0 {
    public boolean f53437a;
    public boolean f53438b;
    public final ContactsActivity f53439c;

    public wr(ContactsActivity contactsActivity) {
        this.f53439c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f53439c;
            if (contactsActivity.E && contactsActivity.f43010y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f53438b = true;
            return;
        }
        this.f53438b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f53439c;
        if (contactsActivity.f43007s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f53437a && (z10 || this.f53438b)) {
                contactsActivity.f43008w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f53437a = true;
        }
    }
}
