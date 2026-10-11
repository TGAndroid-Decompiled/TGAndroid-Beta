package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.se;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50493a = 0;
    public final boolean f50494b;
    public final boolean f50495c;
    public final Object d;
    public final Object f50496e;
    public final Object f50497f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50494b = z10;
        this.f50496e = eVar;
        this.f50497f = str;
        this.f50495c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50493a) {
            case 0:
                AndroidUtilities.runOnUIThread(new se((l) this.d, this.f50494b, (Runnable) this.f50496e, (String) this.f50497f, tL_error, tLObject, this.f50495c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new se((s3) this.d, tLObject, this.f50494b, (TLRPC.Document) this.f50496e, this.f50495c, tL_error, (TL_stars.saveStarGift) this.f50497f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50494b = z10;
        this.f50496e = document;
        this.f50495c = z11;
        this.f50497f = savestargift;
    }
}
