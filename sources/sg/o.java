package sg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.fy0;
public final class o implements RequestDelegate {
    public final int f41961a;
    public final Utilities.Callback f41962b;
    public final Utilities.Callback f41963c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f41961a = i10;
        this.f41962b = callback;
        this.f41963c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41961a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sx0(tL_error, this.f41962b, this.f41963c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new fy0(tL_error, this.f41962b, tLObject, this.f41963c, 21));
                return;
        }
    }
}
