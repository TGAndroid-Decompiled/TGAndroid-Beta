package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.se;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50527a = 0;
    public final boolean f50528b;
    public final boolean f50529c;
    public final Object d;
    public final Object f50530e;
    public final Object f50531f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50528b = z10;
        this.f50530e = eVar;
        this.f50531f = str;
        this.f50529c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50527a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se((l) this.d, this.f50528b, (Runnable) this.f50530e, (String) this.f50531f, tL_error, tLObject, this.f50529c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se((s3) this.d, tLObject, this.f50528b, (TLRPC.Document) this.f50530e, this.f50529c, tL_error, (TL_stars.saveStarGift) this.f50531f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50528b = z10;
        this.f50530e = document;
        this.f50529c = z11;
        this.f50531f = savestargift;
    }
}
