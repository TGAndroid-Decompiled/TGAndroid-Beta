package s2;

import a8.ma;
import android.net.Uri;
import h9.i0;
import h9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ow0;
public final class h {
    public final String f56915a;
    public final Uri f56916b;
    public final Uri f56917c;
    public final long d;
    public final long f56918e;
    public final long f56919f;
    public final long f56920g;
    public final List h;
    public final boolean f56921i;
    public final long f56922j;
    public final long f56923k;
    public final i0 f56924l;
    public final i0 f56925m;
    public final s1 f56926n;
    public final boolean f56927o;
    public final String f56928p;
    public final String f56929q;
    public final long f56930r;
    public final long f56931s;
    public final String f56932t;

    public h(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        ma.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56915a = str;
        this.f56916b = uri;
        this.f56917c = uri2;
        this.d = j3;
        this.f56918e = j10;
        this.f56919f = j11;
        this.f56920g = j12;
        this.h = arrayList;
        this.f56921i = z10;
        this.f56922j = j13;
        this.f56923k = j14;
        this.f56924l = i0.q(arrayList2);
        this.f56925m = i0.q(arrayList3);
        this.f56926n = i0.w(new ow0(11), arrayList4);
        this.f56927o = z11;
        this.f56928p = str2;
        this.f56929q = str3;
        this.f56930r = j15;
        this.f56931s = j16;
        this.f56932t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.f56918e == hVar.f56918e && this.f56919f == hVar.f56919f && this.f56920g == hVar.f56920g && this.f56921i == hVar.f56921i && this.f56922j == hVar.f56922j && this.f56923k == hVar.f56923k && this.f56927o == hVar.f56927o && this.f56930r == hVar.f56930r && this.f56931s == hVar.f56931s && Objects.equals(this.f56915a, hVar.f56915a) && Objects.equals(this.f56916b, hVar.f56916b) && Objects.equals(this.f56917c, hVar.f56917c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f56924l, hVar.f56924l) && Objects.equals(this.f56925m, hVar.f56925m) && Objects.equals(this.f56926n, hVar.f56926n) && Objects.equals(this.f56928p, hVar.f56928p) && Objects.equals(this.f56929q, hVar.f56929q) && Objects.equals(this.f56932t, hVar.f56932t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56915a, this.f56916b, this.f56917c, Long.valueOf(this.d), Long.valueOf(this.f56918e), Long.valueOf(this.f56919f), Long.valueOf(this.f56920g), this.h, Boolean.valueOf(this.f56921i), Long.valueOf(this.f56922j), Long.valueOf(this.f56923k), this.f56924l, this.f56925m, this.f56926n, Boolean.valueOf(this.f56927o), this.f56928p, this.f56929q, Long.valueOf(this.f56930r), Long.valueOf(this.f56931s), this.f56932t);
    }
}
