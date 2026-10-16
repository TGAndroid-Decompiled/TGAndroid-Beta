package org.telegram.ui;
public final class ys implements Runnable {
    public final int f41952a;
    public final ContactsActivity f41953b;

    public ys(ContactsActivity contactsActivity, int i10) {
        this.f41952a = i10;
        this.f41953b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41952a) {
            case 0:
                this.f41953b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41953b;
                contactsActivity.f31733f.postOnAnimation(new ys(contactsActivity, 0));
                return;
        }
    }
}
