package ph;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Utilities.Callback {
    public final int f45936a;
    public final org.telegram.ui.web.s f45937b;
    public final TLRPC.Document f45938c;

    public o3(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f45936a = i10;
        this.f45937b = sVar;
        this.f45938c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f45936a) {
            case 0:
                TLRPC.Document document = this.f45938c;
                this.f45937b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f45938c;
                this.f45937b.run((String) obj, document2);
                return;
        }
    }
}
