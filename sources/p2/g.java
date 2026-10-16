package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ds0;
import v7.u6;
public final class g {
    public final String f42576a;
    public final Uri f42577b;
    public final Uri f42578c;
    public final long d;
    public final long e;
    public final long f42579f;
    public final long f42580g;
    public final List h;
    public final boolean f42581i;
    public final long f42582j;
    public final long f42583k;
    public final n0 f42584l;
    public final n0 f42585m;
    public final x1 f42586n;
    public final boolean f42587o;
    public final String f42588p;
    public final String f42589q;
    public final long f42590r;
    public final long f42591s;
    public final String f42592t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f42576a = str;
        this.f42577b = uri;
        this.f42578c = uri2;
        this.d = j10;
        this.e = j11;
        this.f42579f = j12;
        this.f42580g = j13;
        this.h = arrayList;
        this.f42581i = z10;
        this.f42582j = j14;
        this.f42583k = j15;
        this.f42584l = n0.u(arrayList2);
        this.f42585m = n0.u(arrayList3);
        this.f42586n = n0.A(new ds0(11), arrayList4);
        this.f42587o = z11;
        this.f42588p = str2;
        this.f42589q = str3;
        this.f42590r = j16;
        this.f42591s = j17;
        this.f42592t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f42579f == gVar.f42579f && this.f42580g == gVar.f42580g && this.f42581i == gVar.f42581i && this.f42582j == gVar.f42582j && this.f42583k == gVar.f42583k && this.f42587o == gVar.f42587o && this.f42590r == gVar.f42590r && this.f42591s == gVar.f42591s && Objects.equals(this.f42576a, gVar.f42576a) && Objects.equals(this.f42577b, gVar.f42577b) && Objects.equals(this.f42578c, gVar.f42578c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f42584l, gVar.f42584l) && Objects.equals(this.f42585m, gVar.f42585m) && Objects.equals(this.f42586n, gVar.f42586n) && Objects.equals(this.f42588p, gVar.f42588p) && Objects.equals(this.f42589q, gVar.f42589q) && Objects.equals(this.f42592t, gVar.f42592t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f42576a, this.f42577b, this.f42578c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f42579f), Long.valueOf(this.f42580g), this.h, Boolean.valueOf(this.f42581i), Long.valueOf(this.f42582j), Long.valueOf(this.f42583k), this.f42584l, this.f42585m, this.f42586n, Boolean.valueOf(this.f42587o), this.f42588p, this.f42589q, Long.valueOf(this.f42590r), Long.valueOf(this.f42591s), this.f42592t);
    }
}
