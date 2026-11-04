package org.telegram.ui;
public final class yu0 extends x01 {
    public final ProfileActivity f52414e;

    public yu0(ProfileActivity profileActivity, xu0 xu0Var) {
        super(xu0Var);
        this.f52414e = profileActivity;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f52414e.O5 = null;
    }
}
