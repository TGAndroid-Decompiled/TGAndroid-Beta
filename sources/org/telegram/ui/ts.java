package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ts implements MessagesStorage.IntCallback {
    public final int f37727a;
    public final ContactsActivity f37728b;

    public ts(ContactsActivity contactsActivity, int i10) {
        this.f37727a = i10;
        this.f37728b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37727a) {
            case 0:
                ContactsActivity contactsActivity = this.f37728b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f30734b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37728b, i10);
                return;
        }
    }
}
