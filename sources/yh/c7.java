package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;
public final class c7 extends ou0 {
    public final w9 f47327a;
    public final LinearLayout f47328b;
    public final long f47329c;

    public c7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.f47327a = w9Var;
        this.f47328b = linearLayout;
        this.f47329c = j3;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.f47327a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.f40326b = iArr[0];
        yu0Var.f40327c = iArr[1];
        yu0Var.d = this.f47328b;
        yu0Var.f40334m = null;
        yu0Var.f40325a = imageReceiver;
        if (z10) {
            yu0Var.e = imageReceiver.getBitmapSafe();
        }
        yu0Var.h = imageReceiver.getRoundRadius(true);
        yu0Var.f40328f = this.f47329c;
        yu0Var.f40331j = 0;
        yu0Var.f40330i = 0;
        return yu0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
