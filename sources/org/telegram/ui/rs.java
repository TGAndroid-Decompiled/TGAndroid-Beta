package org.telegram.ui;
public final class rs implements Runnable {
    public final int f38022a;
    public final ContactsActivity f38023b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f38022a = i10;
        this.f38023b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38022a) {
            case 0:
                this.f38023b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f38023b;
                contactsActivity.f31517f.postOnAnimation(new rs(contactsActivity, 0));
                return;
        }
    }
}
