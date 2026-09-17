package org.telegram.ui;
public final class us implements Runnable {
    public final int f41214a;
    public final ContactsActivity f41215b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f41214a = i10;
        this.f41215b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41214a) {
            case 0:
                this.f41215b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41215b;
                contactsActivity.f33347f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
