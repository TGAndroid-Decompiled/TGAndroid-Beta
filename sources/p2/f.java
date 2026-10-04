package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.gb1;
public final class f {
    public final String f44028a;
    public final Uri f44029b;
    public final Uri f44030c;
    public final long d;
    public final long f44031e;
    public final long f44032f;
    public final long f44033g;
    public final List h;
    public final boolean f44034i;
    public final long f44035j;
    public final long f44036k;
    public final i0 f44037l;
    public final i0 f44038m;
    public final a1 f44039n;
    public final boolean f44040o;
    public final String f44041p;
    public final String f44042q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f44028a = str;
        this.f44029b = uri;
        this.f44030c = uri2;
        this.d = j3;
        this.f44031e = j10;
        this.f44032f = j11;
        this.f44033g = j12;
        this.h = arrayList;
        this.f44034i = z10;
        this.f44035j = j13;
        this.f44036k = j14;
        this.f44037l = i0.v(arrayList2);
        this.f44038m = i0.v(arrayList3);
        this.f44039n = i0.B(new gb1(5), arrayList4);
        this.f44040o = z11;
        this.f44041p = str2;
        this.f44042q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f44031e == fVar.f44031e && this.f44032f == fVar.f44032f && this.f44033g == fVar.f44033g && this.f44034i == fVar.f44034i && this.f44035j == fVar.f44035j && this.f44036k == fVar.f44036k && this.f44040o == fVar.f44040o && Objects.equals(this.f44028a, fVar.f44028a) && Objects.equals(this.f44029b, fVar.f44029b) && Objects.equals(this.f44030c, fVar.f44030c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f44037l, fVar.f44037l) && Objects.equals(this.f44038m, fVar.f44038m) && Objects.equals(this.f44039n, fVar.f44039n) && Objects.equals(this.f44041p, fVar.f44041p) && Objects.equals(this.f44042q, fVar.f44042q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44028a, this.f44029b, this.f44030c, Long.valueOf(this.d), Long.valueOf(this.f44031e), Long.valueOf(this.f44032f), Long.valueOf(this.f44033g), this.h, Boolean.valueOf(this.f44034i), Long.valueOf(this.f44035j), Long.valueOf(this.f44036k), this.f44037l, this.f44038m, this.f44039n, Boolean.valueOf(this.f44040o), this.f44041p, this.f44042q);
    }
}
