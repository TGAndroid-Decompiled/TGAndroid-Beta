package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.re;
import zh.w3;
public final class f implements RequestDelegate {
    public final int f49442a = 0;
    public final boolean f49443b;
    public final boolean f49444c;
    public final Object d;
    public final Object f49445e;
    public final Object f49446f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49443b = z10;
        this.f49445e = eVar;
        this.f49446f = str;
        this.f49444c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49442a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re((n) this.d, this.f49443b, (Runnable) this.f49445e, (String) this.f49446f, tL_error, tLObject, this.f49444c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new re((w3) this.d, tLObject, this.f49443b, (TLRPC.Document) this.f49445e, this.f49444c, tL_error, (TL_stars.saveStarGift) this.f49446f));
                return;
        }
    }

    public f(w3 w3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = w3Var;
        this.f49443b = z10;
        this.f49445e = document;
        this.f49444c = z11;
        this.f49446f = savestargift;
    }
}
