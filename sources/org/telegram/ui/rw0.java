package org.telegram.ui;
public final class rw0 extends z21 {
    public final ProfileActivity e;

    public rw0(ProfileActivity profileActivity, qw0 qw0Var) {
        super(qw0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.M5 = null;
    }
}
