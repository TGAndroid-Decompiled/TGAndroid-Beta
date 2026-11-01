package rh;

import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
public final class b5 implements Runnable {
    public final int f46696a;
    public final e6 f46697b;
    public final TLRPC.TL_payments_paymentResult f46698c;

    public b5(e6 e6Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f46696a = i10;
        this.f46697b = e6Var;
        this.f46698c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f46696a) {
            case 0:
                wp.r1(this.f46697b.f46863a).L3(this.f46698c.updates, false);
                return;
            case 1:
                wp.r1(this.f46697b.f46863a).L3(this.f46698c.updates, false);
                return;
            case 2:
                wp.r1(this.f46697b.f46863a).L3(this.f46698c.updates, false);
                return;
            case 3:
                wp.r1(this.f46697b.f46863a).L3(this.f46698c.updates, false);
                return;
            default:
                wp.r1(this.f46697b.f46863a).L3(this.f46698c.updates, false);
                return;
        }
    }
}
