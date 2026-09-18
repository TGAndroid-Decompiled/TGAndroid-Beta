package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.fv0;
import org.telegram.ui.vu0;
public final class f7 extends vu0 {
    public final u9 f47196a;
    public final LinearLayout f47197b;
    public final long f47198c;

    public f7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.f47196a = u9Var;
        this.f47197b = linearLayout;
        this.f47198c = j3;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.f47196a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.f33768b = iArr[0];
        fv0Var.f33769c = iArr[1];
        fv0Var.d = this.f47197b;
        fv0Var.f33776m = null;
        fv0Var.f33767a = imageReceiver;
        if (z10) {
            fv0Var.e = imageReceiver.getBitmapSafe();
        }
        fv0Var.h = imageReceiver.getRoundRadius(true);
        fv0Var.f33770f = this.f47198c;
        fv0Var.f33773j = 0;
        fv0Var.f33772i = 0;
        return fv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
