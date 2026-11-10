package org.telegram.ui;
public final class rr implements org.telegram.messenger.sr {
    public final int f49562a;
    public final ContactsActivity f49563b;

    public rr(ContactsActivity contactsActivity, int i7) {
        this.f49562a = i7;
        this.f49563b = contactsActivity;
    }

    @Override
    public final void a(int i7) {
        boolean z9;
        switch (this.f49562a) {
            case 0:
                ContactsActivity contactsActivity = this.f49563b;
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
                ContactsActivity.a0(this.f49563b, i7);
                return;
        }
    }
}
