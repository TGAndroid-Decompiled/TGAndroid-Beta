package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.fo;
public final class x extends fo {
    public final o0 Qc;

    public x(o0 o0Var) {
        super(null);
        this.Qc = o0Var;
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
        return AndroidUtilities.findActivity(this.Qc.getContext());
    }

    @Override
    public final c6 getResourceProvider() {
        return this.Qc.Q1;
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
