package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50449a = 0;
    public final boolean f50450b;
    public final boolean f50451c;
    public final Object d;
    public final Object f50452e;
    public final Object f50453f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50450b = z10;
        this.f50452e = eVar;
        this.f50453f = str;
        this.f50451c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50449a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((l) this.d, this.f50450b, (Runnable) this.f50452e, (String) this.f50453f, tL_error, tLObject, this.f50451c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((s3) this.d, tLObject, this.f50450b, (TLRPC.Document) this.f50452e, this.f50451c, tL_error, (TL_stars.saveStarGift) this.f50453f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50450b = z10;
        this.f50452e = document;
        this.f50451c = z11;
        this.f50453f = savestargift;
    }
}
