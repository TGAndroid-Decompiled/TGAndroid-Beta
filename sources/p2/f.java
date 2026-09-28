package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40702a;
    public final Uri f40703b;
    public final Uri f40704c;
    public final long d;
    public final long e;
    public final long f40705f;
    public final long f40706g;
    public final List h;
    public final boolean f40707i;
    public final long f40708j;
    public final long f40709k;
    public final i0 f40710l;
    public final i0 f40711m;
    public final a1 f40712n;
    public final boolean f40713o;
    public final String f40714p;
    public final String f40715q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40702a = str;
        this.f40703b = uri;
        this.f40704c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40705f = j11;
        this.f40706g = j12;
        this.h = arrayList;
        this.f40707i = z10;
        this.f40708j = j13;
        this.f40709k = j14;
        this.f40710l = i0.v(arrayList2);
        this.f40711m = i0.v(arrayList3);
        this.f40712n = i0.B(new db1(5), arrayList4);
        this.f40713o = z11;
        this.f40714p = str2;
        this.f40715q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40705f == fVar.f40705f && this.f40706g == fVar.f40706g && this.f40707i == fVar.f40707i && this.f40708j == fVar.f40708j && this.f40709k == fVar.f40709k && this.f40713o == fVar.f40713o && Objects.equals(this.f40702a, fVar.f40702a) && Objects.equals(this.f40703b, fVar.f40703b) && Objects.equals(this.f40704c, fVar.f40704c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40710l, fVar.f40710l) && Objects.equals(this.f40711m, fVar.f40711m) && Objects.equals(this.f40712n, fVar.f40712n) && Objects.equals(this.f40714p, fVar.f40714p) && Objects.equals(this.f40715q, fVar.f40715q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40702a, this.f40703b, this.f40704c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40705f), Long.valueOf(this.f40706g), this.h, Boolean.valueOf(this.f40707i), Long.valueOf(this.f40708j), Long.valueOf(this.f40709k), this.f40710l, this.f40711m, this.f40712n, Boolean.valueOf(this.f40713o), this.f40714p, this.f40715q);
    }
}
