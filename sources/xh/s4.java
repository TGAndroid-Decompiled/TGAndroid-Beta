package xh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f46032a;
    public final v5 f46033b;
    public final TLRPC.TL_payments_paymentResult f46034c;

    public s4(v5 v5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f46032a = i10;
        this.f46033b = v5Var;
        this.f46034c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f46032a) {
            case 0:
                MessagesController.getInstance(this.f46033b.f46176a).processUpdates(this.f46034c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f46033b.f46176a).processUpdates(this.f46034c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f46033b.f46176a).processUpdates(this.f46034c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f46033b.f46176a).processUpdates(this.f46034c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f46033b.f46176a).processUpdates(this.f46034c.updates, false);
                return;
        }
    }
}
