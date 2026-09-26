package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f48007a;
    public final s5 f48008b;
    public final TLRPC.TL_payments_paymentResult f48009c;

    public s4(s5 s5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48007a = i10;
        this.f48008b = s5Var;
        this.f48009c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48007a) {
            case 0:
                MessagesController.getInstance(this.f48008b.f48010a).processUpdates(this.f48009c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48008b.f48010a).processUpdates(this.f48009c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48008b.f48010a).processUpdates(this.f48009c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48008b.f48010a).processUpdates(this.f48009c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48008b.f48010a).processUpdates(this.f48009c.updates, false);
                return;
        }
    }
}
