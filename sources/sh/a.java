package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f57459a;
    public final TLRPC.Document f57460b;
    public final String f57461c;
    public final gj d;
    public final String f57462e;
    public boolean f57463f;
    public boolean f57464g;

    public a(int i7, gj gjVar, TLRPC.Document document, String str) {
        this.f57459a = i7;
        this.d = gjVar;
        this.f57460b = document;
        this.f57461c = str;
        this.f57462e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f57461c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f57459a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f57460b).exists();
        }
        this.f57463f = z10;
        String str2 = this.f57462e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f57464g = z11;
    }
}
