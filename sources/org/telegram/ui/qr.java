package org.telegram.ui;
public final class qr implements org.telegram.messenger.pr {
    public final int f50778a;
    public final ContactsActivity f50779b;

    public qr(ContactsActivity contactsActivity, int i7) {
        this.f50778a = i7;
        this.f50779b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f50778a) {
            case 0:
                ContactsActivity contactsActivity = this.f50779b;
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
                ContactsActivity.a0(this.f50779b, i7);
                return;
        }
    }
}
