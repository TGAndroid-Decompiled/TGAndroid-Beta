package org.telegram.ui;
public final class vs implements Runnable {
    public final int f42845a;
    public final ContactsActivity f42846b;

    public vs(ContactsActivity contactsActivity, int i10) {
        this.f42845a = i10;
        this.f42846b = contactsActivity;
    }

    @Override
    public final void run() {
        switch (this.f42845a) {
            case 0:
                this.f42846b.g0();
                return;
            default:
                ContactsActivity contactsActivity = this.f42846b;
                contactsActivity.f33539f.postOnAnimation(new vs(contactsActivity, 0));
                return;
        }
    }
}
