package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f52148a;
    public final x3 f52149b;
    public final TLRPC.TL_payments_paymentResult f52150c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52148a = i10;
        this.f52149b = x3Var;
        this.f52150c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52148a) {
            case 0:
                MessagesController.getInstance(this.f52149b.currentAccount).processUpdates(this.f52150c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52149b.currentAccount).processUpdates(this.f52150c.updates, false);
                return;
        }
    }
}
