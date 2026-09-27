package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ue;
import yh.x3;
public final class f implements RequestDelegate {
    public final int f45410a = 0;
    public final boolean f45411b;
    public final boolean f45412c;
    public final Object d;
    public final Object e;
    public final Object f45413f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45411b = z10;
        this.e = eVar;
        this.f45413f = str;
        this.f45412c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45410a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ue((n) this.d, this.f45411b, (Runnable) this.e, (String) this.f45413f, tL_error, tLObject, this.f45412c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ue((x3) this.d, tLObject, this.f45411b, (TLRPC.Document) this.e, this.f45412c, tL_error, (TL_stars.saveStarGift) this.f45413f));
                return;
        }
    }

    public f(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f45411b = z10;
        this.e = document;
        this.f45412c = z11;
        this.f45413f = savestargift;
    }
}
