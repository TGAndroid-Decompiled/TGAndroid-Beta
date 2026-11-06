package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class tr extends v4.s0 {
    public boolean f50096a;
    public boolean f50097b;
    public final ContactsActivity f50098c;

    public tr(ContactsActivity contactsActivity) {
        this.f50098c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f50098c;
            if (contactsActivity.D && contactsActivity.f41174y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f50097b = true;
            return;
        }
        this.f50097b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        ContactsActivity contactsActivity = this.f50098c;
        if (contactsActivity.f41171s != null && !contactsActivity.D) {
            if (i10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0 && this.f50096a && (z9 || this.f50097b)) {
                contactsActivity.f41172w = !z9;
                ContactsActivity.g0(contactsActivity);
            }
            this.f50096a = true;
        }
    }
}
