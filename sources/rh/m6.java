package rh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class m6 implements Runnable {
    public final int f47204a;
    public final org.telegram.ui.ActionBar.z2[] f47205b;
    public final long f47206c;

    public m6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, int i10) {
        this.f47204a = i10;
        this.f47205b = z2VarArr;
        this.f47206c = j10;
    }

    @Override
    public final void run() {
        switch (this.f47204a) {
            case 0:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ha(this.f47206c));
                    return;
                }
                return;
            case 1:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new xh.i(this.f47206c));
                    return;
                }
                return;
            case 2:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.z4(this.f47206c));
                    return;
                }
                return;
            case 3:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.z4(this.f47206c));
                    return;
                }
                return;
            case 4:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.z4(this.f47206c));
                    return;
                }
                return;
            case 5:
                this.f47205b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(un.ha(this.f47206c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = this.f47205b[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                org.telegram.ui.ActionBar.k2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(un.ha(this.f47206c));
                    return;
                }
                return;
        }
    }
}
