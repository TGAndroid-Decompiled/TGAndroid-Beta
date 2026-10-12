package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class xs implements MessagesStorage.IntCallback {
    public final int f41926a;
    public final ContactsActivity f41927b;

    public xs(ContactsActivity contactsActivity, int i10) {
        this.f41926a = i10;
        this.f41927b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41926a) {
            case 0:
                ContactsActivity contactsActivity = this.f41927b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f32026b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41927b, i10);
                return;
        }
    }
}
