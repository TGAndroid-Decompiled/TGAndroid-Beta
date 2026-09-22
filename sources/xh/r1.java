package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m01;
public final class r1 implements Runnable {
    public final int f46099a;
    public final ProfileActivity f46100b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f46099a = i10;
        this.f46100b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46099a) {
            case 0:
                this.f46100b.G4(true);
                return;
            case 1:
                this.f46100b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46100b;
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
