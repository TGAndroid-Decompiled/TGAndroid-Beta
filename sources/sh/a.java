package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f55277a;
    public final TLRPC.Document f55278b;
    public final String f55279c;
    public final ij d;
    public final String f55280e;
    public boolean f55281f;
    public boolean f55282g;

    public a(int i7, ij ijVar, TLRPC.Document document, String str) {
        this.f55277a = i7;
        this.d = ijVar;
        this.f55278b = document;
        this.f55279c = str;
        this.f55280e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z9;
        boolean z10 = false;
        String str = this.f55279c;
        if (str != null) {
            z9 = p0.B(str);
        } else {
            z9 = false;
        }
        int i7 = this.f55277a;
        if (!z9) {
            w7.G(i7);
            z9 = w7.I(this.f55278b).exists();
        }
        this.f55281f = z9;
        String str2 = this.f55280e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z10 = true;
        }
        this.f55282g = z10;
    }
}
