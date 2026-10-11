package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j01;
public final class s1 implements Runnable {
    public final int f51596a;
    public final ProfileActivity f51597b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f51596a = i10;
        this.f51597b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f51596a) {
            case 0:
                this.f51597b.G4(true);
                return;
            case 1:
                this.f51597b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f51597b;
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
