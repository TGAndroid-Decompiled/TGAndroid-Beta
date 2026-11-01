package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zc0 implements RequestDelegate {
    public final int f43923a;
    public final ad0 f43924b;
    public final String f43925c;
    public final String d;

    public zc0(ad0 ad0Var, String str, String str2, int i10) {
        this.f43923a = i10;
        this.f43924b = ad0Var;
        this.f43925c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43923a) {
            case 0:
                org.telegram.messenger.i0.g3(new wc0(this.f43924b, tL_error, this.f43925c, this.d, tLObject));
                return;
            default:
                org.telegram.messenger.i0.g3(new wc0(this.f43924b, tL_error, tLObject, this.f43925c, this.d));
                return;
        }
    }
}
