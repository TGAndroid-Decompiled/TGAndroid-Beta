package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class tr extends v4.s0 {
    public boolean f50123a;
    public boolean f50124b;
    public final ContactsActivity f50125c;

    public tr(ContactsActivity contactsActivity) {
        this.f50125c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f50125c;
            if (contactsActivity.D && contactsActivity.f41202y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f50124b = true;
            return;
        }
        this.f50124b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        ContactsActivity contactsActivity = this.f50125c;
        if (contactsActivity.f41199s != null && !contactsActivity.D) {
            if (i10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0 && this.f50123a && (z9 || this.f50124b)) {
                contactsActivity.f41200w = !z9;
                ContactsActivity.g0(contactsActivity);
            }
            this.f50123a = true;
        }
    }
}
