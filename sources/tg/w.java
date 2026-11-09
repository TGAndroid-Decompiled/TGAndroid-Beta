package tg;

import android.app.Activity;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.cn;
public final class w extends cn {
    public final g0 f55994td;

    public w(g0 g0Var) {
        super(null);
        this.f55994td = g0Var;
    }

    @Override
    public final boolean U9() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final Activity getParentActivity() {
        return org.telegram.messenger.g0.W(this.f55994td.getContext());
    }

    @Override
    public final g6 getResourceProvider() {
        return this.f55994td.f55717z1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return p10.i(this.currentAccount).f();
    }
}
