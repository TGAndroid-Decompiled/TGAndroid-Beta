package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;
public final class c7 extends su0 {
    public final x9 f51801a;
    public final LinearLayout f51802b;
    public final long f51803c;

    public c7(x9 x9Var, LinearLayout linearLayout, long j3) {
        this.f51801a = x9Var;
        this.f51802b = linearLayout;
        this.f51803c = j3;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x9 x9Var = this.f51801a;
        ImageReceiver imageReceiver = x9Var.getImageReceiver();
        int[] iArr = new int[2];
        x9Var.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.f35569b = iArr[0];
        cv0Var.f35570c = iArr[1];
        cv0Var.d = this.f51802b;
        cv0Var.f35578m = null;
        cv0Var.f35568a = imageReceiver;
        if (z10) {
            cv0Var.f35571e = imageReceiver.getBitmapSafe();
        }
        cv0Var.h = imageReceiver.getRoundRadius(true);
        cv0Var.f35572f = this.f51803c;
        cv0Var.f35575j = 0;
        cv0Var.f35574i = 0;
        return cv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
