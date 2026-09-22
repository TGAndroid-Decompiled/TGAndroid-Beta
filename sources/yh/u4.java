package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class u4 implements Runnable {
    public final int f47798a;
    public final u5 f47799b;
    public final TLRPC.TL_payments_paymentResult f47800c;

    public u4(u5 u5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f47798a = i10;
        this.f47799b = u5Var;
        this.f47800c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f47798a) {
            case 0:
                MessagesController.getInstance(this.f47799b.f47801a).processUpdates(this.f47800c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f47799b.f47801a).processUpdates(this.f47800c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f47799b.f47801a).processUpdates(this.f47800c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f47799b.f47801a).processUpdates(this.f47800c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f47799b.f47801a).processUpdates(this.f47800c.updates, false);
                return;
        }
    }
}
