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
    public final String f56834a;
    public final Uri f56835b;
    public final Uri f56836c;
    public final long d;
    public final long f56837e;
    public final long f56838f;
    public final long f56839g;
    public final List h;
    public final boolean f56840i;
    public final long f56841j;
    public final long f56842k;
    public final i0 f56843l;
    public final i0 f56844m;
    public final t1 f56845n;
    public final boolean f56846o;
    public final String f56847p;
    public final String f56848q;
    public final long f56849r;
    public final long f56850s;
    public final String f56851t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        la.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56834a = str;
        this.f56835b = uri;
        this.f56836c = uri2;
        this.d = j3;
        this.f56837e = j10;
        this.f56838f = j11;
        this.f56839g = j12;
        this.h = arrayList;
        this.f56840i = z10;
        this.f56841j = j13;
        this.f56842k = j14;
        this.f56843l = i0.q(arrayList2);
        this.f56844m = i0.q(arrayList3);
        this.f56845n = i0.w(new qw0(11), arrayList4);
        this.f56846o = z11;
        this.f56847p = str2;
        this.f56848q = str3;
        this.f56849r = j15;
        this.f56850s = j16;
        this.f56851t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f56837e == gVar.f56837e && this.f56838f == gVar.f56838f && this.f56839g == gVar.f56839g && this.f56840i == gVar.f56840i && this.f56841j == gVar.f56841j && this.f56842k == gVar.f56842k && this.f56846o == gVar.f56846o && this.f56849r == gVar.f56849r && this.f56850s == gVar.f56850s && Objects.equals(this.f56834a, gVar.f56834a) && Objects.equals(this.f56835b, gVar.f56835b) && Objects.equals(this.f56836c, gVar.f56836c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f56843l, gVar.f56843l) && Objects.equals(this.f56844m, gVar.f56844m) && Objects.equals(this.f56845n, gVar.f56845n) && Objects.equals(this.f56847p, gVar.f56847p) && Objects.equals(this.f56848q, gVar.f56848q) && Objects.equals(this.f56851t, gVar.f56851t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56834a, this.f56835b, this.f56836c, Long.valueOf(this.d), Long.valueOf(this.f56837e), Long.valueOf(this.f56838f), Long.valueOf(this.f56839g), this.h, Boolean.valueOf(this.f56840i), Long.valueOf(this.f56841j), Long.valueOf(this.f56842k), this.f56843l, this.f56844m, this.f56845n, Boolean.valueOf(this.f56846o), this.f56847p, this.f56848q, Long.valueOf(this.f56849r), Long.valueOf(this.f56850s), this.f56851t);
    }
}
