package p2;

import a8.yb;
import android.net.Uri;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.bv;
public final class g {
    public final String f46529a;
    public final Uri f46530b;
    public final Uri f46531c;
    public final long d;
    public final long e;
    public final long f46532f;
    public final long f46533g;
    public final List h;
    public final boolean f46534i;
    public final long f46535j;
    public final long f46536k;
    public final i0 f46537l;
    public final i0 f46538m;
    public final s1 f46539n;
    public final boolean f46540o;
    public final String f46541p;
    public final String f46542q;
    public final long f46543r;
    public final long f46544s;
    public final String f46545t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        yb.g(z12);
        this.f46529a = str;
        this.f46530b = uri;
        this.f46531c = uri2;
        this.d = j10;
        this.e = j11;
        this.f46532f = j12;
        this.f46533g = j13;
        this.h = arrayList;
        this.f46534i = z10;
        this.f46535j = j14;
        this.f46536k = j15;
        this.f46537l = i0.u(arrayList2);
        this.f46538m = i0.u(arrayList3);
        this.f46539n = i0.A(new bv(18), arrayList4);
        this.f46540o = z11;
        this.f46541p = str2;
        this.f46542q = str3;
        this.f46543r = j16;
        this.f46544s = j17;
        this.f46545t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f46532f == gVar.f46532f && this.f46533g == gVar.f46533g && this.f46534i == gVar.f46534i && this.f46535j == gVar.f46535j && this.f46536k == gVar.f46536k && this.f46540o == gVar.f46540o && this.f46543r == gVar.f46543r && this.f46544s == gVar.f46544s && Objects.equals(this.f46529a, gVar.f46529a) && Objects.equals(this.f46530b, gVar.f46530b) && Objects.equals(this.f46531c, gVar.f46531c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f46537l, gVar.f46537l) && Objects.equals(this.f46538m, gVar.f46538m) && Objects.equals(this.f46539n, gVar.f46539n) && Objects.equals(this.f46541p, gVar.f46541p) && Objects.equals(this.f46542q, gVar.f46542q) && Objects.equals(this.f46545t, gVar.f46545t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46529a, this.f46530b, this.f46531c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f46532f), Long.valueOf(this.f46533g), this.h, Boolean.valueOf(this.f46534i), Long.valueOf(this.f46535j), Long.valueOf(this.f46536k), this.f46537l, this.f46538m, this.f46539n, Boolean.valueOf(this.f46540o), this.f46541p, this.f46542q, Long.valueOf(this.f46543r), Long.valueOf(this.f46544s), this.f46545t);
    }
}
