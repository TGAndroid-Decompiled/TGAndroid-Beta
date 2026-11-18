package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.fj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f57414a;
    public final TLRPC.Document f57415b;
    public final String f57416c;
    public final fj d;
    public final String f57417e;
    public boolean f57418f;
    public boolean f57419g;

    public a(int i7, fj fjVar, TLRPC.Document document, String str) {
        this.f57414a = i7;
        this.d = fjVar;
        this.f57415b = document;
        this.f57416c = str;
        this.f57417e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f57416c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f57414a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f57415b).exists();
        }
        this.f57418f = z10;
        String str2 = this.f57417e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f57419g = z11;
    }
}
