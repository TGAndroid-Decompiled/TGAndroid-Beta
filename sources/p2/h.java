package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.jg0;
import v7.u6;
public final class h {
    public final String f43972a;
    public final Uri f43973b;
    public final Uri f43974c;
    public final long d;
    public final long e;
    public final long f43975f;
    public final long f43976g;
    public final List h;
    public final boolean f43977i;
    public final long f43978j;
    public final long f43979k;
    public final n0 f43980l;
    public final n0 f43981m;
    public final x1 f43982n;
    public final boolean f43983o;
    public final String f43984p;
    public final String f43985q;
    public final long f43986r;
    public final long f43987s;
    public final String f43988t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43972a = str;
        this.f43973b = uri;
        this.f43974c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43975f = j12;
        this.f43976g = j13;
        this.h = arrayList;
        this.f43977i = z10;
        this.f43978j = j14;
        this.f43979k = j15;
        this.f43980l = n0.u(arrayList2);
        this.f43981m = n0.u(arrayList3);
        this.f43982n = n0.A(new jg0(14), arrayList4);
        this.f43983o = z11;
        this.f43984p = str2;
        this.f43985q = str3;
        this.f43986r = j16;
        this.f43987s = j17;
        this.f43988t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43975f == hVar.f43975f && this.f43976g == hVar.f43976g && this.f43977i == hVar.f43977i && this.f43978j == hVar.f43978j && this.f43979k == hVar.f43979k && this.f43983o == hVar.f43983o && this.f43986r == hVar.f43986r && this.f43987s == hVar.f43987s && Objects.equals(this.f43972a, hVar.f43972a) && Objects.equals(this.f43973b, hVar.f43973b) && Objects.equals(this.f43974c, hVar.f43974c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43980l, hVar.f43980l) && Objects.equals(this.f43981m, hVar.f43981m) && Objects.equals(this.f43982n, hVar.f43982n) && Objects.equals(this.f43984p, hVar.f43984p) && Objects.equals(this.f43985q, hVar.f43985q) && Objects.equals(this.f43988t, hVar.f43988t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43972a, this.f43973b, this.f43974c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43975f), Long.valueOf(this.f43976g), this.h, Boolean.valueOf(this.f43977i), Long.valueOf(this.f43978j), Long.valueOf(this.f43979k), this.f43980l, this.f43981m, this.f43982n, Boolean.valueOf(this.f43983o), this.f43984p, this.f43985q, Long.valueOf(this.f43986r), Long.valueOf(this.f43987s), this.f43988t);
    }
}
