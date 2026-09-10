package wh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r01;
public final class q1 implements Runnable {
    public final int f44315a;
    public final ProfileActivity f44316b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f44315a = i10;
        this.f44316b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f44315a) {
            case 0:
                this.f44316b.G4(true);
                return;
            case 1:
                this.f44316b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f44316b;
                r01 r01Var = profileActivity.O;
                if (r01Var != null) {
                    r01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
