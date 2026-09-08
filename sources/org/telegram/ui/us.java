package org.telegram.ui;
public final class us implements Runnable {
    public final int f41240a;
    public final ContactsActivity f41241b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f41240a = i10;
        this.f41241b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41240a) {
            case 0:
                this.f41241b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41241b;
                contactsActivity.f33373f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
