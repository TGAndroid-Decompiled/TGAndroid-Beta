package yh;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class t1 implements Runnable {
    public final int f53335a;
    public final s3 f53336b;
    public final TLRPC.TL_payments_paymentResult f53337c;

    public t1(s3 s3Var, TLRPC.TL_payments_paymentResult tL_payments_paymentResult, int i10) {
        this.f53335a = i10;
        this.f53336b = s3Var;
        this.f53337c = tL_payments_paymentResult;
    }

    @Override
    public final void run() {
        switch (this.f53335a) {
            case 0:
                MessagesController.getInstance(this.f53336b.currentAccount).lambda$processUpdates$377(this.f53337c.updates, false);
                return;
            default:
                MessagesController.getInstance(this.f53336b.currentAccount).lambda$processUpdates$377(this.f53337c.updates, false);
                return;
        }
    }
}
