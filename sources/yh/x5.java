package yh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
public final class x5 implements Runnable {
    public final int f48029a;
    public final org.telegram.ui.ActionBar.g3[] f48030b;
    public final long f48031c;

    public x5(org.telegram.ui.ActionBar.g3[] g3VarArr, long j3, int i10) {
        this.f48029a = i10;
        this.f48030b = g3VarArr;
        this.f48031c = j3;
    }

    @Override
    public final void run() {
        switch (this.f48029a) {
            case 0:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f48031c));
                    return;
                }
                return;
            case 1:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(bo.R9(this.f48031c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.g3 g3Var = this.f48030b[0];
                if (g3Var != null) {
                    g3Var.dismiss();
                }
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(bo.R9(this.f48031c));
                    return;
                }
                return;
            case 3:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(bo.R9(this.f48031c));
                    return;
                }
                return;
            case 4:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new ei.l(this.f48031c));
                    return;
                }
                return;
            case 5:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f48031c));
                    return;
                }
                return;
            default:
                this.f48030b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f48031c));
                    return;
                }
                return;
        }
    }
}
