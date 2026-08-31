package sh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Utilities.Callback {
    public final int f47561a;
    public final org.telegram.ui.web.s f47562b;
    public final TLRPC.Document f47563c;

    public o3(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f47561a = i10;
        this.f47562b = sVar;
        this.f47563c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47561a) {
            case 0:
                TLRPC.Document document = this.f47563c;
                this.f47562b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f47563c;
                this.f47562b.run((String) obj, document2);
                return;
        }
    }
}
