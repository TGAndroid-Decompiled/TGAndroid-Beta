package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class c7 extends tu0 {
    public final w9 f47268a;
    public final LinearLayout f47269b;
    public final long f47270c;

    public c7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f47268a = w9Var;
        this.f47269b = linearLayout;
        this.f47270c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f47268a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33093b = iArr[0];
        dv0Var.f33094c = iArr[1];
        dv0Var.d = this.f47269b;
        dv0Var.f33101m = null;
        dv0Var.f33092a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f33095f = this.f47270c;
        dv0Var.f33098j = 0;
        dv0Var.f33097i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
