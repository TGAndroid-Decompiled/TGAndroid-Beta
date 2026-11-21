package org.telegram.ui;
public final class rr implements org.telegram.messenger.nr {
    public final int f51751a;
    public final ContactsActivity f51752b;

    public rr(ContactsActivity contactsActivity, int i7) {
        this.f51751a = i7;
        this.f51752b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f51751a) {
            case 0:
                ContactsActivity contactsActivity = this.f51752b;
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
                ContactsActivity.a0(this.f51752b, i7);
                return;
        }
    }
}
