package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Runnable {
    public final int f52018a;
    public final u5 f52019b;
    public final TLRPC.TL_payments_paymentResult f52020c;

    public t4(u5 u5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52018a = i10;
        this.f52019b = u5Var;
        this.f52020c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52018a) {
            case 0:
                MessagesController.getInstance(this.f52019b.f52085a).processUpdates(this.f52020c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52019b.f52085a).processUpdates(this.f52020c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52019b.f52085a).processUpdates(this.f52020c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52019b.f52085a).processUpdates(this.f52020c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52019b.f52085a).processUpdates(this.f52020c.updates, false);
                return;
        }
    }
}
