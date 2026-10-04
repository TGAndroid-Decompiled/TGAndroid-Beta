package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.x3;
public final class f implements RequestDelegate {
    public final int f49106a = 0;
    public final boolean f49107b;
    public final boolean f49108c;
    public final Object d;
    public final Object f49109e;
    public final Object f49110f;

    public f(n nVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = nVar;
        this.f49107b = z10;
        this.f49109e = eVar;
        this.f49110f = str;
        this.f49108c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49106a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((n) this.d, this.f49107b, (Runnable) this.f49109e, (String) this.f49110f, tL_error, tLObject, this.f49108c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((x3) this.d, tLObject, this.f49107b, (TLRPC.Document) this.f49109e, this.f49108c, tL_error, (TL_stars.saveStarGift) this.f49110f));
                return;
        }
    }

    public f(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f49107b = z10;
        this.f49109e = document;
        this.f49108c = z11;
        this.f49110f = savestargift;
    }
}
