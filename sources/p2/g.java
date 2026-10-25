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
    public final String f46526a;
    public final Uri f46527b;
    public final Uri f46528c;
    public final long d;
    public final long e;
    public final long f46529f;
    public final long f46530g;
    public final List h;
    public final boolean f46531i;
    public final long f46532j;
    public final long f46533k;
    public final i0 f46534l;
    public final i0 f46535m;
    public final s1 f46536n;
    public final boolean f46537o;
    public final String f46538p;
    public final String f46539q;
    public final long f46540r;
    public final long f46541s;
    public final String f46542t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        yb.g(z12);
        this.f46526a = str;
        this.f46527b = uri;
        this.f46528c = uri2;
        this.d = j10;
        this.e = j11;
        this.f46529f = j12;
        this.f46530g = j13;
        this.h = arrayList;
        this.f46531i = z10;
        this.f46532j = j14;
        this.f46533k = j15;
        this.f46534l = i0.u(arrayList2);
        this.f46535m = i0.u(arrayList3);
        this.f46536n = i0.A(new bv(18), arrayList4);
        this.f46537o = z11;
        this.f46538p = str2;
        this.f46539q = str3;
        this.f46540r = j16;
        this.f46541s = j17;
        this.f46542t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f46529f == gVar.f46529f && this.f46530g == gVar.f46530g && this.f46531i == gVar.f46531i && this.f46532j == gVar.f46532j && this.f46533k == gVar.f46533k && this.f46537o == gVar.f46537o && this.f46540r == gVar.f46540r && this.f46541s == gVar.f46541s && Objects.equals(this.f46526a, gVar.f46526a) && Objects.equals(this.f46527b, gVar.f46527b) && Objects.equals(this.f46528c, gVar.f46528c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f46534l, gVar.f46534l) && Objects.equals(this.f46535m, gVar.f46535m) && Objects.equals(this.f46536n, gVar.f46536n) && Objects.equals(this.f46538p, gVar.f46538p) && Objects.equals(this.f46539q, gVar.f46539q) && Objects.equals(this.f46542t, gVar.f46542t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f46526a, this.f46527b, this.f46528c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f46529f), Long.valueOf(this.f46530g), this.h, Boolean.valueOf(this.f46531i), Long.valueOf(this.f46532j), Long.valueOf(this.f46533k), this.f46534l, this.f46535m, this.f46536n, Boolean.valueOf(this.f46537o), this.f46538p, this.f46539q, Long.valueOf(this.f46540r), Long.valueOf(this.f46541s), this.f46542t);
    }
}
