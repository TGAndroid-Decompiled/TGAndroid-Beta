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
    public final String f56830a;
    public final Uri f56831b;
    public final Uri f56832c;
    public final long d;
    public final long f56833e;
    public final long f56834f;
    public final long f56835g;
    public final List h;
    public final boolean f56836i;
    public final long f56837j;
    public final long f56838k;
    public final i0 f56839l;
    public final i0 f56840m;
    public final t1 f56841n;
    public final boolean f56842o;
    public final String f56843p;
    public final String f56844q;
    public final long f56845r;
    public final long f56846s;
    public final String f56847t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        la.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56830a = str;
        this.f56831b = uri;
        this.f56832c = uri2;
        this.d = j3;
        this.f56833e = j10;
        this.f56834f = j11;
        this.f56835g = j12;
        this.h = arrayList;
        this.f56836i = z10;
        this.f56837j = j13;
        this.f56838k = j14;
        this.f56839l = i0.q(arrayList2);
        this.f56840m = i0.q(arrayList3);
        this.f56841n = i0.w(new qw0(11), arrayList4);
        this.f56842o = z11;
        this.f56843p = str2;
        this.f56844q = str3;
        this.f56845r = j15;
        this.f56846s = j16;
        this.f56847t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f56833e == gVar.f56833e && this.f56834f == gVar.f56834f && this.f56835g == gVar.f56835g && this.f56836i == gVar.f56836i && this.f56837j == gVar.f56837j && this.f56838k == gVar.f56838k && this.f56842o == gVar.f56842o && this.f56845r == gVar.f56845r && this.f56846s == gVar.f56846s && Objects.equals(this.f56830a, gVar.f56830a) && Objects.equals(this.f56831b, gVar.f56831b) && Objects.equals(this.f56832c, gVar.f56832c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f56839l, gVar.f56839l) && Objects.equals(this.f56840m, gVar.f56840m) && Objects.equals(this.f56841n, gVar.f56841n) && Objects.equals(this.f56843p, gVar.f56843p) && Objects.equals(this.f56844q, gVar.f56844q) && Objects.equals(this.f56847t, gVar.f56847t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56830a, this.f56831b, this.f56832c, Long.valueOf(this.d), Long.valueOf(this.f56833e), Long.valueOf(this.f56834f), Long.valueOf(this.f56835g), this.h, Boolean.valueOf(this.f56836i), Long.valueOf(this.f56837j), Long.valueOf(this.f56838k), this.f56839l, this.f56840m, this.f56841n, Boolean.valueOf(this.f56842o), this.f56843p, this.f56844q, Long.valueOf(this.f56845r), Long.valueOf(this.f56846s), this.f56847t);
    }
}
