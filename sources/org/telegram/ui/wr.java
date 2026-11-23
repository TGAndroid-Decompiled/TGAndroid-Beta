package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
public final class wr extends v4.u0 {
    public boolean f53743a;
    public boolean f53744b;
    public final ContactsActivity f53745c;

    public wr(ContactsActivity contactsActivity) {
        this.f53745c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        if (i7 == 1) {
            ContactsActivity contactsActivity = this.f53745c;
            if (contactsActivity.E && contactsActivity.f43120y) {
                org.telegram.messenger.g0.v1(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f53744b = true;
            return;
        }
        this.f53744b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        boolean z10;
        ContactsActivity contactsActivity = this.f53745c;
        if (contactsActivity.f43117s != null && !contactsActivity.E) {
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 != 0 && this.f53743a && (z10 || this.f53744b)) {
                contactsActivity.f43118w = !z10;
                ContactsActivity.g0(contactsActivity);
            }
            this.f53743a = true;
        }
    }
}
