package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48162a;
    public final x3 f48163b;
    public final TLRPC.TL_payments_paymentResult f48164c;

    public w1(x3 x3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48162a = i10;
        this.f48163b = x3Var;
        this.f48164c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48162a) {
            case 0:
                MessagesController.getInstance(this.f48163b.currentAccount).processUpdates(this.f48164c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48163b.currentAccount).processUpdates(this.f48164c.updates, false);
                return;
        }
    }
}
