package xh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f46207a;
    public final x3 f46208b;
    public final TLRPC.TL_payments_paymentResult f46209c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f46207a = i10;
        this.f46208b = x3Var;
        this.f46209c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f46207a) {
            case 0:
                MessagesController.getInstance(this.f46208b.currentAccount).processUpdates(this.f46209c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f46208b.currentAccount).processUpdates(this.f46209c.updates, false);
                return;
        }
    }
}
