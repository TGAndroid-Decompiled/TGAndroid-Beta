package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class w6 extends tu0 {
    public final y9 f53436a;
    public final LinearLayout f53437b;
    public final long f53438c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.f53436a = y9Var;
        this.f53437b = linearLayout;
        this.f53438c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.f53436a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f37114b = iArr[0];
        dv0Var.f37115c = iArr[1];
        dv0Var.d = this.f53437b;
        dv0Var.f37123m = null;
        dv0Var.f37113a = imageReceiver;
        if (z10) {
            dv0Var.f37116e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f37117f = this.f53438c;
        dv0Var.f37120j = 0;
        dv0Var.f37119i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
