package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.jv0;
import org.telegram.ui.zu0;
public final class w6 extends zu0 {
    public final z9 f51277a;
    public final LinearLayout f51278b;
    public final long f51279c;

    public w6(z9 z9Var, LinearLayout linearLayout, long j10) {
        this.f51277a = z9Var;
        this.f51278b = linearLayout;
        this.f51279c = j10;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        z9 z9Var = this.f51277a;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.f37146b = iArr[0];
        jv0Var.f37147c = iArr[1];
        jv0Var.d = this.f51278b;
        jv0Var.f37154m = null;
        jv0Var.f37145a = imageReceiver;
        if (z10) {
            jv0Var.e = imageReceiver.getBitmapSafe();
        }
        jv0Var.h = imageReceiver.getRoundRadius(true);
        jv0Var.f37148f = this.f51279c;
        jv0Var.f37151j = 0;
        jv0Var.f37150i = 0;
        return jv0Var;
    }

    @Override
    public final boolean L() {
        return true;
    }
}
