package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.un0;
public final class g {
    public final String f54558a;
    public final Uri f54559b;
    public final Uri f54560c;
    public final long d;
    public final long f54561e;
    public final long f54562f;
    public final long f54563g;
    public final List h;
    public final boolean f54564i;
    public final long f54565j;
    public final long f54566k;
    public final i0 f54567l;
    public final i0 f54568m;
    public final t1 f54569n;
    public final boolean f54570o;
    public final String f54571p;
    public final String f54572q;
    public final long f54573r;
    public final long f54574s;
    public final String f54575t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54558a = str;
        this.f54559b = uri;
        this.f54560c = uri2;
        this.d = j3;
        this.f54561e = j10;
        this.f54562f = j11;
        this.f54563g = j12;
        this.h = arrayList;
        this.f54564i = z9;
        this.f54565j = j13;
        this.f54566k = j14;
        this.f54567l = i0.q(arrayList2);
        this.f54568m = i0.q(arrayList3);
        this.f54569n = i0.w(new un0(12), arrayList4);
        this.f54570o = z10;
        this.f54571p = str2;
        this.f54572q = str3;
        this.f54573r = j15;
        this.f54574s = j16;
        this.f54575t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54561e == gVar.f54561e && this.f54562f == gVar.f54562f && this.f54563g == gVar.f54563g && this.f54564i == gVar.f54564i && this.f54565j == gVar.f54565j && this.f54566k == gVar.f54566k && this.f54570o == gVar.f54570o && this.f54573r == gVar.f54573r && this.f54574s == gVar.f54574s && Objects.equals(this.f54558a, gVar.f54558a) && Objects.equals(this.f54559b, gVar.f54559b) && Objects.equals(this.f54560c, gVar.f54560c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54567l, gVar.f54567l) && Objects.equals(this.f54568m, gVar.f54568m) && Objects.equals(this.f54569n, gVar.f54569n) && Objects.equals(this.f54571p, gVar.f54571p) && Objects.equals(this.f54572q, gVar.f54572q) && Objects.equals(this.f54575t, gVar.f54575t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54558a, this.f54559b, this.f54560c, Long.valueOf(this.d), Long.valueOf(this.f54561e), Long.valueOf(this.f54562f), Long.valueOf(this.f54563g), this.h, Boolean.valueOf(this.f54564i), Long.valueOf(this.f54565j), Long.valueOf(this.f54566k), this.f54567l, this.f54568m, this.f54569n, Boolean.valueOf(this.f54570o), this.f54571p, this.f54572q, Long.valueOf(this.f54573r), Long.valueOf(this.f54574s), this.f54575t);
    }
}
