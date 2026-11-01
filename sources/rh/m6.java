package rh;

import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class m6 implements Runnable {
    public final int f47218a;
    public final org.telegram.ui.ActionBar.z2[] f47219b;
    public final long f47220c;

    public m6(org.telegram.ui.ActionBar.z2[] z2VarArr, long j10, int i10) {
        this.f47218a = i10;
        this.f47219b = z2VarArr;
        this.f47220c = j10;
    }

    @Override
    public final void run() {
        switch (this.f47218a) {
            case 0:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ma(this.f47220c));
                    return;
                }
                return;
            case 1:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new xh.i(this.f47220c));
                    return;
                }
                return;
            case 2:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    T3.presentFragment(ProfileActivity.A4(this.f47220c));
                    return;
                }
                return;
            case 3:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(ProfileActivity.A4(this.f47220c));
                    return;
                }
                return;
            case 4:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    T5.presentFragment(ProfileActivity.A4(this.f47220c));
                    return;
                }
                return;
            case 5:
                this.f47219b[0].dismiss();
                org.telegram.ui.ActionBar.k2 T6 = LaunchActivity.T();
                if (T6 != null) {
                    T6.presentFragment(un.ma(this.f47220c));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = this.f47219b[0];
                if (z2Var != null) {
                    z2Var.dismiss();
                }
                org.telegram.ui.ActionBar.k2 T7 = LaunchActivity.T();
                if (T7 != null) {
                    T7.presentFragment(un.ma(this.f47220c));
                    return;
                }
                return;
        }
    }
}
