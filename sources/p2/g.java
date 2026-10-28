package p2;

import a8.yb;
import android.net.Uri;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.dv;
public final class g {
    public final String f46564a;
    public final Uri f46565b;
    public final Uri f46566c;
    public final long d;
    public final long e;
    public final long f46567f;
    public final long f46568g;
    public final List h;
    public final boolean f46569i;
    public final long f46570j;
    public final long f46571k;
    public final i0 f46572l;
    public final i0 f46573m;
    public final s1 f46574n;
    public final boolean f46575o;
    public final String f46576p;
    public final String f46577q;
    public final long f46578r;
    public final long f46579s;
    public final String f46580t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        yb.g(z12);
        this.f46564a = str;
        this.f46565b = uri;
        this.f46566c = uri2;
        this.d = j10;
        this.e = j11;
        this.f46567f = j12;
        this.f46568g = j13;
        this.h = arrayList;
        this.f46569i = z10;
        this.f46570j = j14;
        this.f46571k = j15;
        this.f46572l = i0.u(arrayList2);
        this.f46573m = i0.u(arrayList3);
        this.f46574n = i0.A(new dv(18), arrayList4);
        this.f46575o = z11;
        this.f46576p = str2;
        this.f46577q = str3;
        this.f46578r = j16;
        this.f46579s = j17;
        this.f46580t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f46567f == gVar.f46567f && this.f46568g == gVar.f46568g && this.f46569i == gVar.f46569i && this.f46570j == gVar.f46570j && this.f46571k == gVar.f46571k && this.f46575o == gVar.f46575o && this.f46578r == gVar.f46578r && this.f46579s == gVar.f46579s && Objects.equals(this.f46564a, gVar.f46564a) && Objects.equals(this.f46565b, gVar.f46565b) && Objects.equals(this.f46566c, gVar.f46566c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f46572l, gVar.f46572l) && Objects.equals(this.f46573m, gVar.f46573m) && Objects.equals(this.f46574n, gVar.f46574n) && Objects.equals(this.f46576p, gVar.f46576p) && Objects.equals(this.f46577q, gVar.f46577q) && Objects.equals(this.f46580t, gVar.f46580t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46564a, this.f46565b, this.f46566c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f46567f), Long.valueOf(this.f46568g), this.h, Boolean.valueOf(this.f46569i), Long.valueOf(this.f46570j), Long.valueOf(this.f46571k), this.f46572l, this.f46573m, this.f46574n, Boolean.valueOf(this.f46575o), this.f46576p, this.f46577q, Long.valueOf(this.f46578r), Long.valueOf(this.f46579s), this.f46580t);
    }
}
