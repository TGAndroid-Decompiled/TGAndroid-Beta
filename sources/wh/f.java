package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.xe;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50634a = 0;
    public final boolean f50635b;
    public final boolean f50636c;
    public final Object d;
    public final Object f50637e;
    public final Object f50638f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50635b = z10;
        this.f50637e = eVar;
        this.f50638f = str;
        this.f50636c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50634a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe((l) this.d, this.f50635b, (Runnable) this.f50637e, (String) this.f50638f, tL_error, tLObject, this.f50636c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xe((s3) this.d, tLObject, this.f50635b, (TLRPC.Document) this.f50637e, this.f50636c, tL_error, (TL_stars.saveStarGift) this.f50638f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50635b = z10;
        this.f50637e = document;
        this.f50636c = z11;
        this.f50638f = savestargift;
    }
}
