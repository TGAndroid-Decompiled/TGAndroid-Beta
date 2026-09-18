package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f47956a;
    public final a4 f47957b;
    public final TLRPC.TL_payments_paymentResult f47958c;

    public w1(a4 a4Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47956a = i10;
        this.f47957b = a4Var;
        this.f47958c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47956a) {
            case 0:
                MessagesController.getInstance(this.f47957b.currentAccount).processUpdates(this.f47958c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47957b.currentAccount).processUpdates(this.f47958c.updates, false);
                return;
        }
    }
}
