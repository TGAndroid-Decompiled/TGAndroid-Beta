package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class tr extends v4.s0 {
    public boolean f50132a;
    public boolean f50133b;
    public final ContactsActivity f50134c;

    public tr(ContactsActivity contactsActivity) {
        this.f50134c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f50134c;
            if (contactsActivity.D && contactsActivity.f41199y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f50133b = true;
            return;
        }
        this.f50133b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        ContactsActivity contactsActivity = this.f50134c;
        if (contactsActivity.f41196s != null && !contactsActivity.D) {
            if (i10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0 && this.f50132a && (z9 || this.f50133b)) {
                contactsActivity.f41197w = !z9;
                ContactsActivity.g0(contactsActivity);
            }
            this.f50132a = true;
        }
    }
}
