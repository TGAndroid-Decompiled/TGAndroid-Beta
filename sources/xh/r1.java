package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
public final class r1 implements Runnable {
    public final int f50220a;
    public final ProfileActivity f50221b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f50220a = i10;
        this.f50221b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f50220a) {
            case 0:
                this.f50221b.G4(true);
                return;
            case 1:
                this.f50221b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f50221b;
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
