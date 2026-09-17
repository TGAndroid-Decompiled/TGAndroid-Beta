package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.re;
import zh.w3;
public final class f implements RequestDelegate {
    public final int f49414a = 0;
    public final boolean f49415b;
    public final boolean f49416c;
    public final Object d;
    public final Object f49417e;
    public final Object f49418f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49415b = z10;
        this.f49417e = eVar;
        this.f49418f = str;
        this.f49416c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49414a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re((n) this.d, this.f49415b, (Runnable) this.f49417e, (String) this.f49418f, tL_error, tLObject, this.f49416c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new re((w3) this.d, tLObject, this.f49415b, (TLRPC.Document) this.f49417e, this.f49416c, tL_error, (TL_stars.saveStarGift) this.f49418f));
                return;
        }
    }

    public f(w3 w3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = w3Var;
        this.f49415b = z10;
        this.f49417e = document;
        this.f49416c = z11;
        this.f49418f = savestargift;
    }
}
