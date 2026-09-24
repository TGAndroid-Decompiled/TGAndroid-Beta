package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.re;
import yh.x3;
public final class f implements RequestDelegate {
    public final int f45350a = 0;
    public final boolean f45351b;
    public final boolean f45352c;
    public final Object d;
    public final Object e;
    public final Object f45353f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f45351b = z10;
        this.e = eVar;
        this.f45353f = str;
        this.f45352c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45350a) {
            case 0:
                AndroidUtilities.runOnUIThread(new re((n) this.d, this.f45351b, (Runnable) this.e, (String) this.f45353f, tL_error, tLObject, this.f45352c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new re((x3) this.d, tLObject, this.f45351b, (TLRPC.Document) this.e, this.f45352c, tL_error, (TL_stars.saveStarGift) this.f45353f));
                return;
        }
    }

    public f(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f45351b = z10;
        this.e = document;
        this.f45352c = z11;
        this.f45353f = savestargift;
    }
}
