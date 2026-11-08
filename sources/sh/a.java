package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f55276a;
    public final TLRPC.Document f55277b;
    public final String f55278c;
    public final ij d;
    public final String f55279e;
    public boolean f55280f;
    public boolean f55281g;

    public a(int i7, ij ijVar, TLRPC.Document document, String str) {
        this.f55276a = i7;
        this.d = ijVar;
        this.f55277b = document;
        this.f55278c = str;
        this.f55279e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z9;
        boolean z10 = false;
        String str = this.f55278c;
        if (str != null) {
            z9 = p0.B(str);
        } else {
            z9 = false;
        }
        int i7 = this.f55276a;
        if (!z9) {
            w7.G(i7);
            z9 = w7.I(this.f55277b).exists();
        }
        this.f55280f = z9;
        String str2 = this.f55279e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z10 = true;
        }
        this.f55281g = z10;
    }
}
