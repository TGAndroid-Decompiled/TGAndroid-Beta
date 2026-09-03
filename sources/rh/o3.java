package rh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class o3 implements Utilities.Callback {
    public final int f43712a;
    public final org.telegram.ui.web.r f43713b;
    public final TLRPC.Document f43714c;

    public o3(org.telegram.ui.web.r rVar, TLRPC.Document document, int i10) {
        this.f43712a = i10;
        this.f43713b = rVar;
        this.f43714c = document;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43712a) {
            case 0:
                TLRPC.Document document = this.f43714c;
                this.f43713b.run((String) obj, document);
                return;
            default:
                TLRPC.Document document2 = this.f43714c;
                this.f43713b.run((String) obj, document2);
                return;
        }
    }
}
