package s2;

import a8.ma;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.qw0;
public final class g {
    public final String f56799a;
    public final Uri f56800b;
    public final Uri f56801c;
    public final long d;
    public final long f56802e;
    public final long f56803f;
    public final long f56804g;
    public final List h;
    public final boolean f56805i;
    public final long f56806j;
    public final long f56807k;
    public final i0 f56808l;
    public final i0 f56809m;
    public final t1 f56810n;
    public final boolean f56811o;
    public final String f56812p;
    public final String f56813q;
    public final long f56814r;
    public final long f56815s;
    public final String f56816t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        ma.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56799a = str;
        this.f56800b = uri;
        this.f56801c = uri2;
        this.d = j3;
        this.f56802e = j10;
        this.f56803f = j11;
        this.f56804g = j12;
        this.h = arrayList;
        this.f56805i = z10;
        this.f56806j = j13;
        this.f56807k = j14;
        this.f56808l = i0.q(arrayList2);
        this.f56809m = i0.q(arrayList3);
        this.f56810n = i0.w(new qw0(11), arrayList4);
        this.f56811o = z11;
        this.f56812p = str2;
        this.f56813q = str3;
        this.f56814r = j15;
        this.f56815s = j16;
        this.f56816t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f56802e == gVar.f56802e && this.f56803f == gVar.f56803f && this.f56804g == gVar.f56804g && this.f56805i == gVar.f56805i && this.f56806j == gVar.f56806j && this.f56807k == gVar.f56807k && this.f56811o == gVar.f56811o && this.f56814r == gVar.f56814r && this.f56815s == gVar.f56815s && Objects.equals(this.f56799a, gVar.f56799a) && Objects.equals(this.f56800b, gVar.f56800b) && Objects.equals(this.f56801c, gVar.f56801c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f56808l, gVar.f56808l) && Objects.equals(this.f56809m, gVar.f56809m) && Objects.equals(this.f56810n, gVar.f56810n) && Objects.equals(this.f56812p, gVar.f56812p) && Objects.equals(this.f56813q, gVar.f56813q) && Objects.equals(this.f56816t, gVar.f56816t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56799a, this.f56800b, this.f56801c, Long.valueOf(this.d), Long.valueOf(this.f56802e), Long.valueOf(this.f56803f), Long.valueOf(this.f56804g), this.h, Boolean.valueOf(this.f56805i), Long.valueOf(this.f56806j), Long.valueOf(this.f56807k), this.f56808l, this.f56809m, this.f56810n, Boolean.valueOf(this.f56811o), this.f56812p, this.f56813q, Long.valueOf(this.f56814r), Long.valueOf(this.f56815s), this.f56816t);
    }
}
