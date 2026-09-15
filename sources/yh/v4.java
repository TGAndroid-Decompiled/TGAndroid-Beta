package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Runnable {
    public final int f47892a;
    public final v5 f47893b;
    public final TLRPC.TL_payments_paymentResult f47894c;

    public v4(v5 v5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47892a = i10;
        this.f47893b = v5Var;
        this.f47894c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47892a) {
            case 0:
                MessagesController.getInstance(this.f47893b.f47895a).processUpdates(this.f47894c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47893b.f47895a).processUpdates(this.f47894c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47893b.f47895a).processUpdates(this.f47894c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47893b.f47895a).processUpdates(this.f47894c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47893b.f47895a).processUpdates(this.f47894c.updates, false);
                return;
        }
    }
}
