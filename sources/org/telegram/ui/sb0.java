package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sb0 implements RequestDelegate {
    public final int f51187a;
    public final tb0 f51188b;
    public final String f51189c;
    public final String d;

    public sb0(tb0 tb0Var, String str, String str2, int i7) {
        this.f51187a = i7;
        this.f51188b = tb0Var;
        this.f51189c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51187a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this.f51188b, tL_error, this.f51189c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new pb0(this.f51188b, tL_error, tLObject, this.f51189c, this.d));
                return;
        }
    }
}
