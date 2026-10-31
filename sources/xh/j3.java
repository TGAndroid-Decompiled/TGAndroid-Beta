package xh;

import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
public final class j3 implements q20 {
    public final int f53831a;
    public final org.telegram.ui.web.o f53832b;
    public final TLRPC.Document f53833c;

    public j3(org.telegram.ui.web.o oVar, TLRPC.Document document, int i10) {
        this.f53831a = i10;
        this.f53832b = oVar;
        this.f53833c = document;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f53831a) {
            case 0:
                TLRPC.Document document = this.f53833c;
                this.f53832b.a((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f53833c;
                this.f53832b.a((String) obj, document2);
                return;
        }
    }
}
