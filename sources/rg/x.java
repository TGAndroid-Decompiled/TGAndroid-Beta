package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.sn;
public final class x extends sn {
    public final m0 f46121ed;

    public x(m0 m0Var) {
        super(null);
        this.f46121ed = m0Var;
    }

    @Override
    public final boolean C9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return AndroidUtilities.findActivity(this.f46121ed.getContext());
    }

    @Override
    public final g6 getResourceProvider() {
        return this.f46121ed.Q1;
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
