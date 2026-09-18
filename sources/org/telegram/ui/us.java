package org.telegram.ui;
public final class us implements Runnable {
    public final int f38097a;
    public final ContactsActivity f38098b;

    public us(ContactsActivity contactsActivity, int i10) {
        this.f38097a = i10;
        this.f38098b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38097a) {
            case 0:
                this.f38098b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38098b;
                contactsActivity.f30986f.postOnAnimation(new us(contactsActivity, 0));
                return;
        }
    }
}
