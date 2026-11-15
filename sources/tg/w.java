package tg;

import android.app.Activity;
import org.telegram.messenger.m10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.an;
public final class w extends an {
    public final g0 f57588ud;

    public w(g0 g0Var) {
        super(null);
        this.f57588ud = g0Var;
    }

    @Override
    public final boolean V9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f57588ud.getContext());
    }

    @Override
    public final e6 getResourceProvider() {
        return this.f57588ud.A1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return m10.i(this.currentAccount).f();
    }
}
