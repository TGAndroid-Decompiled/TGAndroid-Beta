package ph;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.hx0;
public final class q1 implements Runnable {
    public final int f45288a;
    public final ProfileActivity f45289b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f45288a = i10;
        this.f45289b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f45288a) {
            case 0:
                this.f45289b.U4(true);
                return;
            case 1:
                this.f45289b.U4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f45289b;
                hx0 hx0Var = profileActivity.N;
                if (hx0Var != null) {
                    hx0Var.g1(14);
                    profileActivity.U4(false);
                    return;
                }
                return;
        }
    }
}
