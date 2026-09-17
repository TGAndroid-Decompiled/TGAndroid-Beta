package rg;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.co;
public final class y extends co {
    public final o0 Qc;

    public y(o0 o0Var) {
        super(null);
        this.Qc = o0Var;
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
    public final f6 getResourceProvider() {
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

    @Override
    public final boolean x9() {
        return false;
    }
}
