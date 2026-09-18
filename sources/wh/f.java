package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.se;
import yh.a4;
public final class f implements RequestDelegate {
    public final int f45114a = 0;
    public final boolean f45115b;
    public final boolean f45116c;
    public final Object d;
    public final Object e;
    public final Object f45117f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45115b = z10;
        this.e = eVar;
        this.f45117f = str;
        this.f45116c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45114a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se((n) this.d, this.f45115b, (Runnable) this.e, (String) this.f45117f, tL_error, tLObject, this.f45116c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se((a4) this.d, tLObject, this.f45115b, (TLRPC.Document) this.e, this.f45116c, tL_error, (TL_stars.saveStarGift) this.f45117f));
                return;
        }
    }

    public f(a4 a4Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = a4Var;
        this.f45115b = z10;
        this.e = document;
        this.f45116c = z11;
        this.f45117f = savestargift;
    }
}
