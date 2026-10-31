package rh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f46682a;
    public final e6 f46683b;
    public final TLRPC.TL_payments_paymentResult f46684c;

    public b5(e6 e6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f46682a = i10;
        this.f46683b = e6Var;
        this.f46684c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f46682a) {
            case 0:
                vp.r1(this.f46683b.f46849a).L3(this.f46684c.updates, false);
                return;
            case 1:
                vp.r1(this.f46683b.f46849a).L3(this.f46684c.updates, false);
                return;
            case 2:
                vp.r1(this.f46683b.f46849a).L3(this.f46684c.updates, false);
                return;
            case 3:
                vp.r1(this.f46683b.f46849a).L3(this.f46684c.updates, false);
                return;
            default:
                vp.r1(this.f46683b.f46849a).L3(this.f46684c.updates, false);
                return;
        }
    }
}
