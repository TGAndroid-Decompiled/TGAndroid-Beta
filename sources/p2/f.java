package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.f11;
public final class f {
    public final String f43706a;
    public final Uri f43707b;
    public final Uri f43708c;
    public final long d;
    public final long f43709e;
    public final long f43710f;
    public final long f43711g;
    public final List h;
    public final boolean f43712i;
    public final long f43713j;
    public final long f43714k;
    public final i0 f43715l;
    public final i0 f43716m;
    public final a1 f43717n;
    public final boolean f43718o;
    public final String f43719p;
    public final String f43720q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f43706a = str;
        this.f43707b = uri;
        this.f43708c = uri2;
        this.d = j3;
        this.f43709e = j10;
        this.f43710f = j11;
        this.f43711g = j12;
        this.h = arrayList;
        this.f43712i = z10;
        this.f43713j = j13;
        this.f43714k = j14;
        this.f43715l = i0.v(arrayList2);
        this.f43716m = i0.v(arrayList3);
        this.f43717n = i0.B(new f11(7), arrayList4);
        this.f43718o = z11;
        this.f43719p = str2;
        this.f43720q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f43709e == fVar.f43709e && this.f43710f == fVar.f43710f && this.f43711g == fVar.f43711g && this.f43712i == fVar.f43712i && this.f43713j == fVar.f43713j && this.f43714k == fVar.f43714k && this.f43718o == fVar.f43718o && Objects.equals(this.f43706a, fVar.f43706a) && Objects.equals(this.f43707b, fVar.f43707b) && Objects.equals(this.f43708c, fVar.f43708c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f43715l, fVar.f43715l) && Objects.equals(this.f43716m, fVar.f43716m) && Objects.equals(this.f43717n, fVar.f43717n) && Objects.equals(this.f43719p, fVar.f43719p) && Objects.equals(this.f43720q, fVar.f43720q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43706a, this.f43707b, this.f43708c, Long.valueOf(this.d), Long.valueOf(this.f43709e), Long.valueOf(this.f43710f), Long.valueOf(this.f43711g), this.h, Boolean.valueOf(this.f43712i), Long.valueOf(this.f43713j), Long.valueOf(this.f43714k), this.f43715l, this.f43716m, this.f43717n, Boolean.valueOf(this.f43718o), this.f43719p, this.f43720q);
    }
}
