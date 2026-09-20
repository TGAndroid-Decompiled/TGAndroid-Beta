package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48206a;
    public final y3 f48207b;
    public final TLRPC.TL_payments_paymentResult f48208c;

    public w1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48206a = i10;
        this.f48207b = y3Var;
        this.f48208c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48206a) {
            case 0:
                MessagesController.getInstance(this.f48207b.currentAccount).processUpdates(this.f48208c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48207b.currentAccount).processUpdates(this.f48208c.updates, false);
                return;
        }
    }
}
