package org.telegram.ui;
public final class ws implements Runnable {
    public final int f39163a;
    public final ContactsActivity f39164b;

    public ws(ContactsActivity contactsActivity, int i10) {
        this.f39163a = i10;
        this.f39164b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f39163a) {
            case 0:
                this.f39164b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f39164b;
                contactsActivity.f30756f.postOnAnimation(new ws(contactsActivity, 0));
                return;
        }
    }
}
