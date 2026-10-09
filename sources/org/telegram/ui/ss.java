package org.telegram.ui;
public final class ss implements Runnable {
    public final int f41764a;
    public final ContactsActivity f41765b;

    public ss(ContactsActivity contactsActivity, int i10) {
        this.f41764a = i10;
        this.f41765b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41764a) {
            case 0:
                this.f41765b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41765b;
                contactsActivity.f33700f.postOnAnimation(new ss(contactsActivity, 0));
                return;
        }
    }
}
