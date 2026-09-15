package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f47928a;
    public final a4 f47929b;
    public final TLRPC.TL_payments_paymentResult f47930c;

    public w1(a4 a4Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47928a = i10;
        this.f47929b = a4Var;
        this.f47930c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47928a) {
            case 0:
                MessagesController.getInstance(this.f47929b.currentAccount).processUpdates(this.f47930c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47929b.currentAccount).processUpdates(this.f47930c.updates, false);
                return;
        }
    }
}
