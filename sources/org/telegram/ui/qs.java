package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class qs implements MessagesStorage.IntCallback {
    public final int f37469a;
    public final ContactsActivity f37470b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f37469a = i10;
        this.f37470b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        switch (this.f37469a) {
            case 0:
                ContactsActivity contactsActivity = this.f37470b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                contactsActivity.Y = z4;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37470b, i10);
                return;
        }
    }
}
