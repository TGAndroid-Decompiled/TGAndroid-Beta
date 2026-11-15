package org.telegram.ui;
public final class qr implements org.telegram.messenger.pr {
    public final int f50779a;
    public final ContactsActivity f50780b;

    public qr(ContactsActivity contactsActivity, int i7) {
        this.f50779a = i7;
        this.f50780b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f50779a) {
            case 0:
                ContactsActivity contactsActivity = this.f50780b;
                contactsActivity.getClass();
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                contactsActivity.Y = z10;
                if (i7 != 0) {
                    contactsActivity.h0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.a0(this.f50780b, i7);
                return;
        }
    }
}
