package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;
public final class d7 extends lu0 {
    public final w9 f47307a;
    public final LinearLayout f47308b;
    public final long f47309c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f47307a = w9Var;
        this.f47308b = linearLayout;
        this.f47309c = j3;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f47307a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.f38821b = iArr[0];
        vu0Var.f38822c = iArr[1];
        vu0Var.d = this.f47308b;
        vu0Var.f38829m = null;
        vu0Var.f38820a = imageReceiver;
        if (z10) {
            vu0Var.e = imageReceiver.getBitmapSafe();
        }
        vu0Var.h = imageReceiver.getRoundRadius(true);
        vu0Var.f38823f = this.f47309c;
        vu0Var.f38826j = 0;
        vu0Var.f38825i = 0;
        return vu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
