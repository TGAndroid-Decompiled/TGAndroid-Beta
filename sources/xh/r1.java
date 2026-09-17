package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n01;
public final class r1 implements Runnable {
    public final int f46126a;
    public final ProfileActivity f46127b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f46126a = i10;
        this.f46127b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46126a) {
            case 0:
                this.f46127b.G4(true);
                return;
            case 1:
                this.f46127b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46127b;
                n01 n01Var = profileActivity.O;
                if (n01Var != null) {
                    n01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
