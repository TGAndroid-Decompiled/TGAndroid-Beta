package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Runnable {
    public final int f47920a;
    public final v5 f47921b;
    public final TLRPC.TL_payments_paymentResult f47922c;

    public v4(v5 v5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47920a = i10;
        this.f47921b = v5Var;
        this.f47922c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47920a) {
            case 0:
                MessagesController.getInstance(this.f47921b.f47923a).processUpdates(this.f47922c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47921b.f47923a).processUpdates(this.f47922c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47921b.f47923a).processUpdates(this.f47922c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47921b.f47923a).processUpdates(this.f47922c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47921b.f47923a).processUpdates(this.f47922c.updates, false);
                return;
        }
    }
}
