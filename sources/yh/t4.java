package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t4 implements Runnable {
    public final int f48066a;
    public final u5 f48067b;
    public final TLRPC.TL_payments_paymentResult f48068c;

    public t4(u5 u5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48066a = i10;
        this.f48067b = u5Var;
        this.f48068c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48066a) {
            case 0:
                MessagesController.getInstance(this.f48067b.f48111a).processUpdates(this.f48068c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48067b.f48111a).processUpdates(this.f48068c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48067b.f48111a).processUpdates(this.f48068c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48067b.f48111a).processUpdates(this.f48068c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48067b.f48111a).processUpdates(this.f48068c.updates, false);
                return;
        }
    }
}
