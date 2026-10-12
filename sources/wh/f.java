package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.xe;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50642a = 0;
    public final boolean f50643b;
    public final boolean f50644c;
    public final Object d;
    public final Object f50645e;
    public final Object f50646f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50643b = z10;
        this.f50645e = eVar;
        this.f50646f = str;
        this.f50644c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50642a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xe((l) this.d, this.f50643b, (Runnable) this.f50645e, (String) this.f50646f, tL_error, tLObject, this.f50644c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xe((s3) this.d, tLObject, this.f50643b, (TLRPC.Document) this.f50645e, this.f50644c, tL_error, (TL_stars.saveStarGift) this.f50646f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50643b = z10;
        this.f50645e = document;
        this.f50644c = z11;
        this.f50646f = savestargift;
    }
}
