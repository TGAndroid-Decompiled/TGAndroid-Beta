package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f52875a;
    public final m5 f52876b;
    public final TLRPC.TL_payments_paymentResult f52877c;

    public m4(m5 m5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52875a = i10;
        this.f52876b = m5Var;
        this.f52877c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52875a) {
            case 0:
                MessagesController.getInstance(this.f52876b.f52878a).lambda$processUpdates$377(this.f52877c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52876b.f52878a).lambda$processUpdates$377(this.f52877c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52876b.f52878a).lambda$processUpdates$377(this.f52877c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52876b.f52878a).lambda$processUpdates$377(this.f52877c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52876b.f52878a).lambda$processUpdates$377(this.f52877c.updates, false);
                return;
        }
    }
}
