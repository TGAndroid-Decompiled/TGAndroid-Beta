package sh;

import a8.p0;
import android.text.TextUtils;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f55160a;
    public final TLRPC.Document f55161b;
    public final String f55162c;
    public final ij d;
    public final String f55163e;
    public boolean f55164f;
    public boolean f55165g;

    public a(int i7, ij ijVar, TLRPC.Document document, String str) {
        this.f55160a = i7;
        this.d = ijVar;
        this.f55161b = document;
        this.f55162c = str;
        this.f55163e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z9;
        boolean z10 = false;
        String str = this.f55162c;
        if (str != null) {
            z9 = p0.B(str);
        } else {
            z9 = false;
        }
        int i7 = this.f55160a;
        if (!z9) {
            w7.G(i7);
            z9 = w7.I(this.f55161b).exists();
        }
        this.f55164f = z9;
        String str2 = this.f55163e;
        if (!TextUtils.isEmpty(str2) && w7.G(i7).T(str2)) {
            z10 = true;
        }
        this.f55165g = z10;
    }
}
