package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class d7 extends tu0 {
    public final v9 f47368a;
    public final LinearLayout f47369b;
    public final long f47370c;

    public d7(v9 v9Var, LinearLayout linearLayout, long j3) {
        this.f47368a = v9Var;
        this.f47369b = linearLayout;
        this.f47370c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        v9 v9Var = this.f47368a;
        ImageReceiver imageReceiver = v9Var.getImageReceiver();
        int[] iArr = new int[2];
        v9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33164b = iArr[0];
        dv0Var.f33165c = iArr[1];
        dv0Var.d = this.f47369b;
        dv0Var.f33172m = null;
        dv0Var.f33163a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f33166f = this.f47370c;
        dv0Var.f33169j = 0;
        dv0Var.f33168i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
