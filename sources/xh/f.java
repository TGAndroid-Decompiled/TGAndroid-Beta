package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.re;
import zh.w3;
public final class f implements RequestDelegate {
    public final int f49443a = 0;
    public final boolean f49444b;
    public final boolean f49445c;
    public final Object d;
    public final Object f49446e;
    public final Object f49447f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49444b = z10;
        this.f49446e = eVar;
        this.f49447f = str;
        this.f49445c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49443a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re((n) this.d, this.f49444b, (Runnable) this.f49446e, (String) this.f49447f, tL_error, tLObject, this.f49445c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new re((w3) this.d, tLObject, this.f49444b, (TLRPC.Document) this.f49446e, this.f49445c, tL_error, (TL_stars.saveStarGift) this.f49447f));
                return;
        }
    }

    public f(w3 w3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = w3Var;
        this.f49444b = z10;
        this.f49446e = document;
        this.f49445c = z11;
        this.f49447f = savestargift;
    }
}
