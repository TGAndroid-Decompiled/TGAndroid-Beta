package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f47856a;
    public final y3 f47857b;
    public final TLRPC.TL_payments_paymentResult f47858c;

    public w1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47856a = i10;
        this.f47857b = y3Var;
        this.f47858c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47856a) {
            case 0:
                MessagesController.getInstance(this.f47857b.currentAccount).processUpdates(this.f47858c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47857b.currentAccount).processUpdates(this.f47858c.updates, false);
                return;
        }
    }
}
