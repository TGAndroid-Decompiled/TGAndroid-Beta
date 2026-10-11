package org.telegram.ui;
public final class rs implements Runnable {
    public final int f41539a;
    public final ContactsActivity f41540b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f41539a = i10;
        this.f41540b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41539a) {
            case 0:
                this.f41540b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41540b;
                contactsActivity.f33762f.postOnAnimation(new rs(contactsActivity, 0));
                return;
        }
    }
}
