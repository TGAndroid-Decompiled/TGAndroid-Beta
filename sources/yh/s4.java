package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f48009a;
    public final s5 f48010b;
    public final TLRPC.TL_payments_paymentResult f48011c;

    public s4(s5 s5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48009a = i10;
        this.f48010b = s5Var;
        this.f48011c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48009a) {
            case 0:
                MessagesController.getInstance(this.f48010b.f48012a).processUpdates(this.f48011c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48010b.f48012a).processUpdates(this.f48011c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48010b.f48012a).processUpdates(this.f48011c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48010b.f48012a).processUpdates(this.f48011c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48010b.f48012a).processUpdates(this.f48011c.updates, false);
                return;
        }
    }
}
