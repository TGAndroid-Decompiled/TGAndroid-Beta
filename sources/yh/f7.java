package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;
public final class f7 extends tu0 {
    public final u9 f47168a;
    public final LinearLayout f47169b;
    public final long f47170c;

    public f7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.f47168a = u9Var;
        this.f47169b = linearLayout;
        this.f47170c = j3;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.f47168a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33135b = iArr[0];
        dv0Var.f33136c = iArr[1];
        dv0Var.d = this.f47169b;
        dv0Var.f33143m = null;
        dv0Var.f33134a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f33137f = this.f47170c;
        dv0Var.f33140j = 0;
        dv0Var.f33139i = 0;
        return dv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
