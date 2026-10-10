package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rs implements MessagesStorage.IntCallback {
    public final int f41523a;
    public final ContactsActivity f41524b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f41523a = i10;
        this.f41524b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41523a) {
            case 0:
                ContactsActivity contactsActivity = this.f41524b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33732b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f41524b, i10);
                return;
        }
    }
}
