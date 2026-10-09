package org.telegram.ui;
public final class ss implements Runnable {
    public final int f41762a;
    public final ContactsActivity f41763b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f41762a = i10;
        this.f41763b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41762a) {
            case 0:
                this.f41763b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41763b;
                contactsActivity.f33700f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
