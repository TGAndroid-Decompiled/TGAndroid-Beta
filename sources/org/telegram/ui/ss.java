package org.telegram.ui;
public final class ss implements Runnable {
    public final int f40611a;
    public final ContactsActivity f40612b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f40611a = i10;
        this.f40612b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40611a) {
            case 0:
                this.f40612b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40612b;
                contactsActivity.f33691f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
