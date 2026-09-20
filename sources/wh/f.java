package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.se;
import yh.y3;
public final class f implements RequestDelegate {
    public final int f45381a = 0;
    public final boolean f45382b;
    public final boolean f45383c;
    public final Object d;
    public final Object e;
    public final Object f45384f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45382b = z10;
        this.e = eVar;
        this.f45384f = str;
        this.f45383c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45381a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se((n) this.d, this.f45382b, (Runnable) this.e, (String) this.f45384f, tL_error, tLObject, this.f45383c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se((y3) this.d, tLObject, this.f45382b, (TLRPC.Document) this.e, this.f45383c, tL_error, (TL_stars.saveStarGift) this.f45384f));
                return;
        }
    }

    public f(y3 y3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = y3Var;
        this.f45382b = z10;
        this.e = document;
        this.f45383c = z11;
        this.f45384f = savestargift;
    }
}
