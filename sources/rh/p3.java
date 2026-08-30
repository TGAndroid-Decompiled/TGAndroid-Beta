package rh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class p3 implements Utilities.Callback {
    public final int f43660a;
    public final org.telegram.ui.web.s f43661b;
    public final TLRPC.Document f43662c;

    public p3(org.telegram.ui.web.s sVar, TLRPC.Document document, int i10) {
        this.f43660a = i10;
        this.f43661b = sVar;
        this.f43662c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43660a) {
            case 0:
                TLRPC.Document document = this.f43662c;
                this.f43661b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f43662c;
                this.f43661b.run((String) obj, document2);
                return;
        }
    }
}
