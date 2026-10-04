package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f51961a;
    public final t5 f51962b;
    public final TLRPC.TL_payments_paymentResult f51963c;

    public s4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f51961a = i10;
        this.f51962b = t5Var;
        this.f51963c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f51961a) {
            case 0:
                MessagesController.getInstance(this.f51962b.f52011a).processUpdates(this.f51963c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f51962b.f52011a).processUpdates(this.f51963c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f51962b.f52011a).processUpdates(this.f51963c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f51962b.f52011a).processUpdates(this.f51963c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f51962b.f52011a).processUpdates(this.f51963c.updates, false);
                return;
        }
    }
}
