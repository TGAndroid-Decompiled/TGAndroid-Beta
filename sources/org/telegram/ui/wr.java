package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.u0 {
    public boolean f53464a;
    public boolean f53465b;
    public final ContactsActivity f53466c;

    public wr(ContactsActivity contactsActivity) {
        this.f53466c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f53466c;
            if (contactsActivity.E && contactsActivity.f43000y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f53465b = true;
            return;
        }
        this.f53465b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f53466c;
        if (contactsActivity.f42997s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f53464a && (z10 || this.f53465b)) {
                contactsActivity.f42998w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f53464a = true;
        }
    }
}
