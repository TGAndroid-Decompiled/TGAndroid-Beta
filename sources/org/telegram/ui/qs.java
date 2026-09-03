package org.telegram.ui;
public final class qs implements Runnable {
    public final int f40633a;
    public final ContactsActivity f40634b;

    public qs(ContactsActivity contactsActivity, int i10) {
        this.f40633a = i10;
        this.f40634b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40633a) {
            case 0:
                this.f40634b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40634b;
                contactsActivity.f34060f.postOnAnimation(new qs(contactsActivity, 0));
                return;
        }
    }
}
