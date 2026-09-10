package xh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ev0;
import org.telegram.ui.tu0;
public final class g7 extends tu0 {
    public final w9 f45469a;
    public final LinearLayout f45470b;
    public final long f45471c;

    public g7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f45469a = w9Var;
        this.f45470b = linearLayout;
        this.f45471c = j3;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f45469a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.f32617b = iArr[0];
        ev0Var.f32618c = iArr[1];
        ev0Var.d = this.f45470b;
        ev0Var.f32625m = null;
        ev0Var.f32616a = imageReceiver;
        if (z10) {
            ev0Var.e = imageReceiver.getBitmapSafe();
        }
        ev0Var.h = imageReceiver.getRoundRadius(true);
        ev0Var.f32619f = this.f45471c;
        ev0Var.f32622j = 0;
        ev0Var.f32621i = 0;
        return ev0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
