package org.telegram.ui;
public final class ws implements Runnable {
    public final int f39168a;
    public final ContactsActivity f39169b;

    public ws(ContactsActivity contactsActivity, int i10) {
        this.f39168a = i10;
        this.f39169b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f39168a) {
            case 0:
                this.f39169b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f39169b;
                contactsActivity.f30759f.postOnAnimation(new ws(contactsActivity, 0));
                return;
        }
    }
}
