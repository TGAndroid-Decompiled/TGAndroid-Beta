package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f57455a;
    public final TLRPC.Document f57456b;
    public final String f57457c;
    public final fj d;
    public final String f57458e;
    public boolean f57459f;
    public boolean f57460g;

    public a(int i7, fj fjVar, TLRPC.Document document, String str) {
        this.f57455a = i7;
        this.d = fjVar;
        this.f57456b = document;
        this.f57457c = str;
        this.f57458e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f57457c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f57455a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f57456b).exists();
        }
        this.f57459f = z10;
        String str2 = this.f57458e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f57460g = z11;
    }
}
