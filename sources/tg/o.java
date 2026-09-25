package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.jr0;
public final class o implements RequestDelegate {
    public final int f43465a;
    public final Utilities.Callback f43466b;
    public final Utilities.Callback f43467c;

    public o(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43465a = i10;
        this.f43466b = callback;
        this.f43467c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43465a) {
            case 0:
                AndroidUtilities.runOnUIThread(new cn0(tL_error, this.f43466b, this.f43467c, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jr0(tL_error, this.f43466b, tLObject, this.f43467c, 26));
                return;
        }
    }
}
