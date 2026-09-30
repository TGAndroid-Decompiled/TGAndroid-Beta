package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48164a;
    public final x3 f48165b;
    public final TLRPC.TL_payments_paymentResult f48166c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48164a = i10;
        this.f48165b = x3Var;
        this.f48166c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48164a) {
            case 0:
                MessagesController.getInstance(this.f48165b.currentAccount).processUpdates(this.f48166c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48165b.currentAccount).processUpdates(this.f48166c.updates, false);
                return;
        }
    }
}
