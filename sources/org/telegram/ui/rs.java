package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rs extends s4.u0 {
    public boolean f43160a;
    public boolean f43161b;
    public final ContactsActivity f43162c;

    public rs(ContactsActivity contactsActivity) {
        this.f43162c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f43162c;
            if (contactsActivity.f35501y && contactsActivity.f35500x) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f43161b = true;
            return;
        }
        this.f43161b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ContactsActivity contactsActivity = this.f43162c;
        if (contactsActivity.f35498s != null && !contactsActivity.f35501y) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f43160a && (z10 || this.f43161b)) {
                contactsActivity.v = !z10;
                ContactsActivity.c0(contactsActivity);
            }
            this.f43160a = true;
        }
    }
}
