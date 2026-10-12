package org.telegram.ui;
public final class vs implements Runnable {
    public final int f42843a;
    public final ContactsActivity f42844b;

    public vs(ContactsActivity contactsActivity, int i10) {
        this.f42843a = i10;
        this.f42844b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f42843a) {
            case 0:
                this.f42844b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f42844b;
                contactsActivity.f33537f.postOnAnimation(new vs(contactsActivity, 0));
                return;
        }
    }
}
