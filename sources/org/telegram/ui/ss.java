package org.telegram.ui;
public final class ss implements Runnable {
    public final int f41808a;
    public final ContactsActivity f41809b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f41808a = i10;
        this.f41809b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41808a) {
            case 0:
                this.f41809b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41809b;
                contactsActivity.f33738f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
