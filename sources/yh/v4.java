package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class v4 implements Runnable {
    public final int f47915a;
    public final v5 f47916b;
    public final TLRPC.TL_payments_paymentResult f47917c;

    public v4(v5 v5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47915a = i10;
        this.f47916b = v5Var;
        this.f47917c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47915a) {
            case 0:
                MessagesController.getInstance(this.f47916b.f47918a).processUpdates(this.f47917c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47916b.f47918a).processUpdates(this.f47917c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47916b.f47918a).processUpdates(this.f47917c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47916b.f47918a).processUpdates(this.f47917c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47916b.f47918a).processUpdates(this.f47917c.updates, false);
                return;
        }
    }
}
