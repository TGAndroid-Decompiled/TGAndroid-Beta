package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class us implements MessagesStorage.IntCallback {
    public final int f37335a;
    public final ContactsActivity f37336b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f37335a = i10;
        this.f37336b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f37335a) {
            case 0:
                ContactsActivity contactsActivity = this.f37336b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f29850b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f37336b, i10);
                return;
        }
    }
}
