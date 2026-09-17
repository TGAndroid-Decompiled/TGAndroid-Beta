package ug;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er0;
import org.telegram.ui.es0;
public final class p implements RequestDelegate {
    public final int f47215a;
    public final Utilities.Callback f47216b;
    public final Utilities.Callback f47217c;

    public p(Utilities.Callback callback, Utilities.Callback callback2, int i10) {
        this.f47215a = i10;
        this.f47216b = callback;
        this.f47217c = callback2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f47215a) {
            case 0:
                AndroidUtilities.runOnUIThread(new er0(tL_error, this.f47216b, this.f47217c, 27));
                return;
            default:
                AndroidUtilities.runOnUIThread(new es0(tL_error, this.f47216b, tLObject, this.f47217c, 25));
                return;
        }
    }
}
