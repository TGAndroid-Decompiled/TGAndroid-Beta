package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class qs implements MessagesStorage.IntCallback {
    public final int f41225a;
    public final ContactsActivity f41226b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f41225a = i10;
        this.f41226b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41225a) {
            case 0:
                ContactsActivity contactsActivity = this.f41226b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33722b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41226b, i10);
                return;
        }
    }
}
