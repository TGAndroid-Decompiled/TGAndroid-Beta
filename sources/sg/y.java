package sg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.un;
public final class y extends un {
    public final n0 f48573kd;

    public y(n0 n0Var) {
        super(null);
        this.f48573kd = n0Var;
    }

    @Override
    public final boolean F9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f48573kd.getContext());
    }

    @Override
    public final u6 getResourceProvider() {
        return this.f48573kd.F1;
    }

    @Override
    public final TLRPC.User i() {
        return UserConfig.getInstance(this.currentAccount).getCurrentUser();
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }
}
