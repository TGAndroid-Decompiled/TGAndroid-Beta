package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ud0 implements RequestDelegate {
    public final int f41147a;
    public final ee0 f41148b;
    public final String f41149c;

    public ud0(ee0 ee0Var, String str, int i10) {
        this.f41147a = i10;
        this.f41148b = ee0Var;
        this.f41149c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41147a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wd0(this.f41148b, tL_error, this.f41149c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new wd0(this.f41148b, tL_error, tLObject, this.f41149c));
                return;
        }
    }
}
