package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.kb1;
public final class g {
    public final String f40430a;
    public final Uri f40431b;
    public final Uri f40432c;
    public final long d;
    public final long e;
    public final long f40433f;
    public final long f40434g;
    public final List h;
    public final boolean f40435i;
    public final long f40436j;
    public final long f40437k;
    public final i0 f40438l;
    public final i0 f40439m;
    public final a1 f40440n;
    public final boolean f40441o;
    public final String f40442p;
    public final String f40443q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40430a = str;
        this.f40431b = uri;
        this.f40432c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40433f = j11;
        this.f40434g = j12;
        this.h = arrayList;
        this.f40435i = z10;
        this.f40436j = j13;
        this.f40437k = j14;
        this.f40438l = i0.v(arrayList2);
        this.f40439m = i0.v(arrayList3);
        this.f40440n = i0.B(new kb1(5), arrayList4);
        this.f40441o = z11;
        this.f40442p = str2;
        this.f40443q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f40433f == gVar.f40433f && this.f40434g == gVar.f40434g && this.f40435i == gVar.f40435i && this.f40436j == gVar.f40436j && this.f40437k == gVar.f40437k && this.f40441o == gVar.f40441o && Objects.equals(this.f40430a, gVar.f40430a) && Objects.equals(this.f40431b, gVar.f40431b) && Objects.equals(this.f40432c, gVar.f40432c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f40438l, gVar.f40438l) && Objects.equals(this.f40439m, gVar.f40439m) && Objects.equals(this.f40440n, gVar.f40440n) && Objects.equals(this.f40442p, gVar.f40442p) && Objects.equals(this.f40443q, gVar.f40443q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40430a, this.f40431b, this.f40432c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40433f), Long.valueOf(this.f40434g), this.h, Boolean.valueOf(this.f40435i), Long.valueOf(this.f40436j), Long.valueOf(this.f40437k), this.f40438l, this.f40439m, this.f40440n, Boolean.valueOf(this.f40441o), this.f40442p, this.f40443q);
    }
}
