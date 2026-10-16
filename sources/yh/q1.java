package yh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q01;
public final class q1 implements Runnable {
    public final int f49086a;
    public final ProfileActivity f49087b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f49086a = i10;
        this.f49087b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f49086a) {
            case 0:
                this.f49087b.G4(true);
                return;
            case 1:
                this.f49087b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f49087b;
                q01 q01Var = profileActivity.O;
                if (q01Var != null) {
                    q01Var.Z0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
