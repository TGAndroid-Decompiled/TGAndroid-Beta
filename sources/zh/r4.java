package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class r4 implements Runnable {
    public final int f52509a;
    public final s5 f52510b;
    public final TLRPC.TL_payments_paymentResult f52511c;

    public r4(s5 s5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52509a = i10;
        this.f52510b = s5Var;
        this.f52511c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52509a) {
            case 0:
                MessagesController.getInstance(this.f52510b.f52566a).processUpdates(this.f52511c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52510b.f52566a).processUpdates(this.f52511c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52510b.f52566a).processUpdates(this.f52511c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52510b.f52566a).processUpdates(this.f52511c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52510b.f52566a).processUpdates(this.f52511c.updates, false);
                return;
        }
    }
}
