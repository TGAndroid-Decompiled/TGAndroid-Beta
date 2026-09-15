package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qe;
import yh.a4;
public final class f implements RequestDelegate {
    public final int f45086a = 0;
    public final boolean f45087b;
    public final boolean f45088c;
    public final Object d;
    public final Object e;
    public final Object f45089f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45087b = z10;
        this.e = eVar;
        this.f45089f = str;
        this.f45088c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45086a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qe((n) this.d, this.f45087b, (Runnable) this.e, (String) this.f45089f, tL_error, tLObject, this.f45088c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qe((a4) this.d, tLObject, this.f45087b, (TLRPC.Document) this.e, this.f45088c, tL_error, (TL_stars.saveStarGift) this.f45089f));
                return;
        }
    }

    public f(a4 a4Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = a4Var;
        this.f45087b = z10;
        this.e = document;
        this.f45088c = z11;
        this.f45089f = savestargift;
    }
}
