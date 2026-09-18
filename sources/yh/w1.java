package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f48172a;
    public final y3 f48173b;
    public final TLRPC.TL_payments_paymentResult f48174c;

    public w1(y3 y3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48172a = i10;
        this.f48173b = y3Var;
        this.f48174c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48172a) {
            case 0:
                MessagesController.getInstance(this.f48173b.currentAccount).processUpdates(this.f48174c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48173b.currentAccount).processUpdates(this.f48174c.updates, false);
                return;
        }
    }
}
