package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v1 implements Runnable {
    public final int f52734a;
    public final w3 f52735b;
    public final TLRPC.TL_payments_paymentResult f52736c;

    public v1(w3 w3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52734a = i10;
        this.f52735b = w3Var;
        this.f52736c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52734a) {
            case 0:
                MessagesController.getInstance(this.f52735b.currentAccount).processUpdates(this.f52736c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52735b.currentAccount).processUpdates(this.f52736c.updates, false);
                return;
        }
    }
}
