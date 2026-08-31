package org.telegram.ui;
public final class qs implements Runnable {
    public final int f40662a;
    public final ContactsActivity f40663b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f40662a = i10;
        this.f40663b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40662a) {
            case 0:
                this.f40663b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40663b;
                contactsActivity.f34060f.postOnAnimation(new qs(contactsActivity, 0));
                return;
        }
    }
}
