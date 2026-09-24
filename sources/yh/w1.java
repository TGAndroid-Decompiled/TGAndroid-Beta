package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48151a;
    public final x3 f48152b;
    public final TLRPC.TL_payments_paymentResult f48153c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48151a = i10;
        this.f48152b = x3Var;
        this.f48153c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48151a) {
            case 0:
                MessagesController.getInstance(this.f48152b.currentAccount).processUpdates(this.f48153c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48152b.currentAccount).processUpdates(this.f48153c.updates, false);
                return;
        }
    }
}
