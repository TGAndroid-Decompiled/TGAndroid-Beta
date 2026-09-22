package org.telegram.ui;
public final class us implements Runnable {
    public final int f38169a;
    public final ContactsActivity f38170b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f38169a = i10;
        this.f38170b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38169a) {
            case 0:
                this.f38170b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38170b;
                contactsActivity.f30739f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
