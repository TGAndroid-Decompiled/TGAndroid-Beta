package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Runnable {
    public final int f48039a;
    public final t5 f48040b;
    public final TLRPC.TL_payments_paymentResult f48041c;

    public t4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48039a = i10;
        this.f48040b = t5Var;
        this.f48041c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48039a) {
            case 0:
                MessagesController.getInstance(this.f48040b.f48042a).processUpdates(this.f48041c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48040b.f48042a).processUpdates(this.f48041c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48040b.f48042a).processUpdates(this.f48041c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48040b.f48042a).processUpdates(this.f48041c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48040b.f48042a).processUpdates(this.f48041c.updates, false);
                return;
        }
    }
}
