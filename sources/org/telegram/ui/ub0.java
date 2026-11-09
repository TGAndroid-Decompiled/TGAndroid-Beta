package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub0 implements RequestDelegate {
    public final int f50358a;
    public final wb0 f50359b;
    public final String f50360c;
    public final String d;

    public ub0(wb0 wb0Var, String str, String str2, int i7) {
        this.f50358a = i7;
        this.f50359b = wb0Var;
        this.f50360c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50358a) {
            case 0:
                org.telegram.messenger.g0.h3(new rb0(this.f50359b, tL_error, this.f50360c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new rb0(this.f50359b, tL_error, tLObject, this.f50360c, this.d));
                return;
        }
    }
}
