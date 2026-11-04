package ug;

import android.app.Activity;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.wm;
public final class w extends wm {
    public final f0 f56286sd;

    public w(f0 f0Var) {
        super(null);
        this.f56286sd = f0Var;
    }

    @Override
    public final boolean T9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f56286sd.getContext());
    }

    @Override
    public final e6 getResourceProvider() {
        return this.f56286sd.A1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return h10.i(this.currentAccount).f();
    }
}
