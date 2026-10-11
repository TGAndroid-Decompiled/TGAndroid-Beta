package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j01;
public final class s1 implements Runnable {
    public final int f51630a;
    public final ProfileActivity f51631b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f51630a = i10;
        this.f51631b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f51630a) {
            case 0:
                this.f51631b.G4(true);
                return;
            case 1:
                this.f51631b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f51631b;
                j01 j01Var = profileActivity.O;
                if (j01Var != null) {
                    j01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
