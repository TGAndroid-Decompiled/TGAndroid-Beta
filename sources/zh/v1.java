package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v1 implements Runnable {
    public final int f52704a;
    public final w3 f52705b;
    public final TLRPC.TL_payments_paymentResult f52706c;

    public v1(w3 w3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52704a = i10;
        this.f52705b = w3Var;
        this.f52706c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52704a) {
            case 0:
                MessagesController.getInstance(this.f52705b.currentAccount).processUpdates(this.f52706c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52705b.currentAccount).processUpdates(this.f52706c.updates, false);
                return;
        }
    }
}
