package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f52143a;
    public final x3 f52144b;
    public final TLRPC.TL_payments_paymentResult f52145c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52143a = i10;
        this.f52144b = x3Var;
        this.f52145c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52143a) {
            case 0:
                MessagesController.getInstance(this.f52144b.currentAccount).processUpdates(this.f52145c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52144b.currentAccount).processUpdates(this.f52145c.updates, false);
                return;
        }
    }
}
