package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k01;
public final class s1 implements Runnable {
    public final int f51507a;
    public final ProfileActivity f51508b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f51507a = i10;
        this.f51508b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f51507a) {
            case 0:
                this.f51508b.G4(true);
                return;
            case 1:
                this.f51508b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f51508b;
                k01 k01Var = profileActivity.O;
                if (k01Var != null) {
                    k01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
