package org.telegram.ui;
public final class ss implements Runnable {
    public final int f40610a;
    public final ContactsActivity f40611b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f40610a = i10;
        this.f40611b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40610a) {
            case 0:
                this.f40611b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40611b;
                contactsActivity.f33690f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
