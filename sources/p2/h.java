package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.o70;
import v7.u6;
public final class h {
    public final String f44386a;
    public final Uri f44387b;
    public final Uri f44388c;
    public final long d;
    public final long e;
    public final long f44389f;
    public final long f44390g;
    public final List h;
    public final boolean f44391i;
    public final long f44392j;
    public final long f44393k;
    public final n0 f44394l;
    public final n0 f44395m;
    public final x1 f44396n;
    public final boolean f44397o;
    public final String f44398p;
    public final String f44399q;
    public final long f44400r;
    public final long f44401s;
    public final String f44402t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f44386a = str;
        this.f44387b = uri;
        this.f44388c = uri2;
        this.d = j10;
        this.e = j11;
        this.f44389f = j12;
        this.f44390g = j13;
        this.h = arrayList;
        this.f44391i = z10;
        this.f44392j = j14;
        this.f44393k = j15;
        this.f44394l = n0.u(arrayList2);
        this.f44395m = n0.u(arrayList3);
        this.f44396n = n0.A(new o70(15), arrayList4);
        this.f44397o = z11;
        this.f44398p = str2;
        this.f44399q = str3;
        this.f44400r = j16;
        this.f44401s = j17;
        this.f44402t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f44389f == hVar.f44389f && this.f44390g == hVar.f44390g && this.f44391i == hVar.f44391i && this.f44392j == hVar.f44392j && this.f44393k == hVar.f44393k && this.f44397o == hVar.f44397o && this.f44400r == hVar.f44400r && this.f44401s == hVar.f44401s && Objects.equals(this.f44386a, hVar.f44386a) && Objects.equals(this.f44387b, hVar.f44387b) && Objects.equals(this.f44388c, hVar.f44388c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f44394l, hVar.f44394l) && Objects.equals(this.f44395m, hVar.f44395m) && Objects.equals(this.f44396n, hVar.f44396n) && Objects.equals(this.f44398p, hVar.f44398p) && Objects.equals(this.f44399q, hVar.f44399q) && Objects.equals(this.f44402t, hVar.f44402t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44386a, this.f44387b, this.f44388c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f44389f), Long.valueOf(this.f44390g), this.h, Boolean.valueOf(this.f44391i), Long.valueOf(this.f44392j), Long.valueOf(this.f44393k), this.f44394l, this.f44395m, this.f44396n, Boolean.valueOf(this.f44397o), this.f44398p, this.f44399q, Long.valueOf(this.f44400r), Long.valueOf(this.f44401s), this.f44402t);
    }
}
