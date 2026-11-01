package xh;

import org.telegram.messenger.r20;
import org.telegram.tgnet.TLRPC;
public final class k3 implements r20 {
    public final int f53863a;
    public final org.telegram.ui.web.o f53864b;
    public final TLRPC.Document f53865c;

    public k3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i10) {
        this.f53863a = i10;
        this.f53864b = oVar;
        this.f53865c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53863a) {
            case 0:
                TLRPC.Document document = this.f53865c;
                this.f53864b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f53865c;
                this.f53864b.a((String) obj, document2);
                return;
        }
    }
}
