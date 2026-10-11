package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class qs implements MessagesStorage.IntCallback {
    public final int f41259a;
    public final ContactsActivity f41260b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f41259a = i10;
        this.f41260b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41259a) {
            case 0:
                ContactsActivity contactsActivity = this.f41260b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33756b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41260b, i10);
                return;
        }
    }
}
