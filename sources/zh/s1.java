package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s1 implements Runnable {
    public final int f51130a;
    public final r3 f51131b;
    public final TLRPC.TL_payments_paymentResult f51132c;

    public s1(r3 r3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f51130a = i10;
        this.f51131b = r3Var;
        this.f51132c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f51130a) {
            case 0:
                MessagesController.getInstance(this.f51131b.currentAccount).lambda$processUpdates$377(this.f51132c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f51131b.currentAccount).lambda$processUpdates$377(this.f51132c.updates, false);
                return;
        }
    }
}
