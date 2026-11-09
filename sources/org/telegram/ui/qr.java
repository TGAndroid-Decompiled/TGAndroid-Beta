package org.telegram.ui;
public final class qr implements org.telegram.messenger.sr {
    public final int f49181a;
    public final ContactsActivity f49182b;

    public qr(ContactsActivity contactsActivity, int i7) {
        this.f49181a = i7;
        this.f49182b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        switch (this.f49181a) {
            case 0:
                ContactsActivity contactsActivity = this.f49182b;
                contactsActivity.getClass();
                if (i7 != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                contactsActivity.X = z9;
                if (i7 != 0) {
                    contactsActivity.h0(false);
                    return;
                }
                return;
            default:
                ContactsActivity.a0(this.f49182b, i7);
                return;
        }
    }
}
