package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f47986a;
    public final t5 f47987b;
    public final TLRPC.TL_payments_paymentResult f47988c;

    public s4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47986a = i10;
        this.f47987b = t5Var;
        this.f47988c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47986a) {
            case 0:
                MessagesController.getInstance(this.f47987b.f48028a).processUpdates(this.f47988c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47987b.f48028a).processUpdates(this.f47988c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47987b.f48028a).processUpdates(this.f47988c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47987b.f48028a).processUpdates(this.f47988c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47987b.f48028a).processUpdates(this.f47988c.updates, false);
                return;
        }
    }
}
