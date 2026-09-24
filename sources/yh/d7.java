package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;
public final class d7 extends lu0 {
    public final w9 f47295a;
    public final LinearLayout f47296b;
    public final long f47297c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f47295a = w9Var;
        this.f47296b = linearLayout;
        this.f47297c = j3;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f47295a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.f38805b = iArr[0];
        vu0Var.f38806c = iArr[1];
        vu0Var.d = this.f47296b;
        vu0Var.f38813m = null;
        vu0Var.f38804a = imageReceiver;
        if (z10) {
            vu0Var.e = imageReceiver.getBitmapSafe();
        }
        vu0Var.h = imageReceiver.getRoundRadius(true);
        vu0Var.f38807f = this.f47297c;
        vu0Var.f38810j = 0;
        vu0Var.f38809i = 0;
        return vu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
