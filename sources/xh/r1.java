package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
public final class r1 implements Runnable {
    public final int f51719a;
    public final ProfileActivity f51720b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f51719a = i10;
        this.f51720b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f51719a) {
            case 0:
                this.f51720b.G4(true);
                return;
            case 1:
                this.f51720b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f51720b;
                m01 m01Var = profileActivity.O;
                if (m01Var != null) {
                    m01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
