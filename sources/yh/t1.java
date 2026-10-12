package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t1 implements Runnable {
    public final int f53450a;
    public final s3 f53451b;
    public final TLRPC.TL_payments_paymentResult f53452c;

    public t1(s3 s3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f53450a = i10;
        this.f53451b = s3Var;
        this.f53452c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f53450a) {
            case 0:
                MessagesController.getInstance(this.f53451b.currentAccount).lambda$processUpdates$377(this.f53452c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f53451b.currentAccount).lambda$processUpdates$377(this.f53452c.updates, false);
                return;
        }
    }
}
