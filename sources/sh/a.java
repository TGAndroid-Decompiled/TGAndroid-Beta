package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f55286a;
    public final TLRPC.Document f55287b;
    public final String f55288c;
    public final ij d;
    public final String f55289e;
    public boolean f55290f;
    public boolean f55291g;

    public a(int i7, ij ijVar, TLRPC.Document document, String str) {
        this.f55286a = i7;
        this.d = ijVar;
        this.f55287b = document;
        this.f55288c = str;
        this.f55289e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z9;
        boolean z10 = false;
        String str = this.f55288c;
        if (str != null) {
            z9 = p0.B(str);
        } else {
            z9 = false;
        }
        int i7 = this.f55286a;
        if (!z9) {
            w7.G(i7);
            z9 = w7.I(this.f55287b).exists();
        }
        this.f55290f = z9;
        String str2 = this.f55289e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).S(str2)) {
            z10 = true;
        }
        this.f55291g = z10;
    }
}
