package org.telegram.ui;
public final class ss implements Runnable {
    public final int f40629a;
    public final ContactsActivity f40630b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f40629a = i10;
        this.f40630b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40629a) {
            case 0:
                this.f40630b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40630b;
                contactsActivity.f33710f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
