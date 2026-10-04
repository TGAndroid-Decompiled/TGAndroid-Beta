package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.x3;
public final class f implements RequestDelegate {
    public final int f49114a = 0;
    public final boolean f49115b;
    public final boolean f49116c;
    public final Object d;
    public final Object f49117e;
    public final Object f49118f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49115b = z10;
        this.f49117e = eVar;
        this.f49118f = str;
        this.f49116c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49114a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((n) this.d, this.f49115b, (Runnable) this.f49117e, (String) this.f49118f, tL_error, tLObject, this.f49116c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((x3) this.d, tLObject, this.f49115b, (TLRPC.Document) this.f49117e, this.f49116c, tL_error, (TL_stars.saveStarGift) this.f49118f));
                return;
        }
    }

    public f(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f49115b = z10;
        this.f49117e = document;
        this.f49116c = z11;
        this.f49118f = savestargift;
    }
}
