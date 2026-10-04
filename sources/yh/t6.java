package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;
public final class t6 extends ou0 {
    public final w9 f52039a;
    public final LinearLayout f52040b;
    public final long f52041c;

    public t6(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f52039a = w9Var;
        this.f52040b = linearLayout;
        this.f52041c = j3;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f52039a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.f43628b = iArr[0];
        yu0Var.f43629c = iArr[1];
        yu0Var.d = this.f52040b;
        yu0Var.f43637m = null;
        yu0Var.f43627a = imageReceiver;
        if (z10) {
            yu0Var.f43630e = imageReceiver.getBitmapSafe();
        }
        yu0Var.h = imageReceiver.getRoundRadius(true);
        yu0Var.f43631f = this.f52041c;
        yu0Var.f43634j = 0;
        yu0Var.f43633i = 0;
        return yu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
