package vh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.te;
import xh.x3;
public final class g implements RequestDelegate {
    public final int f43372a = 0;
    public final boolean f43373b;
    public final boolean f43374c;
    public final Object d;
    public final Object e;
    public final Object f43375f;

    public g(p pVar, boolean z10, f fVar, String str, boolean z11) {
        this.d = pVar;
        this.f43373b = z10;
        this.e = fVar;
        this.f43375f = str;
        this.f43374c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43372a) {
            case 0:
                AndroidUtilities.runOnUIThread(new te((p) this.d, this.f43373b, (Runnable) this.e, (String) this.f43375f, tL_error, tLObject, this.f43374c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new te((x3) this.d, tLObject, this.f43373b, (TLRPC.Document) this.e, this.f43374c, tL_error, (TL_stars.saveStarGift) this.f43375f));
                return;
        }
    }

    public g(x3 x3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = x3Var;
        this.f43373b = z10;
        this.e = document;
        this.f43374c = z11;
        this.f43375f = savestargift;
    }
}
