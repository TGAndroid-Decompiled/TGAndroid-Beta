package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f52142a;
    public final x3 f52143b;
    public final TLRPC.TL_payments_paymentResult f52144c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52142a = i10;
        this.f52143b = x3Var;
        this.f52144c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52142a) {
            case 0:
                MessagesController.getInstance(this.f52143b.currentAccount).processUpdates(this.f52144c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52143b.currentAccount).processUpdates(this.f52144c.updates, false);
                return;
        }
    }
}
