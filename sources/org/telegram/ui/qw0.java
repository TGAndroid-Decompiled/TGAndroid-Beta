package org.telegram.ui;
public final class qw0 extends x21 {
    public final ProfileActivity e;

    public qw0(ProfileActivity profileActivity, pw0 pw0Var) {
        super(pw0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.N5 = null;
    }
}
