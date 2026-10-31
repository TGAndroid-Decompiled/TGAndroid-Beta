package org.telegram.ui;

import android.os.Bundle;
public final class vl0 implements Runnable {
    public final int f42767a;
    public final long f42768b;

    public vl0(long j10, int i10) {
        this.f42767a = i10;
        this.f42768b = j10;
    }

    @Override
    public final void run() {
        switch (this.f42767a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ha(this.f42768b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(un.ha(this.f42768b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f42768b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T3.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(un.ha(this.f42768b));
                    return;
                }
                return;
        }
    }
}
