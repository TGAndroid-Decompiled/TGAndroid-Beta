package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v1 implements Runnable {
    public final int f52703a;
    public final w3 f52704b;
    public final TLRPC.TL_payments_paymentResult f52705c;

    public v1(w3 w3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52703a = i10;
        this.f52704b = w3Var;
        this.f52705c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52703a) {
            case 0:
                MessagesController.getInstance(this.f52704b.currentAccount).processUpdates(this.f52705c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52704b.currentAccount).processUpdates(this.f52705c.updates, false);
                return;
        }
    }
}
