package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50403a = 0;
    public final boolean f50404b;
    public final boolean f50405c;
    public final Object d;
    public final Object f50406e;
    public final Object f50407f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50404b = z10;
        this.f50406e = eVar;
        this.f50407f = str;
        this.f50405c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50403a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((l) this.d, this.f50404b, (Runnable) this.f50406e, (String) this.f50407f, tL_error, tLObject, this.f50405c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((s3) this.d, tLObject, this.f50404b, (TLRPC.Document) this.f50406e, this.f50405c, tL_error, (TL_stars.saveStarGift) this.f50407f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50404b = z10;
        this.f50406e = document;
        this.f50405c = z11;
        this.f50407f = savestargift;
    }
}
