package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48163a;
    public final x3 f48164b;
    public final TLRPC.TL_payments_paymentResult f48165c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48163a = i10;
        this.f48164b = x3Var;
        this.f48165c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48163a) {
            case 0:
                MessagesController.getInstance(this.f48164b.currentAccount).processUpdates(this.f48165c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48164b.currentAccount).processUpdates(this.f48165c.updates, false);
                return;
        }
    }
}
