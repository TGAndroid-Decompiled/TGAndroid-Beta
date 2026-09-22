package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qe;
import yh.z3;
public final class f implements RequestDelegate {
    public final int f45082a = 0;
    public final boolean f45083b;
    public final boolean f45084c;
    public final Object d;
    public final Object e;
    public final Object f45085f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45083b = z10;
        this.e = eVar;
        this.f45085f = str;
        this.f45084c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45082a) {
            case 0:
                AndroidUtilities.runOnUIThread(new qe((n) this.d, this.f45083b, (Runnable) this.e, (String) this.f45085f, tL_error, tLObject, this.f45084c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new qe((z3) this.d, tLObject, this.f45083b, (TLRPC.Document) this.e, this.f45084c, tL_error, (TL_stars.saveStarGift) this.f45085f));
                return;
        }
    }

    public f(z3 z3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = z3Var;
        this.f45083b = z10;
        this.e = document;
        this.f45084c = z11;
        this.f45085f = savestargift;
    }
}
