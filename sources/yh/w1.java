package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class w1 implements Runnable {
    public final int f47951a;
    public final a4 f47952b;
    public final TLRPC.TL_payments_paymentResult f47953c;

    public w1(a4 a4Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47951a = i10;
        this.f47952b = a4Var;
        this.f47953c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47951a) {
            case 0:
                MessagesController.getInstance(this.f47952b.currentAccount).processUpdates(this.f47953c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47952b.currentAccount).processUpdates(this.f47953c.updates, false);
                return;
        }
    }
}
