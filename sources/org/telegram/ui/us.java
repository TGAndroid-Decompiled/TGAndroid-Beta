package org.telegram.ui;
public final class us implements Runnable {
    public final int f38155a;
    public final ContactsActivity f38156b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f38155a = i10;
        this.f38156b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38155a) {
            case 0:
                this.f38156b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38156b;
                contactsActivity.f30742f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
