package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.mu0;
import org.telegram.ui.wu0;
public final class d7 extends mu0 {
    public final w9 f46993a;
    public final LinearLayout f46994b;
    public final long f46995c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f46993a = w9Var;
        this.f46994b = linearLayout;
        this.f46995c = j3;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f46993a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        wu0 wu0Var = new wu0();
        wu0Var.f39095b = iArr[0];
        wu0Var.f39096c = iArr[1];
        wu0Var.d = this.f46994b;
        wu0Var.f39103m = null;
        wu0Var.f39094a = imageReceiver;
        if (z10) {
            wu0Var.e = imageReceiver.getBitmapSafe();
        }
        wu0Var.h = imageReceiver.getRoundRadius(true);
        wu0Var.f39097f = this.f46995c;
        wu0Var.f39100j = 0;
        wu0Var.f39099i = 0;
        return wu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
