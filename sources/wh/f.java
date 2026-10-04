package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.x3;
public final class f implements RequestDelegate {
    public final int f49105a = 0;
    public final boolean f49106b;
    public final boolean f49107c;
    public final Object d;
    public final Object f49108e;
    public final Object f49109f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49106b = z10;
        this.f49108e = eVar;
        this.f49109f = str;
        this.f49107c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49105a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((n) this.d, this.f49106b, (Runnable) this.f49108e, (String) this.f49109f, tL_error, tLObject, this.f49107c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((x3) this.d, tLObject, this.f49106b, (TLRPC.Document) this.f49108e, this.f49107c, tL_error, (TL_stars.saveStarGift) this.f49109f));
                return;
        }
    }

    public f(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f49106b = z10;
        this.f49108e = document;
        this.f49107c = z11;
        this.f49109f = savestargift;
    }
}
