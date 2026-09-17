package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.f11;
public final class f {
    public final String f43680a;
    public final Uri f43681b;
    public final Uri f43682c;
    public final long d;
    public final long f43683e;
    public final long f43684f;
    public final long f43685g;
    public final List h;
    public final boolean f43686i;
    public final long f43687j;
    public final long f43688k;
    public final i0 f43689l;
    public final i0 f43690m;
    public final a1 f43691n;
    public final boolean f43692o;
    public final String f43693p;
    public final String f43694q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f43680a = str;
        this.f43681b = uri;
        this.f43682c = uri2;
        this.d = j3;
        this.f43683e = j10;
        this.f43684f = j11;
        this.f43685g = j12;
        this.h = arrayList;
        this.f43686i = z10;
        this.f43687j = j13;
        this.f43688k = j14;
        this.f43689l = i0.v(arrayList2);
        this.f43690m = i0.v(arrayList3);
        this.f43691n = i0.B(new f11(7), arrayList4);
        this.f43692o = z11;
        this.f43693p = str2;
        this.f43694q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f43683e == fVar.f43683e && this.f43684f == fVar.f43684f && this.f43685g == fVar.f43685g && this.f43686i == fVar.f43686i && this.f43687j == fVar.f43687j && this.f43688k == fVar.f43688k && this.f43692o == fVar.f43692o && Objects.equals(this.f43680a, fVar.f43680a) && Objects.equals(this.f43681b, fVar.f43681b) && Objects.equals(this.f43682c, fVar.f43682c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f43689l, fVar.f43689l) && Objects.equals(this.f43690m, fVar.f43690m) && Objects.equals(this.f43691n, fVar.f43691n) && Objects.equals(this.f43693p, fVar.f43693p) && Objects.equals(this.f43694q, fVar.f43694q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43680a, this.f43681b, this.f43682c, Long.valueOf(this.d), Long.valueOf(this.f43683e), Long.valueOf(this.f43684f), Long.valueOf(this.f43685g), this.h, Boolean.valueOf(this.f43686i), Long.valueOf(this.f43687j), Long.valueOf(this.f43688k), this.f43689l, this.f43690m, this.f43691n, Boolean.valueOf(this.f43692o), this.f43693p, this.f43694q);
    }
}
