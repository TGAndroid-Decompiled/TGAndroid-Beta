package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l01;
public final class s1 implements Runnable {
    public final int f46414a;
    public final ProfileActivity f46415b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f46414a = i10;
        this.f46415b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46414a) {
            case 0:
                this.f46415b.G4(true);
                return;
            case 1:
                this.f46415b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46415b;
                l01 l01Var = profileActivity.O;
                if (l01Var != null) {
                    l01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
