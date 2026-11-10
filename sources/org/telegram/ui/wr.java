package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.s0 {
    public boolean f51426a;
    public boolean f51427b;
    public final ContactsActivity f51428c;

    public wr(ContactsActivity contactsActivity) {
        this.f51428c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f51428c;
            if (contactsActivity.D && contactsActivity.f41200y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f51427b = true;
            return;
        }
        this.f51427b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        ContactsActivity contactsActivity = this.f51428c;
        if (contactsActivity.f41197s != null && !contactsActivity.D) {
            if (i10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0 && this.f51426a && (z9 || this.f51427b)) {
                contactsActivity.f41198w = !z9;
                ContactsActivity.g0(contactsActivity);
            }
            this.f51426a = true;
        }
    }
}
