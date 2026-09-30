package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;
public final class s1 implements Runnable {
    public final int f46502a;
    public final ProfileActivity f46503b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f46502a = i10;
        this.f46503b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46502a) {
            case 0:
                this.f46503b.G4(true);
                return;
            case 1:
                this.f46503b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46503b;
                c01 c01Var = profileActivity.O;
                if (c01Var != null) {
                    c01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
