package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f51966a;
    public final t5 f51967b;
    public final TLRPC.TL_payments_paymentResult f51968c;

    public s4(t5 t5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f51966a = i10;
        this.f51967b = t5Var;
        this.f51968c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f51966a) {
            case 0:
                MessagesController.getInstance(this.f51967b.f52016a).processUpdates(this.f51968c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f51967b.f52016a).processUpdates(this.f51968c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f51967b.f52016a).processUpdates(this.f51968c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f51967b.f52016a).processUpdates(this.f51968c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f51967b.f52016a).processUpdates(this.f51968c.updates, false);
                return;
        }
    }
}
