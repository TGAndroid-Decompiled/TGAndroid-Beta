package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class z91 implements RequestDelegate {
    public final int f44682a;
    public final db1 f44683b;

    public z91(db1 db1Var, int i10) {
        this.f44682a = i10;
        this.f44683b = db1Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44682a) {
            case 0:
                db1.U(this.f44683b, tLObject);
                return;
            default:
                db1.V(this.f44683b, tLObject);
                return;
        }
    }
}
