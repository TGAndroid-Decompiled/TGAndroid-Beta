package yh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
public final class q1 implements Runnable {
    public final int f50543a;
    public final ProfileActivity f50544b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f50543a = i10;
        this.f50544b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f50543a) {
            case 0:
                this.f50544b.G4(true);
                return;
            case 1:
                this.f50544b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f50544b;
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
