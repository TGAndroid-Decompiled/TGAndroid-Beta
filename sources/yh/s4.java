package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f47999a;
    public final t5 f48000b;
    public final TLRPC.TL_payments_paymentResult f48001c;

    public s4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47999a = i10;
        this.f48000b = t5Var;
        this.f48001c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47999a) {
            case 0:
                MessagesController.getInstance(this.f48000b.f48041a).processUpdates(this.f48001c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48000b.f48041a).processUpdates(this.f48001c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48000b.f48041a).processUpdates(this.f48001c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48000b.f48041a).processUpdates(this.f48001c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48000b.f48041a).processUpdates(this.f48001c.updates, false);
                return;
        }
    }
}
