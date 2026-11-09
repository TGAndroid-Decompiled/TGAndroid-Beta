package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class vr extends v4.s0 {
    public boolean f50756a;
    public boolean f50757b;
    public final ContactsActivity f50758c;

    public vr(ContactsActivity contactsActivity) {
        this.f50758c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f50758c;
            if (contactsActivity.D && contactsActivity.f41209y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f50757b = true;
            return;
        }
        this.f50757b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z9;
        ContactsActivity contactsActivity = this.f50758c;
        if (contactsActivity.f41206s != null && !contactsActivity.D) {
            if (i10 > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i10 != 0 && this.f50756a && (z9 || this.f50757b)) {
                contactsActivity.f41207w = !z9;
                ContactsActivity.g0(contactsActivity);
            }
            this.f50756a = true;
        }
    }
}
