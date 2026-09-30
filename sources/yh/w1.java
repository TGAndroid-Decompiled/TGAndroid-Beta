package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48270a;
    public final x3 f48271b;
    public final TLRPC.TL_payments_paymentResult f48272c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48270a = i10;
        this.f48271b = x3Var;
        this.f48272c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48270a) {
            case 0:
                MessagesController.getInstance(this.f48271b.currentAccount).processUpdates(this.f48272c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48271b.currentAccount).processUpdates(this.f48272c.updates, false);
                return;
        }
    }
}
