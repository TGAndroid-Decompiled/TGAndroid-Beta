package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rs implements MessagesStorage.IntCallback {
    public final int f41477a;
    public final ContactsActivity f41478b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f41477a = i10;
        this.f41478b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41477a) {
            case 0:
                ContactsActivity contactsActivity = this.f41478b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33694b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41478b, i10);
                return;
        }
    }
}
