package tg;

import android.app.Activity;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.bn;
public final class c0 extends bn {
    public final l0 f57860vd;

    public c0(l0 l0Var) {
        super(null);
        this.f57860vd = l0Var;
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
        return org.telegram.messenger.g0.W(this.f57860vd.getContext());
    }

    @Override
    public final i6 getResourceProvider() {
        return this.f57860vd.A1;
    }

    @Override
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override
    public final TLRPC.User j() {
        return i10.i(this.currentAccount).f();
    }
}
