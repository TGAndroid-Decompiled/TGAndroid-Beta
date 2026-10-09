package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class rs implements MessagesStorage.IntCallback {
    public final int f41479a;
    public final ContactsActivity f41480b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f41479a = i10;
        this.f41480b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f41479a) {
            case 0:
                ContactsActivity contactsActivity = this.f41480b;
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
                ContactsActivity.W(this.f41480b, i10);
                return;
        }
    }
}
