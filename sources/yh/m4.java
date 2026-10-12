package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f53101a;
    public final n5 f53102b;
    public final TLRPC.TL_payments_paymentResult f53103c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f53101a = i10;
        this.f53102b = n5Var;
        this.f53103c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f53101a) {
            case 0:
                MessagesController.getInstance(this.f53102b.f53146a).lambda$processUpdates$377(this.f53103c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f53102b.f53146a).lambda$processUpdates$377(this.f53103c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f53102b.f53146a).lambda$processUpdates$377(this.f53103c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f53102b.f53146a).lambda$processUpdates$377(this.f53103c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f53102b.f53146a).lambda$processUpdates$377(this.f53103c.updates, false);
                return;
        }
    }
}
