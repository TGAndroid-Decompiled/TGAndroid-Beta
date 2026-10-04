package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
public final class r1 implements Runnable {
    public final int f50204a;
    public final ProfileActivity f50205b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f50204a = i10;
        this.f50205b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f50204a) {
            case 0:
                this.f50205b.G4(true);
                return;
            case 1:
                this.f50205b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f50205b;
                e01 e01Var = profileActivity.O;
                if (e01Var != null) {
                    e01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
