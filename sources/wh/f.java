package wh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import yh.s3;
public final class f implements RequestDelegate {
    public final int f50405a = 0;
    public final boolean f50406b;
    public final boolean f50407c;
    public final Object d;
    public final Object f50408e;
    public final Object f50409f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f50406b = z10;
        this.f50408e = eVar;
        this.f50409f = str;
        this.f50407c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50405a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((l) this.d, this.f50406b, (Runnable) this.f50408e, (String) this.f50409f, tL_error, tLObject, this.f50407c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((s3) this.d, tLObject, this.f50406b, (TLRPC.Document) this.f50408e, this.f50407c, tL_error, (TL_stars.saveStarGift) this.f50409f));
                return;
        }
    }

    public f(s3 s3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = s3Var;
        this.f50406b = z10;
        this.f50408e = document;
        this.f50407c = z11;
        this.f50409f = savestargift;
    }
}
