package yh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.r01;
public final class q1 implements Runnable {
    public final int f49087a;
    public final ProfileActivity f49088b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f49087a = i10;
        this.f49088b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f49087a) {
            case 0:
                this.f49088b.G4(true);
                return;
            case 1:
                this.f49088b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f49088b;
                r01 r01Var = profileActivity.O;
                if (r01Var != null) {
                    r01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
