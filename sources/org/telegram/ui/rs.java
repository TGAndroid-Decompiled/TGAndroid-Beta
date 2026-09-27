package org.telegram.ui;
public final class rs implements Runnable {
    public final int f37231a;
    public final ContactsActivity f37232b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f37231a = i10;
        this.f37232b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37231a) {
            case 0:
                this.f37232b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37232b;
                contactsActivity.f31030f.postOnAnimation(new rs(contactsActivity, 0));
                return;
        }
    }
}
