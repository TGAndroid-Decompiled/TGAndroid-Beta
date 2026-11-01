package xh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import rh.l5;
public final class g2 implements RequestDelegate {
    public final int f53786a;
    public final h2 f53787b;

    public g2(h2 h2Var, int i10) {
        this.f53786a = i10;
        this.f53787b = h2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f53786a) {
            case 0:
                m2 m2Var = this.f53787b.d;
                if (tLObject instanceof TLRPC.TL_updates) {
                    wp.r1(m2Var.H).L3((TLRPC.TL_updates) tLObject, false);
                }
                org.telegram.messenger.i0.g3(new q1(m2Var, 16));
                return;
            default:
                org.telegram.messenger.i0.g3(new l5(this.f53787b, tLObject, tL_error, 24));
                return;
        }
    }
}
