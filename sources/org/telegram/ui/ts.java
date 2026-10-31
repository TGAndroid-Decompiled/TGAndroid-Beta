package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class ts extends s4.s0 {
    public boolean f41932a;
    public boolean f41933b;
    public final ContactsActivity f41934c;

    public ts(ContactsActivity contactsActivity) {
        this.f41934c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f41934c;
            if (contactsActivity.D && contactsActivity.f33300y) {
                org.telegram.messenger.i0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f41933b = true;
            return;
        }
        this.f41933b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ContactsActivity contactsActivity = this.f41934c;
        if (contactsActivity.f33297s != null && !contactsActivity.D) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f41932a && (z10 || this.f41933b)) {
                contactsActivity.f33298w = !z10;
                ContactsActivity.f0(contactsActivity);
            }
            this.f41932a = true;
        }
    }
}
