package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.f11;
public final class f {
    public final String f43679a;
    public final Uri f43680b;
    public final Uri f43681c;
    public final long d;
    public final long f43682e;
    public final long f43683f;
    public final long f43684g;
    public final List h;
    public final boolean f43685i;
    public final long f43686j;
    public final long f43687k;
    public final i0 f43688l;
    public final i0 f43689m;
    public final a1 f43690n;
    public final boolean f43691o;
    public final String f43692p;
    public final String f43693q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f43679a = str;
        this.f43680b = uri;
        this.f43681c = uri2;
        this.d = j3;
        this.f43682e = j10;
        this.f43683f = j11;
        this.f43684g = j12;
        this.h = arrayList;
        this.f43685i = z10;
        this.f43686j = j13;
        this.f43687k = j14;
        this.f43688l = i0.v(arrayList2);
        this.f43689m = i0.v(arrayList3);
        this.f43690n = i0.B(new f11(7), arrayList4);
        this.f43691o = z11;
        this.f43692p = str2;
        this.f43693q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f43682e == fVar.f43682e && this.f43683f == fVar.f43683f && this.f43684g == fVar.f43684g && this.f43685i == fVar.f43685i && this.f43686j == fVar.f43686j && this.f43687k == fVar.f43687k && this.f43691o == fVar.f43691o && Objects.equals(this.f43679a, fVar.f43679a) && Objects.equals(this.f43680b, fVar.f43680b) && Objects.equals(this.f43681c, fVar.f43681c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f43688l, fVar.f43688l) && Objects.equals(this.f43689m, fVar.f43689m) && Objects.equals(this.f43690n, fVar.f43690n) && Objects.equals(this.f43692p, fVar.f43692p) && Objects.equals(this.f43693q, fVar.f43693q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43679a, this.f43680b, this.f43681c, Long.valueOf(this.d), Long.valueOf(this.f43682e), Long.valueOf(this.f43683f), Long.valueOf(this.f43684g), this.h, Boolean.valueOf(this.f43685i), Long.valueOf(this.f43686j), Long.valueOf(this.f43687k), this.f43688l, this.f43689m, this.f43690n, Boolean.valueOf(this.f43691o), this.f43692p, this.f43693q);
    }
}
