package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48216a;
    public final x3 f48217b;
    public final TLRPC.TL_payments_paymentResult f48218c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48216a = i10;
        this.f48217b = x3Var;
        this.f48218c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48216a) {
            case 0:
                MessagesController.getInstance(this.f48217b.currentAccount).processUpdates(this.f48218c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48217b.currentAccount).processUpdates(this.f48218c.updates, false);
                return;
        }
    }
}
