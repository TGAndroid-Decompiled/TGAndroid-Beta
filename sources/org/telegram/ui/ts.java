package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ts implements MessagesStorage.IntCallback {
    public final int f37778a;
    public final ContactsActivity f37779b;

    public ts(ContactsActivity contactsActivity, int i10) {
        this.f37778a = i10;
        this.f37779b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37778a) {
            case 0:
                ContactsActivity contactsActivity = this.f37779b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f30737b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37779b, i10);
                return;
        }
    }
}
