package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f52986a;
    public final n5 f52987b;
    public final TLRPC.TL_payments_paymentResult f52988c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52986a = i10;
        this.f52987b = n5Var;
        this.f52988c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52986a) {
            case 0:
                MessagesController.getInstance(this.f52987b.f53031a).lambda$processUpdates$377(this.f52988c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52987b.f53031a).lambda$processUpdates$377(this.f52988c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52987b.f53031a).lambda$processUpdates$377(this.f52988c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52987b.f53031a).lambda$processUpdates$377(this.f52988c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52987b.f53031a).lambda$processUpdates$377(this.f52988c.updates, false);
                return;
        }
    }
}
