package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48161a;
    public final x3 f48162b;
    public final TLRPC.TL_payments_paymentResult f48163c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48161a = i10;
        this.f48162b = x3Var;
        this.f48163c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48161a) {
            case 0:
                MessagesController.getInstance(this.f48162b.currentAccount).processUpdates(this.f48163c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48162b.currentAccount).processUpdates(this.f48163c.updates, false);
                return;
        }
    }
}
