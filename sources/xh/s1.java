package xh;

import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k01;
public final class s1 implements Runnable {
    public final int f51509a;
    public final ProfileActivity f51510b;

    public s1(ProfileActivity profileActivity, int i10) {
        this.f51509a = i10;
        this.f51510b = profileActivity;
    }

    @Override
    public final void run() {
        switch (this.f51509a) {
            case 0:
                this.f51510b.G4(true);
                return;
            case 1:
                this.f51510b.G4(true);
                return;
            default:
                ProfileActivity profileActivity = this.f51510b;
                k01 k01Var = profileActivity.O;
                if (k01Var != null) {
                    k01Var.Y0(14);
                    profileActivity.G4(false);
                    return;
                }
                return;
        }
    }
}
