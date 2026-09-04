package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class ts implements MessagesStorage.IntCallback {
    public final int f40822a;
    public final ContactsActivity f40823b;

    public ts(ContactsActivity contactsActivity, int i10) {
        this.f40822a = i10;
        this.f40823b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f40822a) {
            case 0:
                ContactsActivity contactsActivity = this.f40823b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33340b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f40823b, i10);
                return;
        }
    }
}
