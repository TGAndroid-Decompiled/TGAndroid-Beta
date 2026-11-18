package s2;

import a8.la;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.qw0;
public final class g {
    public final String f56789a;
    public final Uri f56790b;
    public final Uri f56791c;
    public final long d;
    public final long f56792e;
    public final long f56793f;
    public final long f56794g;
    public final List h;
    public final boolean f56795i;
    public final long f56796j;
    public final long f56797k;
    public final i0 f56798l;
    public final i0 f56799m;
    public final t1 f56800n;
    public final boolean f56801o;
    public final String f56802p;
    public final String f56803q;
    public final long f56804r;
    public final long f56805s;
    public final String f56806t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        la.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56789a = str;
        this.f56790b = uri;
        this.f56791c = uri2;
        this.d = j3;
        this.f56792e = j10;
        this.f56793f = j11;
        this.f56794g = j12;
        this.h = arrayList;
        this.f56795i = z10;
        this.f56796j = j13;
        this.f56797k = j14;
        this.f56798l = i0.q(arrayList2);
        this.f56799m = i0.q(arrayList3);
        this.f56800n = i0.w(new qw0(11), arrayList4);
        this.f56801o = z11;
        this.f56802p = str2;
        this.f56803q = str3;
        this.f56804r = j15;
        this.f56805s = j16;
        this.f56806t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f56792e == gVar.f56792e && this.f56793f == gVar.f56793f && this.f56794g == gVar.f56794g && this.f56795i == gVar.f56795i && this.f56796j == gVar.f56796j && this.f56797k == gVar.f56797k && this.f56801o == gVar.f56801o && this.f56804r == gVar.f56804r && this.f56805s == gVar.f56805s && Objects.equals(this.f56789a, gVar.f56789a) && Objects.equals(this.f56790b, gVar.f56790b) && Objects.equals(this.f56791c, gVar.f56791c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f56798l, gVar.f56798l) && Objects.equals(this.f56799m, gVar.f56799m) && Objects.equals(this.f56800n, gVar.f56800n) && Objects.equals(this.f56802p, gVar.f56802p) && Objects.equals(this.f56803q, gVar.f56803q) && Objects.equals(this.f56806t, gVar.f56806t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56789a, this.f56790b, this.f56791c, Long.valueOf(this.d), Long.valueOf(this.f56792e), Long.valueOf(this.f56793f), Long.valueOf(this.f56794g), this.h, Boolean.valueOf(this.f56795i), Long.valueOf(this.f56796j), Long.valueOf(this.f56797k), this.f56798l, this.f56799m, this.f56800n, Boolean.valueOf(this.f56801o), this.f56802p, this.f56803q, Long.valueOf(this.f56804r), Long.valueOf(this.f56805s), this.f56806t);
    }
}
