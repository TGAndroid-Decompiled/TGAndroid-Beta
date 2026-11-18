package tg;

import android.app.Activity;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.bn;
public final class w extends bn {
    public final g0 f58159vd;

    public w(g0 g0Var) {
        super(null);
        this.f58159vd = g0Var;
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
        return org.telegram.messenger.g0.W(this.f58159vd.getContext());
    }

    @Override
    public final i6 getResourceProvider() {
        return this.f58159vd.A1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return j10.i(this.currentAccount).f();
    }
}
