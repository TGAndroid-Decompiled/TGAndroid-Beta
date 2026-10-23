package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fy0;
public final class n implements RequestDelegate {
    public final int f48178a;
    public final Utilities.Callback f48179b;
    public final Utilities.Callback f48180c;

    public n(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f48178a = i10;
        this.f48179b = callback;
        this.f48180c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48178a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fy0(tL_error, this.f48179b, this.f48180c, 25));
                return;
            default:
                AndroidUtilities.runOnUIThread(new si.o(tL_error, this.f48179b, tLObject, this.f48180c, 1));
                return;
        }
    }
}
