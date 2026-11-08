package tg;

import android.app.Activity;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.an;
public final class w extends an {
    public final g0 f55982rd;

    public w(g0 g0Var) {
        super(null);
        this.f55982rd = g0Var;
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
        return org.telegram.messenger.g0.W(this.f55982rd.getContext());
    }

    @Override
    public final f6 getResourceProvider() {
        return this.f55982rd.f55705z1;
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
