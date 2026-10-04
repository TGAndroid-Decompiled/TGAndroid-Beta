package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.gb1;
public final class f {
    public final String f44021a;
    public final Uri f44022b;
    public final Uri f44023c;
    public final long d;
    public final long f44024e;
    public final long f44025f;
    public final long f44026g;
    public final List h;
    public final boolean f44027i;
    public final long f44028j;
    public final long f44029k;
    public final i0 f44030l;
    public final i0 f44031m;
    public final a1 f44032n;
    public final boolean f44033o;
    public final String f44034p;
    public final String f44035q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f44021a = str;
        this.f44022b = uri;
        this.f44023c = uri2;
        this.d = j3;
        this.f44024e = j10;
        this.f44025f = j11;
        this.f44026g = j12;
        this.h = arrayList;
        this.f44027i = z10;
        this.f44028j = j13;
        this.f44029k = j14;
        this.f44030l = i0.v(arrayList2);
        this.f44031m = i0.v(arrayList3);
        this.f44032n = i0.B(new gb1(5), arrayList4);
        this.f44033o = z11;
        this.f44034p = str2;
        this.f44035q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f44024e == fVar.f44024e && this.f44025f == fVar.f44025f && this.f44026g == fVar.f44026g && this.f44027i == fVar.f44027i && this.f44028j == fVar.f44028j && this.f44029k == fVar.f44029k && this.f44033o == fVar.f44033o && Objects.equals(this.f44021a, fVar.f44021a) && Objects.equals(this.f44022b, fVar.f44022b) && Objects.equals(this.f44023c, fVar.f44023c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f44030l, fVar.f44030l) && Objects.equals(this.f44031m, fVar.f44031m) && Objects.equals(this.f44032n, fVar.f44032n) && Objects.equals(this.f44034p, fVar.f44034p) && Objects.equals(this.f44035q, fVar.f44035q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44021a, this.f44022b, this.f44023c, Long.valueOf(this.d), Long.valueOf(this.f44024e), Long.valueOf(this.f44025f), Long.valueOf(this.f44026g), this.h, Boolean.valueOf(this.f44027i), Long.valueOf(this.f44028j), Long.valueOf(this.f44029k), this.f44030l, this.f44031m, this.f44032n, Boolean.valueOf(this.f44033o), this.f44034p, this.f44035q);
    }
}
