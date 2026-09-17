package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class vs implements MessagesStorage.IntCallback {
    public final int f38497a;
    public final ContactsActivity f38498b;

    public vs(ContactsActivity contactsActivity, int i10) {
        this.f38497a = i10;
        this.f38498b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f38497a) {
            case 0:
                ContactsActivity contactsActivity = this.f38498b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f30751b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f38498b, i10);
                return;
        }
    }
}
