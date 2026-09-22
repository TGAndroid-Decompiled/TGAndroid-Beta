package org.telegram.ui;
public final class us implements Runnable {
    public final int f38227a;
    public final ContactsActivity f38228b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f38227a = i10;
        this.f38228b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38227a) {
            case 0:
                this.f38228b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38228b;
                contactsActivity.f31047f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
