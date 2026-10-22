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
    public final String f43971a;
    public final Uri f43972b;
    public final Uri f43973c;
    public final long d;
    public final long e;
    public final long f43974f;
    public final long f43975g;
    public final List h;
    public final boolean f43976i;
    public final long f43977j;
    public final long f43978k;
    public final n0 f43979l;
    public final n0 f43980m;
    public final x1 f43981n;
    public final boolean f43982o;
    public final String f43983p;
    public final String f43984q;
    public final long f43985r;
    public final long f43986s;
    public final String f43987t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43971a = str;
        this.f43972b = uri;
        this.f43973c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43974f = j12;
        this.f43975g = j13;
        this.h = arrayList;
        this.f43976i = z10;
        this.f43977j = j14;
        this.f43978k = j15;
        this.f43979l = n0.u(arrayList2);
        this.f43980m = n0.u(arrayList3);
        this.f43981n = n0.A(new jg0(14), arrayList4);
        this.f43982o = z11;
        this.f43983p = str2;
        this.f43984q = str3;
        this.f43985r = j16;
        this.f43986s = j17;
        this.f43987t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43974f == hVar.f43974f && this.f43975g == hVar.f43975g && this.f43976i == hVar.f43976i && this.f43977j == hVar.f43977j && this.f43978k == hVar.f43978k && this.f43982o == hVar.f43982o && this.f43985r == hVar.f43985r && this.f43986s == hVar.f43986s && Objects.equals(this.f43971a, hVar.f43971a) && Objects.equals(this.f43972b, hVar.f43972b) && Objects.equals(this.f43973c, hVar.f43973c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43979l, hVar.f43979l) && Objects.equals(this.f43980m, hVar.f43980m) && Objects.equals(this.f43981n, hVar.f43981n) && Objects.equals(this.f43983p, hVar.f43983p) && Objects.equals(this.f43984q, hVar.f43984q) && Objects.equals(this.f43987t, hVar.f43987t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43971a, this.f43972b, this.f43973c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43974f), Long.valueOf(this.f43975g), this.h, Boolean.valueOf(this.f43976i), Long.valueOf(this.f43977j), Long.valueOf(this.f43978k), this.f43979l, this.f43980m, this.f43981n, Boolean.valueOf(this.f43982o), this.f43983p, this.f43984q, Long.valueOf(this.f43985r), Long.valueOf(this.f43986s), this.f43987t);
    }
}
