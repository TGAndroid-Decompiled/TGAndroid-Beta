package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f47862a;
    public final z3 f47863b;
    public final TLRPC.TL_payments_paymentResult f47864c;

    public w1(z3 z3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47862a = i10;
        this.f47863b = z3Var;
        this.f47864c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47862a) {
            case 0:
                MessagesController.getInstance(this.f47863b.currentAccount).processUpdates(this.f47864c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47863b.currentAccount).processUpdates(this.f47864c.updates, false);
                return;
        }
    }
}
