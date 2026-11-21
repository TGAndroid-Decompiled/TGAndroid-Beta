package tg;

import android.app.Activity;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.bn;
public final class x extends bn {
    public final h0 f58212vd;

    public x(h0 h0Var) {
        super(null);
        this.f58212vd = h0Var;
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
        return org.telegram.messenger.g0.W(this.f58212vd.getContext());
    }

    @Override
    public final h6 getResourceProvider() {
        return this.f58212vd.A1;
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
