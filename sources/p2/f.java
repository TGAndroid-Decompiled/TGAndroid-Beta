package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.cb1;
public final class f {
    public final String f40699a;
    public final Uri f40700b;
    public final Uri f40701c;
    public final long d;
    public final long e;
    public final long f40702f;
    public final long f40703g;
    public final List h;
    public final boolean f40704i;
    public final long f40705j;
    public final long f40706k;
    public final i0 f40707l;
    public final i0 f40708m;
    public final a1 f40709n;
    public final boolean f40710o;
    public final String f40711p;
    public final String f40712q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40699a = str;
        this.f40700b = uri;
        this.f40701c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40702f = j11;
        this.f40703g = j12;
        this.h = arrayList;
        this.f40704i = z10;
        this.f40705j = j13;
        this.f40706k = j14;
        this.f40707l = i0.v(arrayList2);
        this.f40708m = i0.v(arrayList3);
        this.f40709n = i0.B(new cb1(5), arrayList4);
        this.f40710o = z11;
        this.f40711p = str2;
        this.f40712q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40702f == fVar.f40702f && this.f40703g == fVar.f40703g && this.f40704i == fVar.f40704i && this.f40705j == fVar.f40705j && this.f40706k == fVar.f40706k && this.f40710o == fVar.f40710o && Objects.equals(this.f40699a, fVar.f40699a) && Objects.equals(this.f40700b, fVar.f40700b) && Objects.equals(this.f40701c, fVar.f40701c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40707l, fVar.f40707l) && Objects.equals(this.f40708m, fVar.f40708m) && Objects.equals(this.f40709n, fVar.f40709n) && Objects.equals(this.f40711p, fVar.f40711p) && Objects.equals(this.f40712q, fVar.f40712q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40699a, this.f40700b, this.f40701c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40702f), Long.valueOf(this.f40703g), this.h, Boolean.valueOf(this.f40704i), Long.valueOf(this.f40705j), Long.valueOf(this.f40706k), this.f40707l, this.f40708m, this.f40709n, Boolean.valueOf(this.f40710o), this.f40711p, this.f40712q);
    }
}
