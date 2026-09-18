package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class vs implements MessagesStorage.IntCallback {
    public final int f38502a;
    public final ContactsActivity f38503b;

    public vs(ContactsActivity contactsActivity, int i10) {
        this.f38502a = i10;
        this.f38503b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f38502a) {
            case 0:
                ContactsActivity contactsActivity = this.f38503b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f30754b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f38503b, i10);
                return;
        }
    }
}
