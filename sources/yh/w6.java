package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class w6 extends tu0 {
    public final y9 f53470a;
    public final LinearLayout f53471b;
    public final long f53472c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.f53470a = y9Var;
        this.f53471b = linearLayout;
        this.f53472c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.f53470a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f37148b = iArr[0];
        dv0Var.f37149c = iArr[1];
        dv0Var.d = this.f53471b;
        dv0Var.f37157m = null;
        dv0Var.f37147a = imageReceiver;
        if (z10) {
            dv0Var.f37150e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f37151f = this.f53472c;
        dv0Var.f37154j = 0;
        dv0Var.f37153i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
