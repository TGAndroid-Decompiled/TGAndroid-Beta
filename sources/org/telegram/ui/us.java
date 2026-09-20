package org.telegram.ui;
public final class us implements Runnable {
    public final int f38206a;
    public final ContactsActivity f38207b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f38206a = i10;
        this.f38207b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38206a) {
            case 0:
                this.f38207b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38207b;
                contactsActivity.f31026f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
