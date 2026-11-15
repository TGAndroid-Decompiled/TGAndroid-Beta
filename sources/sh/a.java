package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.gj;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f56840a;
    public final TLRPC.Document f56841b;
    public final String f56842c;
    public final gj d;
    public final String f56843e;
    public boolean f56844f;
    public boolean f56845g;

    public a(int i7, gj gjVar, TLRPC.Document document, String str) {
        this.f56840a = i7;
        this.d = gjVar;
        this.f56841b = document;
        this.f56842c = str;
        this.f56843e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f56842c;
        if (str != null) {
            z10 = p0.B(str);
        } else {
            z10 = false;
        }
        int i7 = this.f56840a;
        if (!z10) {
            w7.G(i7);
            z10 = w7.I(this.f56841b).exists();
        }
        this.f56844f = z10;
        String str2 = this.f56843e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z11 = true;
        }
        this.f56845g = z11;
    }
}
