package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l01;
public final class r1 implements Runnable {
    public final int f46103a;
    public final ProfileActivity f46104b;

    public r1(ProfileActivity profileActivity, int i10) {
        this.f46103a = i10;
        this.f46104b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f46103a) {
            case 0:
                this.f46104b.G4(true);
                return;
            case 1:
                this.f46104b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f46104b;
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
