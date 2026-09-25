package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c01;
public final class s1 implements Runnable {
    public final int f46395a;
    public final ProfileActivity f46396b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f46395a = i10;
        this.f46396b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46395a) {
            case 0:
                this.f46396b.G4(true);
                return;
            case 1:
                this.f46396b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46396b;
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
