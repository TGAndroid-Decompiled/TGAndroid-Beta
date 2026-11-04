package th;

import android.text.TextUtils;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
public final class a {
    public final int f55381a;
    public final TLRPC.Document f55382b;
    public final String f55383c;
    public final zi d;
    public final String f55384e;
    public boolean f55385f;
    public boolean f55386g;

    public a(int i3, zi ziVar, TLRPC.Document document, String str) {
        this.f55381a = i3;
        this.d = ziVar;
        this.f55382b = document;
        this.f55383c = str;
        this.f55384e = TextUtils.isEmpty(str) ? w7.r(null, document) : str;
        a();
    }

    public final void a() {
        boolean z10;
        boolean z11 = false;
        String str = this.f55383c;
        if (str != null) {
            z10 = t4.c.p(str);
        } else {
            z10 = false;
        }
        int i3 = this.f55381a;
        if (!z10) {
            w7.G(i3);
            z10 = w7.I(this.f55382b).exists();
        }
        this.f55385f = z10;
        String str2 = this.f55384e;
        if (!TextUtils.isEmpty(str2) && w7.G(i3).T(str2)) {
            z11 = true;
        }
        this.f55386g = z11;
    }
}
