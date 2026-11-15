package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.t0 {
    public boolean f52985a;
    public boolean f52986b;
    public final ContactsActivity f52987c;

    public wr(ContactsActivity contactsActivity) {
        this.f52987c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f52987c;
            if (contactsActivity.E && contactsActivity.f42556y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f52986b = true;
            return;
        }
        this.f52986b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f52987c;
        if (contactsActivity.f42553s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f52985a && (z10 || this.f52986b)) {
                contactsActivity.f42554w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f52985a = true;
        }
    }
}
