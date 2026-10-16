package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class xs implements MessagesStorage.IntCallback {
    public final int f41629a;
    public final ContactsActivity f41630b;

    public xs(ContactsActivity contactsActivity, int i10) {
        this.f41629a = i10;
        this.f41630b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41629a) {
            case 0:
                ContactsActivity contactsActivity = this.f41630b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f31728b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41630b, i10);
                return;
        }
    }
}
