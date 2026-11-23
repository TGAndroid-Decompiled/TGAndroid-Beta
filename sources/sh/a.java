package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f57535a;
    public final TLRPC.Document f57536b;
    public final String f57537c;
    public final fj d;
    public final String f57538e;
    public boolean f57539f;
    public boolean f57540g;

    public a(int i7, fj fjVar, TLRPC.Document document, String str) {
        this.f57535a = i7;
        this.d = fjVar;
        this.f57536b = document;
        this.f57537c = str;
        this.f57538e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f57537c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f57535a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f57536b).exists();
        }
        this.f57539f = z10;
        String str2 = this.f57538e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f57540g = z11;
    }
}
