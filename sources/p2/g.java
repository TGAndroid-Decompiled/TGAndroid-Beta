package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ob1;
public final class g {
    public final String f40434a;
    public final Uri f40435b;
    public final Uri f40436c;
    public final long d;
    public final long e;
    public final long f40437f;
    public final long f40438g;
    public final List h;
    public final boolean f40439i;
    public final long f40440j;
    public final long f40441k;
    public final i0 f40442l;
    public final i0 f40443m;
    public final a1 f40444n;
    public final boolean f40445o;
    public final String f40446p;
    public final String f40447q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40434a = str;
        this.f40435b = uri;
        this.f40436c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40437f = j11;
        this.f40438g = j12;
        this.h = arrayList;
        this.f40439i = z10;
        this.f40440j = j13;
        this.f40441k = j14;
        this.f40442l = i0.v(arrayList2);
        this.f40443m = i0.v(arrayList3);
        this.f40444n = i0.B(new ob1(5), arrayList4);
        this.f40445o = z11;
        this.f40446p = str2;
        this.f40447q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f40437f == gVar.f40437f && this.f40438g == gVar.f40438g && this.f40439i == gVar.f40439i && this.f40440j == gVar.f40440j && this.f40441k == gVar.f40441k && this.f40445o == gVar.f40445o && Objects.equals(this.f40434a, gVar.f40434a) && Objects.equals(this.f40435b, gVar.f40435b) && Objects.equals(this.f40436c, gVar.f40436c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f40442l, gVar.f40442l) && Objects.equals(this.f40443m, gVar.f40443m) && Objects.equals(this.f40444n, gVar.f40444n) && Objects.equals(this.f40446p, gVar.f40446p) && Objects.equals(this.f40447q, gVar.f40447q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40434a, this.f40435b, this.f40436c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40437f), Long.valueOf(this.f40438g), this.h, Boolean.valueOf(this.f40439i), Long.valueOf(this.f40440j), Long.valueOf(this.f40441k), this.f40442l, this.f40443m, this.f40444n, Boolean.valueOf(this.f40445o), this.f40446p, this.f40447q);
    }
}
