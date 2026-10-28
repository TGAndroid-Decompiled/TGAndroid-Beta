package sg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.wn;
public final class x extends wn {
    public final m0 f48598od;

    public x(m0 m0Var) {
        super(null);
        this.f48598od = m0Var;
    }

    @Override
    public final boolean I9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f48598od.getContext());
    }

    @Override
    public final u6 getResourceProvider() {
        return this.f48598od.F1;
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
