package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class m4 implements Runnable {
    public final int f52952a;
    public final n5 f52953b;
    public final TLRPC.TL_payments_paymentResult f52954c;

    public m4(n5 n5Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f52952a = i10;
        this.f52953b = n5Var;
        this.f52954c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f52952a) {
            case 0:
                MessagesController.getInstance(this.f52953b.f52997a).lambda$processUpdates$377(this.f52954c.updates, false);
                return;
            case 1:
                MessagesController.getInstance(this.f52953b.f52997a).lambda$processUpdates$377(this.f52954c.updates, false);
                return;
            case 2:
                MessagesController.getInstance(this.f52953b.f52997a).lambda$processUpdates$377(this.f52954c.updates, false);
                return;
            case 3:
                MessagesController.getInstance(this.f52953b.f52997a).lambda$processUpdates$377(this.f52954c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f52953b.f52997a).lambda$processUpdates$377(this.f52954c.updates, false);
                return;
        }
    }
}
