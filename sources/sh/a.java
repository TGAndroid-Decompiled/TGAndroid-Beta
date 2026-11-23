package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f57424a;
    public final TLRPC.Document f57425b;
    public final String f57426c;
    public final gj d;
    public final String f57427e;
    public boolean f57428f;
    public boolean f57429g;

    public a(int i7, gj gjVar, TLRPC.Document document, String str) {
        this.f57424a = i7;
        this.d = gjVar;
        this.f57425b = document;
        this.f57426c = str;
        this.f57427e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f57426c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f57424a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f57425b).exists();
        }
        this.f57428f = z10;
        String str2 = this.f57427e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f57429g = z11;
    }
}
