package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class x1 implements Runnable {
    public final int f52213a;
    public final y3 f52214b;
    public final TLRPC.TL_payments_paymentResult f52215c;

    public x1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52213a = i10;
        this.f52214b = y3Var;
        this.f52215c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52213a) {
            case 0:
                MessagesController.getInstance(this.f52214b.currentAccount).processUpdates(this.f52215c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52214b.currentAccount).processUpdates(this.f52215c.updates, false);
                return;
        }
    }
}
