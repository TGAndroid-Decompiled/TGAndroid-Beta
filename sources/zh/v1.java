package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v1 implements Runnable {
    public final int f52735a;
    public final w3 f52736b;
    public final TLRPC.TL_payments_paymentResult f52737c;

    public v1(w3 w3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52735a = i10;
        this.f52736b = w3Var;
        this.f52737c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52735a) {
            case 0:
                MessagesController.getInstance(this.f52736b.currentAccount).processUpdates(this.f52737c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52736b.currentAccount).processUpdates(this.f52737c.updates, false);
                return;
        }
    }
}
