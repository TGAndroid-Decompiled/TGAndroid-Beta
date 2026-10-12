package org.telegram.ui;
public final class ys implements Runnable {
    public final int f42276a;
    public final ContactsActivity f42277b;

    public ys(ContactsActivity contactsActivity, int i10) {
        this.f42276a = i10;
        this.f42277b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f42276a) {
            case 0:
                this.f42277b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f42277b;
                contactsActivity.f32031f.postOnAnimation(new ys(contactsActivity, 0));
                return;
        }
    }
}
