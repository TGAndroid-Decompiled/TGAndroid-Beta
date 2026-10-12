package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class us implements MessagesStorage.IntCallback {
    public final int f42558a;
    public final ContactsActivity f42559b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f42558a = i10;
        this.f42559b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f42558a) {
            case 0:
                ContactsActivity contactsActivity = this.f42559b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33531b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f42559b, i10);
                return;
        }
    }
}
