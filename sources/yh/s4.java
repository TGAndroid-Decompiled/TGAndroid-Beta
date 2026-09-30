package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class s4 implements Runnable {
    public final int f48116a;
    public final s5 f48117b;
    public final TLRPC.TL_payments_paymentResult f48118c;

    public s4(s5 s5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f48116a = i10;
        this.f48117b = s5Var;
        this.f48118c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f48116a) {
            case 0:
                MessagesController.getInstance(this.f48117b.f48119a).processUpdates(this.f48118c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f48117b.f48119a).processUpdates(this.f48118c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f48117b.f48119a).processUpdates(this.f48118c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f48117b.f48119a).processUpdates(this.f48118c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f48117b.f48119a).processUpdates(this.f48118c.updates, false);
                return;
        }
    }
}
