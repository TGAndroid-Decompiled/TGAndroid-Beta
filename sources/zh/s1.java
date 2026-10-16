package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f51131a;
    public final r3 f51132b;
    public final TLRPC.TL_payments_paymentResult f51133c;

    public s1(r3 r3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f51131a = i10;
        this.f51132b = r3Var;
        this.f51133c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f51131a) {
            case 0:
                MessagesController.getInstance(this.f51132b.currentAccount).lambda$processUpdates$377(this.f51133c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f51132b.currentAccount).lambda$processUpdates$377(this.f51133c.updates, false);
                return;
        }
    }
}
