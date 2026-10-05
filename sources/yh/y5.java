package yh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yn;
public final class y5 implements Runnable {
    public final int f52325a;
    public final org.telegram.ui.ActionBar.f3[] f52326b;
    public final long f52327c;

    public y5(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, int i10) {
        this.f52325a = i10;
        this.f52326b = f3VarArr;
        this.f52327c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52325a) {
            case 0:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f52327c));
                    return;
                }
                return;
            case 1:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(this.f52327c));
                    return;
                }
                return;
            case 2:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(yn.Q9(this.f52327c));
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.f3 f3Var = this.f52326b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(yn.Q9(this.f52327c));
                    return;
                }
                return;
            case 4:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(yn.Q9(this.f52327c));
                    return;
                }
                return;
            case 5:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(new ei.m(this.f52327c));
                    return;
                }
                return;
            default:
                this.f52326b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f52327c));
                    return;
                }
                return;
        }
    }
}
