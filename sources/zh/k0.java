package zh;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k0 implements Runnable {
    public final int f51797a;
    public final Object f51798b;
    public final Object f51799c;

    public k0(int i10, Object obj, Object obj2) {
        this.f51797a = i10;
        this.f51798b = obj;
        this.f51799c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f51797a) {
            case 0:
                ((Utilities.Callback) this.f51798b).run((e) this.f51799c);
                return;
            default:
                ((MessagesController) this.f51798b).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.f51799c), false);
                return;
        }
    }
}
