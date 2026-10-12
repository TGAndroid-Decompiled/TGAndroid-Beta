package xh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ze;
import zh.r3;
public final class f implements RequestDelegate {
    public final int f48455a = 0;
    public final boolean f48456b;
    public final boolean f48457c;
    public final Object d;
    public final Object e;
    public final Object f48458f;

    public f(l lVar, boolean z10, e eVar, String str, boolean z11) {
        this.d = lVar;
        this.f48456b = z10;
        this.e = eVar;
        this.f48458f = str;
        this.f48457c = z11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48455a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ze((l) this.d, this.f48456b, (Runnable) this.e, (String) this.f48458f, tL_error, tLObject, this.f48457c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ze((r3) this.d, tLObject, this.f48456b, (TLRPC.Document) this.e, this.f48457c, tL_error, (TL_stars.saveStarGift) this.f48458f));
                return;
        }
    }

    public f(r3 r3Var, boolean z10, TLRPC.Document document, boolean z11, TL_stars.saveStarGift savestargift) {
        this.d = r3Var;
        this.f48456b = z10;
        this.e = document;
        this.f48457c = z11;
        this.f48458f = savestargift;
    }
}
