package org.telegram.ui;
public final class ss implements Runnable {
    public final int f40617a;
    public final ContactsActivity f40618b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f40617a = i10;
        this.f40618b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f40617a) {
            case 0:
                this.f40618b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f40618b;
                contactsActivity.f33697f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
