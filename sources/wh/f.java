package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.y3;
public final class f implements RequestDelegate {
    public final int f49121a = 0;
    public final boolean f49122b;
    public final boolean f49123c;
    public final Object d;
    public final Object f49124e;
    public final Object f49125f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49122b = z10;
        this.f49124e = eVar;
        this.f49125f = str;
        this.f49123c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49121a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((n) this.d, this.f49122b, (Runnable) this.f49124e, (String) this.f49125f, tL_error, tLObject, this.f49123c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((y3) this.d, tLObject, this.f49122b, (TLRPC.Document) this.f49124e, this.f49123c, tL_error, (TL_stars.saveStarGift) this.f49125f));
                return;
        }
    }

    public f(y3 y3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = y3Var;
        this.f49122b = z10;
        this.f49124e = document;
        this.f49123c = z11;
        this.f49125f = savestargift;
    }
}
