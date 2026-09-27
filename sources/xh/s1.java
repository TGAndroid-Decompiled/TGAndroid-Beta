package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e01;
public final class s1 implements Runnable {
    public final int f46461a;
    public final ProfileActivity f46462b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f46461a = i10;
        this.f46462b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46461a) {
            case 0:
                this.f46462b.G4(true);
                return;
            case 1:
                this.f46462b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46462b;
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
