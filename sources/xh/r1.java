package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
public final class r1 implements Runnable {
    public final int f50213a;
    public final ProfileActivity f50214b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f50213a = i10;
        this.f50214b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f50213a) {
            case 0:
                this.f50214b.G4(true);
                return;
            case 1:
                this.f50214b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f50214b;
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
