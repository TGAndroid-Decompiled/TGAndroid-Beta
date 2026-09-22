package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class e7 extends tu0 {
    public final u9 f47066a;
    public final LinearLayout f47067b;
    public final long f47068c;

    public e7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.f47066a = u9Var;
        this.f47067b = linearLayout;
        this.f47068c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.f47066a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33097b = iArr[0];
        dv0Var.f33098c = iArr[1];
        dv0Var.d = this.f47067b;
        dv0Var.f33105m = null;
        dv0Var.f33096a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f33099f = this.f47068c;
        dv0Var.f33102j = 0;
        dv0Var.f33101i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
