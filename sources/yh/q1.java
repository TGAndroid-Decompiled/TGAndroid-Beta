package yh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
public final class q1 implements Runnable {
    public final int f50542a;
    public final ProfileActivity f50543b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f50542a = i10;
        this.f50543b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f50542a) {
            case 0:
                this.f50543b.G4(true);
                return;
            case 1:
                this.f50543b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f50543b;
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
