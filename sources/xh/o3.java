package xh;

import android.app.Activity;
import android.content.Context;
import org.telegram.ui.LaunchActivity;
public final class o3 extends org.telegram.ui.ActionBar.k2 {
    @Override
    public final Context getContext() {
        return org.telegram.messenger.i0.W(LaunchActivity.I1);
    }

    @Override
    public final int getCurrentAccount() {
        return this.currentAccount;
    }

    @Override
    public final Activity getParentActivity() {
        Activity W = org.telegram.messenger.i0.W(org.telegram.messenger.w0.f18945b);
        if (W == null) {
            return LaunchActivity.I1;
        }
        return W;
    }
}
