package zh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
public final class u5 implements Runnable {
    public final int f52723a;
    public final org.telegram.ui.ActionBar.f3[] f52724b;
    public final long f52725c;

    public u5(org.telegram.ui.ActionBar.f3[] f3VarArr, long j3, int i10) {
        this.f52723a = i10;
        this.f52724b = f3VarArr;
        this.f52725c = j3;
    }

    @Override
    public final void run() {
        switch (this.f52723a) {
            case 0:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f52725c));
                    return;
                }
                return;
            case 1:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(co.R9(this.f52725c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.f3 f3Var = this.f52724b[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(co.R9(this.f52725c));
                    return;
                }
                return;
            case 3:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(co.R9(this.f52725c));
                    return;
                }
                return;
            case 4:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new fi.m(this.f52725c));
                    return;
                }
                return;
            case 5:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f52725c));
                    return;
                }
                return;
            default:
                this.f52724b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f52725c));
                    return;
                }
                return;
        }
    }
}
