package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;
public final class c7 extends su0 {
    public final x9 f51800a;
    public final LinearLayout f51801b;
    public final long f51802c;

    public c7(x9 x9Var, LinearLayout linearLayout, long j3) {
        this.f51800a = x9Var;
        this.f51801b = linearLayout;
        this.f51802c = j3;
    }

    @Override
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x9 x9Var = this.f51800a;
        ImageReceiver imageReceiver = x9Var.getImageReceiver();
        int[] iArr = new int[2];
        x9Var.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.f35568b = iArr[0];
        cv0Var.f35569c = iArr[1];
        cv0Var.d = this.f51801b;
        cv0Var.f35577m = null;
        cv0Var.f35567a = imageReceiver;
        if (z10) {
            cv0Var.f35570e = imageReceiver.getBitmapSafe();
        }
        cv0Var.h = imageReceiver.getRoundRadius(true);
        cv0Var.f35571f = this.f51802c;
        cv0Var.f35574j = 0;
        cv0Var.f35573i = 0;
        return cv0Var;
    }

    @Override
    public final boolean K() {
        return true;
    }
}
