package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb0 implements RequestDelegate {
    public final int f50693a;
    public final xb0 f50694b;
    public final String f50695c;
    public final String d;

    public vb0(xb0 xb0Var, String str, String str2, int i7) {
        this.f50693a = i7;
        this.f50694b = xb0Var;
        this.f50695c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50693a) {
            case 0:
                org.telegram.messenger.g0.h3(new sb0(this.f50694b, tL_error, this.f50695c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new sb0(this.f50694b, tL_error, tLObject, this.f50695c, this.d));
                return;
        }
    }
}
