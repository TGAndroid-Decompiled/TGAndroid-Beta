package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.mb1;
public final class f {
    public final String f45245a;
    public final Uri f45246b;
    public final Uri f45247c;
    public final long d;
    public final long f45248e;
    public final long f45249f;
    public final long f45250g;
    public final List h;
    public final boolean f45251i;
    public final long f45252j;
    public final long f45253k;
    public final i0 f45254l;
    public final i0 f45255m;
    public final a1 f45256n;
    public final boolean f45257o;
    public final String f45258p;
    public final String f45259q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45245a = str;
        this.f45246b = uri;
        this.f45247c = uri2;
        this.d = j3;
        this.f45248e = j10;
        this.f45249f = j11;
        this.f45250g = j12;
        this.h = arrayList;
        this.f45251i = z10;
        this.f45252j = j13;
        this.f45253k = j14;
        this.f45254l = i0.v(arrayList2);
        this.f45255m = i0.v(arrayList3);
        this.f45256n = i0.B(new mb1(7), arrayList4);
        this.f45257o = z11;
        this.f45258p = str2;
        this.f45259q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45248e == fVar.f45248e && this.f45249f == fVar.f45249f && this.f45250g == fVar.f45250g && this.f45251i == fVar.f45251i && this.f45252j == fVar.f45252j && this.f45253k == fVar.f45253k && this.f45257o == fVar.f45257o && Objects.equals(this.f45245a, fVar.f45245a) && Objects.equals(this.f45246b, fVar.f45246b) && Objects.equals(this.f45247c, fVar.f45247c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45254l, fVar.f45254l) && Objects.equals(this.f45255m, fVar.f45255m) && Objects.equals(this.f45256n, fVar.f45256n) && Objects.equals(this.f45258p, fVar.f45258p) && Objects.equals(this.f45259q, fVar.f45259q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45245a, this.f45246b, this.f45247c, Long.valueOf(this.d), Long.valueOf(this.f45248e), Long.valueOf(this.f45249f), Long.valueOf(this.f45250g), this.h, Boolean.valueOf(this.f45251i), Long.valueOf(this.f45252j), Long.valueOf(this.f45253k), this.f45254l, this.f45255m, this.f45256n, Boolean.valueOf(this.f45257o), this.f45258p, this.f45259q);
    }
}
