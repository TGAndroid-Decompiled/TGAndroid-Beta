package org.telegram.ui;
public final class rr implements org.telegram.messenger.nr {
    public final int f51870a;
    public final ContactsActivity f51871b;

    public rr(ContactsActivity contactsActivity, int i7) {
        this.f51870a = i7;
        this.f51871b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        switch (this.f51870a) {
            case 0:
                ContactsActivity contactsActivity = this.f51871b;
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
                ContactsActivity.a0(this.f51871b, i7);
                return;
        }
    }
}
