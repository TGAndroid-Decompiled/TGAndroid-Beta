package rh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.gs0;
import org.telegram.ui.yr0;
public final class g7 extends yr0 {
    public final g9 f46979a;
    public final LinearLayout f46980b;
    public final long f46981c;

    public g7(g9 g9Var, LinearLayout linearLayout, long j10) {
        this.f46979a = g9Var;
        this.f46980b = linearLayout;
        this.f46981c = j10;
    }

    @Override
    public final gs0 E(jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        g9 g9Var = this.f46979a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.f37628b = iArr[0];
        gs0Var.f37629c = iArr[1];
        gs0Var.d = this.f46980b;
        gs0Var.f37636m = null;
        gs0Var.f37627a = imageReceiver;
        if (z10) {
            gs0Var.e = imageReceiver.p();
        }
        gs0Var.h = imageReceiver.E();
        gs0Var.f37630f = this.f46981c;
        gs0Var.f37633j = 0;
        gs0Var.f37632i = 0;
        return gs0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
