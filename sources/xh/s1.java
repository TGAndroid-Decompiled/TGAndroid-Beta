package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l01;
public final class s1 implements Runnable {
    public final int f46435a;
    public final ProfileActivity f46436b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f46435a = i10;
        this.f46436b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46435a) {
            case 0:
                this.f46436b.G4(true);
                return;
            case 1:
                this.f46436b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46436b;
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
