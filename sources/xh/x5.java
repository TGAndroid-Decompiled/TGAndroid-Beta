package xh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
public final class x5 implements Runnable {
    public final int f46311a;
    public final org.telegram.ui.ActionBar.h3[] f46312b;
    public final long f46313c;

    public x5(org.telegram.ui.ActionBar.h3[] h3VarArr, long j3, int i10) {
        this.f46311a = i10;
        this.f46312b = h3VarArr;
        this.f46313c = j3;
    }

    @Override
    public final void run() {
        switch (this.f46311a) {
            case 0:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f46313c));
                    return;
                }
                return;
            case 1:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.R9(this.f46313c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.h3 h3Var = this.f46312b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(eo.R9(this.f46313c));
                    return;
                }
                return;
            case 3:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(eo.R9(this.f46313c));
                    return;
                }
                return;
            case 4:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new di.m(this.f46313c));
                    return;
                }
                return;
            case 5:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f46313c));
                    return;
                }
                return;
            default:
                this.f46312b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f46313c));
                    return;
                }
                return;
        }
    }
}
