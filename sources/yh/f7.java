package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.fv0;
import org.telegram.ui.vu0;
public final class f7 extends vu0 {
    public final u9 f47191a;
    public final LinearLayout f47192b;
    public final long f47193c;

    public f7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.f47191a = u9Var;
        this.f47192b = linearLayout;
        this.f47193c = j3;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.f47191a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.f33764b = iArr[0];
        fv0Var.f33765c = iArr[1];
        fv0Var.d = this.f47192b;
        fv0Var.f33772m = null;
        fv0Var.f33763a = imageReceiver;
        if (z10) {
            fv0Var.e = imageReceiver.getBitmapSafe();
        }
        fv0Var.h = imageReceiver.getRoundRadius(true);
        fv0Var.f33766f = this.f47193c;
        fv0Var.f33769j = 0;
        fv0Var.f33768i = 0;
        return fv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
