package tg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.es0;
public final class q implements RequestDelegate {
    public final int f43203a;
    public final Utilities.Callback f43204b;
    public final Utilities.Callback f43205c;

    public q(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f43203a = i10;
        this.f43204b = callback;
        this.f43205c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43203a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fr0(tL_error, this.f43204b, this.f43205c, 26));
                return;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.f43204b, tLObject, this.f43205c, 25));
                return;
        }
    }
}
