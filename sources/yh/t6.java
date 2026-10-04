package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;
public final class t6 extends ou0 {
    public final w9 f52034a;
    public final LinearLayout f52035b;
    public final long f52036c;

    public t6(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f52034a = w9Var;
        this.f52035b = linearLayout;
        this.f52036c = j3;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f52034a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.f43621b = iArr[0];
        yu0Var.f43622c = iArr[1];
        yu0Var.d = this.f52035b;
        yu0Var.f43630m = null;
        yu0Var.f43620a = imageReceiver;
        if (z10) {
            yu0Var.f43623e = imageReceiver.getBitmapSafe();
        }
        yu0Var.h = imageReceiver.getRoundRadius(true);
        yu0Var.f43624f = this.f52036c;
        yu0Var.f43627j = 0;
        yu0Var.f43626i = 0;
        return yu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
