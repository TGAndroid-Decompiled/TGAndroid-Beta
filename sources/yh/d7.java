package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;
public final class d7 extends lu0 {
    public final w9 f47306a;
    public final LinearLayout f47307b;
    public final long f47308c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f47306a = w9Var;
        this.f47307b = linearLayout;
        this.f47308c = j3;
    }

    @Override
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f47306a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.f38820b = iArr[0];
        vu0Var.f38821c = iArr[1];
        vu0Var.d = this.f47307b;
        vu0Var.f38828m = null;
        vu0Var.f38819a = imageReceiver;
        if (z10) {
            vu0Var.e = imageReceiver.getBitmapSafe();
        }
        vu0Var.h = imageReceiver.getRoundRadius(true);
        vu0Var.f38822f = this.f47308c;
        vu0Var.f38825j = 0;
        vu0Var.f38824i = 0;
        return vu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
