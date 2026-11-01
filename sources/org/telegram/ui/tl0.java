package org.telegram.ui;

import android.os.Bundle;
public final class tl0 implements Runnable {
    public final int f41667a;
    public final long f41668b;

    public tl0(long j10, int i10) {
        this.f41667a = i10;
        this.f41668b = j10;
    }

    @Override
    public final void run() {
        switch (this.f41667a) {
            case 0:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(un.ma(this.f41668b));
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(un.ma(this.f41668b));
                    return;
                }
                return;
            case 2:
                org.telegram.ui.ActionBar.k2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", this.f41668b);
                    bundle.putBoolean("my_profile", true);
                    bundle.putBoolean("open_gifts", true);
                    T3.presentFragment(new ProfileActivity(bundle, null));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    T4.presentFragment(un.ma(this.f41668b));
                    return;
                }
                return;
        }
    }
}
