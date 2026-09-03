package sh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Utilities.Callback {
    public final int f47597a;
    public final org.telegram.ui.web.s f47598b;
    public final TLRPC.Document f47599c;

    public o3(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f47597a = i10;
        this.f47598b = sVar;
        this.f47599c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f47597a) {
            case 0:
                TLRPC.Document document = this.f47599c;
                this.f47598b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f47599c;
                this.f47598b.run((String) obj, document2);
                return;
        }
    }
}
