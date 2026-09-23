package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Runnable {
    public final int f47729a;
    public final t5 f47730b;
    public final TLRPC.TL_payments_paymentResult f47731c;

    public t4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47729a = i10;
        this.f47730b = t5Var;
        this.f47731c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47729a) {
            case 0:
                MessagesController.getInstance(this.f47730b.f47732a).processUpdates(this.f47731c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47730b.f47732a).processUpdates(this.f47731c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47730b.f47732a).processUpdates(this.f47731c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47730b.f47732a).processUpdates(this.f47731c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47730b.f47732a).processUpdates(this.f47731c.updates, false);
                return;
        }
    }
}
