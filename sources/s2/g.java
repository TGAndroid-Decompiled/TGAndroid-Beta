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
    public final String f54557a;
    public final Uri f54558b;
    public final Uri f54559c;
    public final long d;
    public final long f54560e;
    public final long f54561f;
    public final long f54562g;
    public final List h;
    public final boolean f54563i;
    public final long f54564j;
    public final long f54565k;
    public final i0 f54566l;
    public final i0 f54567m;
    public final t1 f54568n;
    public final boolean f54569o;
    public final String f54570p;
    public final String f54571q;
    public final long f54572r;
    public final long f54573s;
    public final String f54574t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54557a = str;
        this.f54558b = uri;
        this.f54559c = uri2;
        this.d = j3;
        this.f54560e = j10;
        this.f54561f = j11;
        this.f54562g = j12;
        this.h = arrayList;
        this.f54563i = z9;
        this.f54564j = j13;
        this.f54565k = j14;
        this.f54566l = i0.q(arrayList2);
        this.f54567m = i0.q(arrayList3);
        this.f54568n = i0.w(new un0(12), arrayList4);
        this.f54569o = z10;
        this.f54570p = str2;
        this.f54571q = str3;
        this.f54572r = j15;
        this.f54573s = j16;
        this.f54574t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54560e == gVar.f54560e && this.f54561f == gVar.f54561f && this.f54562g == gVar.f54562g && this.f54563i == gVar.f54563i && this.f54564j == gVar.f54564j && this.f54565k == gVar.f54565k && this.f54569o == gVar.f54569o && this.f54572r == gVar.f54572r && this.f54573s == gVar.f54573s && Objects.equals(this.f54557a, gVar.f54557a) && Objects.equals(this.f54558b, gVar.f54558b) && Objects.equals(this.f54559c, gVar.f54559c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54566l, gVar.f54566l) && Objects.equals(this.f54567m, gVar.f54567m) && Objects.equals(this.f54568n, gVar.f54568n) && Objects.equals(this.f54570p, gVar.f54570p) && Objects.equals(this.f54571q, gVar.f54571q) && Objects.equals(this.f54574t, gVar.f54574t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54557a, this.f54558b, this.f54559c, Long.valueOf(this.d), Long.valueOf(this.f54560e), Long.valueOf(this.f54561f), Long.valueOf(this.f54562g), this.h, Boolean.valueOf(this.f54563i), Long.valueOf(this.f54564j), Long.valueOf(this.f54565k), this.f54566l, this.f54567m, this.f54568n, Boolean.valueOf(this.f54569o), this.f54570p, this.f54571q, Long.valueOf(this.f54572r), Long.valueOf(this.f54573s), this.f54574t);
    }
}
