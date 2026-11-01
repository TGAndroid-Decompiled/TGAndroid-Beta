package rh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class y1 implements Runnable {
    public final int f47722a;
    public final e4 f47723b;
    public final TLRPC.TL_payments_paymentResult f47724c;

    public y1(e4 e4Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47722a = i10;
        this.f47723b = e4Var;
        this.f47724c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47722a) {
            case 0:
                wp.r1(this.f47723b.f21584a).L3(this.f47724c.updates, false);
                return;
            default:
                wp.r1(this.f47723b.f21584a).L3(this.f47724c.updates, false);
                return;
        }
    }
}
