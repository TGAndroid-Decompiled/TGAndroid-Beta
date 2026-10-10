package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ev0;
import org.telegram.ui.uu0;
public final class w6 extends uu0 {
    public final y9 f53393a;
    public final LinearLayout f53394b;
    public final long f53395c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.f53393a = y9Var;
        this.f53394b = linearLayout;
        this.f53395c = j3;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.f53393a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.f37401b = iArr[0];
        ev0Var.f37402c = iArr[1];
        ev0Var.d = this.f53394b;
        ev0Var.f37410m = null;
        ev0Var.f37400a = imageReceiver;
        if (z10) {
            ev0Var.f37403e = imageReceiver.getBitmapSafe();
        }
        ev0Var.h = imageReceiver.getRoundRadius(true);
        ev0Var.f37404f = this.f53395c;
        ev0Var.f37407j = 0;
        ev0Var.f37406i = 0;
        return ev0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
