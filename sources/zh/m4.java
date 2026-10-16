package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f50821a;
    public final n5 f50822b;
    public final TLRPC.TL_payments_paymentResult f50823c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f50821a = i10;
        this.f50822b = n5Var;
        this.f50823c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f50821a) {
            case 0:
                MessagesController.getInstance(this.f50822b.f50865a).lambda$processUpdates$377(this.f50823c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f50822b.f50865a).lambda$processUpdates$377(this.f50823c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f50822b.f50865a).lambda$processUpdates$377(this.f50823c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f50822b.f50865a).lambda$processUpdates$377(this.f50823c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f50822b.f50865a).lambda$processUpdates$377(this.f50823c.updates, false);
                return;
        }
    }
}
