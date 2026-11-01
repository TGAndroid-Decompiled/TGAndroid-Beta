package rh;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g5 implements RequestDelegate {
    public final int f46989a;
    public final e6 f46990b;

    public g5(e6 e6Var, int i10) {
        this.f46989a = i10;
        this.f46990b = e6Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46989a) {
            case 0:
                org.telegram.messenger.i0.g3(new k5(this.f46990b, tLObject, 0));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new k5(this.f46990b, tLObject, 1));
                return;
            case 2:
                org.telegram.messenger.i0.g3(new k5(this.f46990b, tLObject, 2));
                return;
            case 3:
                org.telegram.messenger.i0.g3(new k5(this.f46990b, tLObject, 3));
                return;
            default:
                org.telegram.messenger.i0.g3(new k5(this.f46990b, tLObject, 4));
                return;
        }
    }
}
