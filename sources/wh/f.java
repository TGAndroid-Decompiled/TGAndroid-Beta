package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qe;
import yh.y3;
public final class f implements RequestDelegate {
    public final int f45036a = 0;
    public final boolean f45037b;
    public final boolean f45038c;
    public final Object d;
    public final Object e;
    public final Object f45039f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45037b = z10;
        this.e = eVar;
        this.f45039f = str;
        this.f45038c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45036a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qe((n) this.d, this.f45037b, (Runnable) this.e, (String) this.f45039f, tL_error, tLObject, this.f45038c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qe((y3) this.d, tLObject, this.f45037b, (TLRPC.Document) this.e, this.f45038c, tL_error, (TL_stars.saveStarGift) this.f45039f));
                return;
        }
    }

    public f(y3 y3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = y3Var;
        this.f45037b = z10;
        this.e = document;
        this.f45038c = z11;
        this.f45039f = savestargift;
    }
}
