package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.re;
import zh.w3;
public final class f implements RequestDelegate {
    public final int f49413a = 0;
    public final boolean f49414b;
    public final boolean f49415c;
    public final Object d;
    public final Object f49416e;
    public final Object f49417f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49414b = z10;
        this.f49416e = eVar;
        this.f49417f = str;
        this.f49415c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49413a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re((n) this.d, this.f49414b, (Runnable) this.f49416e, (String) this.f49417f, tL_error, tLObject, this.f49415c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new re((w3) this.d, tLObject, this.f49414b, (TLRPC.Document) this.f49416e, this.f49415c, tL_error, (TL_stars.saveStarGift) this.f49417f));
                return;
        }
    }

    public f(w3 w3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = w3Var;
        this.f49414b = z10;
        this.f49416e = document;
        this.f49415c = z11;
        this.f49417f = savestargift;
    }
}
