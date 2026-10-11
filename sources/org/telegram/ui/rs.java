package org.telegram.ui;
public final class rs implements Runnable {
    public final int f41505a;
    public final ContactsActivity f41506b;

    public rs(ContactsActivity contactsActivity, int i10) {
        this.f41505a = i10;
        this.f41506b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41505a) {
            case 0:
                this.f41506b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f41506b;
                contactsActivity.f33728f.postOnAnimation(new rs(contactsActivity, 0));
                return;
        }
    }
}
