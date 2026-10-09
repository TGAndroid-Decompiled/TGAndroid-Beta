package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f52877a;
    public final m5 f52878b;
    public final TLRPC.TL_payments_paymentResult f52879c;

    public m4(m5 m5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52877a = i10;
        this.f52878b = m5Var;
        this.f52879c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52877a) {
            case 0:
                MessagesController.getInstance(this.f52878b.f52880a).lambda$processUpdates$377(this.f52879c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52878b.f52880a).lambda$processUpdates$377(this.f52879c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52878b.f52880a).lambda$processUpdates$377(this.f52879c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52878b.f52880a).lambda$processUpdates$377(this.f52879c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52878b.f52880a).lambda$processUpdates$377(this.f52879c.updates, false);
                return;
        }
    }
}
