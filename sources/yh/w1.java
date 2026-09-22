package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48227a;
    public final y3 f48228b;
    public final TLRPC.TL_payments_paymentResult f48229c;

    public w1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48227a = i10;
        this.f48228b = y3Var;
        this.f48229c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48227a) {
            case 0:
                MessagesController.getInstance(this.f48228b.currentAccount).processUpdates(this.f48229c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48228b.currentAccount).processUpdates(this.f48229c.updates, false);
                return;
        }
    }
}
