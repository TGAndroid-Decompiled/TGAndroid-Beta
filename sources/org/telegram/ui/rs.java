package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rs implements MessagesStorage.IntCallback {
    public final int f40258a;
    public final ContactsActivity f40259b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f40258a = i10;
        this.f40259b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f40258a) {
            case 0:
                ContactsActivity contactsActivity = this.f40259b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33691b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.U(this.f40259b, i10);
                return;
        }
    }
}
