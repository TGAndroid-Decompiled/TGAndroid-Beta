package org.telegram.ui;
public final class vs implements Runnable {
    public final int f37618a;
    public final ContactsActivity f37619b;

    public vs(ContactsActivity contactsActivity, int i10) {
        this.f37618a = i10;
        this.f37619b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37618a) {
            case 0:
                this.f37619b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f37619b;
                contactsActivity.f29855f.postOnAnimation(new vs(contactsActivity, 0));
                return;
        }
    }
}
