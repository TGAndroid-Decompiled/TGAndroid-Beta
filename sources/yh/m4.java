package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f53089a;
    public final n5 f53090b;
    public final TLRPC.TL_payments_paymentResult f53091c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f53089a = i10;
        this.f53090b = n5Var;
        this.f53091c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f53089a) {
            case 0:
                MessagesController.getInstance(this.f53090b.f53134a).lambda$processUpdates$377(this.f53091c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f53090b.f53134a).lambda$processUpdates$377(this.f53091c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f53090b.f53134a).lambda$processUpdates$377(this.f53091c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f53090b.f53134a).lambda$processUpdates$377(this.f53091c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f53090b.f53134a).lambda$processUpdates$377(this.f53091c.updates, false);
                return;
        }
    }
}
