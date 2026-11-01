package rh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.fs0;
import org.telegram.ui.xr0;
public final class g7 extends xr0 {
    public final g9 f46993a;
    public final LinearLayout f46994b;
    public final long f46995c;

    public g7(g9 g9Var, LinearLayout linearLayout, long j10) {
        this.f46993a = g9Var;
        this.f46994b = linearLayout;
        this.f46995c = j10;
    }

    @Override
    public final fs0 E(kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        g9 g9Var = this.f46993a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.f37216b = iArr[0];
        fs0Var.f37217c = iArr[1];
        fs0Var.d = this.f46994b;
        fs0Var.f37224m = null;
        fs0Var.f37215a = imageReceiver;
        if (z10) {
            fs0Var.e = imageReceiver.p();
        }
        fs0Var.h = imageReceiver.E();
        fs0Var.f37218f = this.f46995c;
        fs0Var.f37221j = 0;
        fs0Var.f37220i = 0;
        return fs0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
