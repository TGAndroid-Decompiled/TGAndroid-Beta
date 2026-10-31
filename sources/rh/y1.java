package rh;

import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
public final class y1 implements Runnable {
    public final int f47708a;
    public final e4 f47709b;
    public final TLRPC.TL_payments_paymentResult f47710c;

    public y1(e4 e4Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47708a = i10;
        this.f47709b = e4Var;
        this.f47710c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47708a) {
            case 0:
                vp.r1(this.f47709b.f21583a).L3(this.f47710c.updates, false);
                return;
            default:
                vp.r1(this.f47709b.f21583a).L3(this.f47710c.updates, false);
                return;
        }
    }
}
