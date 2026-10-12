package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.av0;
import org.telegram.ui.kv0;
public final class w6 extends av0 {
    public final z9 f51276a;
    public final LinearLayout f51277b;
    public final long f51278c;

    public w6(z9 z9Var, LinearLayout linearLayout, long j10) {
        this.f51276a = z9Var;
        this.f51277b = linearLayout;
        this.f51278c = j10;
    }

    @Override
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        z9 z9Var = this.f51276a;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        kv0 kv0Var = new kv0();
        kv0Var.f37752b = iArr[0];
        kv0Var.f37753c = iArr[1];
        kv0Var.d = this.f51277b;
        kv0Var.f37760m = null;
        kv0Var.f37751a = imageReceiver;
        if (z10) {
            kv0Var.e = imageReceiver.getBitmapSafe();
        }
        kv0Var.h = imageReceiver.getRoundRadius(true);
        kv0Var.f37754f = this.f51278c;
        kv0Var.f37757j = 0;
        kv0Var.f37756i = 0;
        return kv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
