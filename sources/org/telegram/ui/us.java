package org.telegram.ui;
public final class us implements Runnable {
    public final int f41213a;
    public final ContactsActivity f41214b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f41213a = i10;
        this.f41214b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41213a) {
            case 0:
                this.f41214b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41214b;
                contactsActivity.f33346f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
