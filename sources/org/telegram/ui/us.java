package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class us implements MessagesStorage.IntCallback {
    public final int f42560a;
    public final ContactsActivity f42561b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f42560a = i10;
        this.f42561b = contactsActivity;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        switch (this.f42560a) {
            case 0:
                ContactsActivity contactsActivity = this.f42561b;
                contactsActivity.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.f33533b0 = z10;
                if (i10 != 0) {
                    contactsActivity.f0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.W(this.f42561b, i10);
                return;
        }
    }
}
