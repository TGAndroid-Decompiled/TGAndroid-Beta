package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class d7 extends tu0 {
    public final v9 f47347a;
    public final LinearLayout f47348b;
    public final long f47349c;

    public d7(v9 v9Var, LinearLayout linearLayout, long j3) {
        this.f47347a = v9Var;
        this.f47348b = linearLayout;
        this.f47349c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        v9 v9Var = this.f47347a;
        ImageReceiver imageReceiver = v9Var.getImageReceiver();
        int[] iArr = new int[2];
        v9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33144b = iArr[0];
        dv0Var.f33145c = iArr[1];
        dv0Var.d = this.f47348b;
        dv0Var.f33152m = null;
        dv0Var.f33143a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f33146f = this.f47349c;
        dv0Var.f33149j = 0;
        dv0Var.f33148i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
