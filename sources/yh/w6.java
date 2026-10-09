package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ev0;
import org.telegram.ui.uu0;
public final class w6 extends uu0 {
    public final y9 f53347a;
    public final LinearLayout f53348b;
    public final long f53349c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.f53347a = y9Var;
        this.f53348b = linearLayout;
        this.f53349c = j3;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.f53347a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.f37355b = iArr[0];
        ev0Var.f37356c = iArr[1];
        ev0Var.d = this.f53348b;
        ev0Var.f37364m = null;
        ev0Var.f37354a = imageReceiver;
        if (z10) {
            ev0Var.f37357e = imageReceiver.getBitmapSafe();
        }
        ev0Var.h = imageReceiver.getRoundRadius(true);
        ev0Var.f37358f = this.f53349c;
        ev0Var.f37361j = 0;
        ev0Var.f37360i = 0;
        return ev0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
