package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ts implements MessagesStorage.IntCallback {
    public final int f37875a;
    public final ContactsActivity f37876b;

    public ts(ContactsActivity contactsActivity, int i10) {
        this.f37875a = i10;
        this.f37876b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37875a) {
            case 0:
                ContactsActivity contactsActivity = this.f37876b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31042b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37876b, i10);
                return;
        }
    }
}
