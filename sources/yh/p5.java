package yh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eo;
public final class p5 implements Runnable {
    public final int f53274a;
    public final org.telegram.ui.ActionBar.e3[] f53275b;
    public final long f53276c;

    public p5(org.telegram.ui.ActionBar.e3[] e3VarArr, long j3, int i10) {
        this.f53274a = i10;
        this.f53275b = e3VarArr;
        this.f53276c = j3;
    }

    @Override
    public final void run() {
        switch (this.f53274a) {
            case 0:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    U.presentFragment(ProfileActivity.m4(this.f53276c));
                    return;
                }
                return;
            case 1:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(eo.W9(this.f53276c));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.e3 e3Var = this.f53275b[0];
                if (e3Var != null) {
                    e3Var.dismiss();
                }
                org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    U3.presentFragment(eo.W9(this.f53276c));
                    return;
                }
                return;
            case 3:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    U4.presentFragment(eo.W9(this.f53276c));
                    return;
                }
                return;
            case 4:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    U5.presentFragment(new ei.l(this.f53276c));
                    return;
                }
                return;
            case 5:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U6 = LaunchActivity.U();
                if (U6 != null) {
                    U6.presentFragment(ProfileActivity.m4(this.f53276c));
                    return;
                }
                return;
            default:
                this.f53275b[0].dismiss();
                org.telegram.ui.ActionBar.m2 U7 = LaunchActivity.U();
                if (U7 != null) {
                    U7.presentFragment(ProfileActivity.m4(this.f53276c));
                    return;
                }
                return;
        }
    }
}
