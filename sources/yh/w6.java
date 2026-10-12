package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.gv0;
import org.telegram.ui.wu0;
public final class w6 extends wu0 {
    public final y9 f53573a;
    public final LinearLayout f53574b;
    public final long f53575c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.f53573a = y9Var;
        this.f53574b = linearLayout;
        this.f53575c = j3;
    }

    @Override
    public final gv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.f53573a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        gv0 gv0Var = new gv0();
        gv0Var.f38148b = iArr[0];
        gv0Var.f38149c = iArr[1];
        gv0Var.d = this.f53574b;
        gv0Var.f38157m = null;
        gv0Var.f38147a = imageReceiver;
        if (z10) {
            gv0Var.f38150e = imageReceiver.getBitmapSafe();
        }
        gv0Var.h = imageReceiver.getRoundRadius(true);
        gv0Var.f38151f = this.f53575c;
        gv0Var.f38154j = 0;
        gv0Var.f38153i = 0;
        return gv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
