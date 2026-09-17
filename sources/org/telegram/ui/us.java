package org.telegram.ui;
public final class us implements Runnable {
    public final int f41241a;
    public final ContactsActivity f41242b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f41241a = i10;
        this.f41242b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41241a) {
            case 0:
                this.f41242b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41242b;
                contactsActivity.f33374f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
