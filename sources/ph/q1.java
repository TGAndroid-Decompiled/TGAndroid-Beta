package ph;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ix0;
public final class q1 implements Runnable {
    public final int f45277a;
    public final ProfileActivity f45278b;

    public q1(ProfileActivity profileActivity, int i10) {
        this.f45277a = i10;
        this.f45278b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f45277a) {
            case 0:
                this.f45278b.T4(true);
                return;
            case 1:
                this.f45278b.T4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f45278b;
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null) {
                    ix0Var.f1(14);
                    profileActivity.T4(false);
                    return;
                }
                return;
        }
    }
}
