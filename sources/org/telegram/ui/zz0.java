package org.telegram.ui;
public final class zz0 extends c71 {
    public final ProfileActivity e;

    public zz0(ProfileActivity profileActivity, yz0 yz0Var) {
        super(yz0Var);
        this.e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.B5 = null;
    }
}
