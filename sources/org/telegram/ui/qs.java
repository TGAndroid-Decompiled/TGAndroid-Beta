package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class qs implements MessagesStorage.IntCallback {
    public final int f36878a;
    public final ContactsActivity f36879b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f36878a = i10;
        this.f36879b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f36878a) {
            case 0:
                ContactsActivity contactsActivity = this.f36879b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31025b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f36879b, i10);
                return;
        }
    }
}
