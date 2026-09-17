package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;
public final class c7 extends su0 {
    public final x9 f51770a;
    public final LinearLayout f51771b;
    public final long f51772c;

    public c7(x9 x9Var, LinearLayout linearLayout, long j3) {
        this.f51770a = x9Var;
        this.f51771b = linearLayout;
        this.f51772c = j3;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x9 x9Var = this.f51770a;
        ImageReceiver imageReceiver = x9Var.getImageReceiver();
        int[] iArr = new int[2];
        x9Var.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.f35542b = iArr[0];
        cv0Var.f35543c = iArr[1];
        cv0Var.d = this.f51771b;
        cv0Var.f35551m = null;
        cv0Var.f35541a = imageReceiver;
        if (z10) {
            cv0Var.f35544e = imageReceiver.getBitmapSafe();
        }
        cv0Var.h = imageReceiver.getRoundRadius(true);
        cv0Var.f35545f = this.f51772c;
        cv0Var.f35548j = 0;
        cv0Var.f35547i = 0;
        return cv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
