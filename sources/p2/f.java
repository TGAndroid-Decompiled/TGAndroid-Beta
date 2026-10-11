package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.lb1;
public final class f {
    public final String f45235a;
    public final Uri f45236b;
    public final Uri f45237c;
    public final long d;
    public final long f45238e;
    public final long f45239f;
    public final long f45240g;
    public final List h;
    public final boolean f45241i;
    public final long f45242j;
    public final long f45243k;
    public final i0 f45244l;
    public final i0 f45245m;
    public final a1 f45246n;
    public final boolean f45247o;
    public final String f45248p;
    public final String f45249q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45235a = str;
        this.f45236b = uri;
        this.f45237c = uri2;
        this.d = j3;
        this.f45238e = j10;
        this.f45239f = j11;
        this.f45240g = j12;
        this.h = arrayList;
        this.f45241i = z10;
        this.f45242j = j13;
        this.f45243k = j14;
        this.f45244l = i0.v(arrayList2);
        this.f45245m = i0.v(arrayList3);
        this.f45246n = i0.B(new lb1(7), arrayList4);
        this.f45247o = z11;
        this.f45248p = str2;
        this.f45249q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45238e == fVar.f45238e && this.f45239f == fVar.f45239f && this.f45240g == fVar.f45240g && this.f45241i == fVar.f45241i && this.f45242j == fVar.f45242j && this.f45243k == fVar.f45243k && this.f45247o == fVar.f45247o && Objects.equals(this.f45235a, fVar.f45235a) && Objects.equals(this.f45236b, fVar.f45236b) && Objects.equals(this.f45237c, fVar.f45237c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45244l, fVar.f45244l) && Objects.equals(this.f45245m, fVar.f45245m) && Objects.equals(this.f45246n, fVar.f45246n) && Objects.equals(this.f45248p, fVar.f45248p) && Objects.equals(this.f45249q, fVar.f45249q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45235a, this.f45236b, this.f45237c, Long.valueOf(this.d), Long.valueOf(this.f45238e), Long.valueOf(this.f45239f), Long.valueOf(this.f45240g), this.h, Boolean.valueOf(this.f45241i), Long.valueOf(this.f45242j), Long.valueOf(this.f45243k), this.f45244l, this.f45245m, this.f45246n, Boolean.valueOf(this.f45247o), this.f45248p, this.f45249q);
    }
}
