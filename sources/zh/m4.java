package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f50820a;
    public final n5 f50821b;
    public final TLRPC.TL_payments_paymentResult f50822c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f50820a = i10;
        this.f50821b = n5Var;
        this.f50822c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f50820a) {
            case 0:
                MessagesController.getInstance(this.f50821b.f50864a).lambda$processUpdates$377(this.f50822c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f50821b.f50864a).lambda$processUpdates$377(this.f50822c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f50821b.f50864a).lambda$processUpdates$377(this.f50822c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f50821b.f50864a).lambda$processUpdates$377(this.f50822c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f50821b.f50864a).lambda$processUpdates$377(this.f50822c.updates, false);
                return;
        }
    }
}
