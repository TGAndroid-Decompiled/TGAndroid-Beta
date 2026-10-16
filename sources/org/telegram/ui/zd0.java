package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zd0 implements RequestDelegate {
    public final int f42281a;
    public final je0 f42282b;
    public final String f42283c;

    public zd0(je0 je0Var, String str, int i10) {
        this.f42281a = i10;
        this.f42282b = je0Var;
        this.f42283c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42281a) {
            case 0:
                AndroidUtilities.runOnUIThread(new be0(this.f42282b, tL_error, this.f42283c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new be0(this.f42282b, tL_error, tLObject, this.f42283c));
                return;
        }
    }
}
