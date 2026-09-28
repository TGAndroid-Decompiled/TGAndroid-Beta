package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40701a;
    public final Uri f40702b;
    public final Uri f40703c;
    public final long d;
    public final long e;
    public final long f40704f;
    public final long f40705g;
    public final List h;
    public final boolean f40706i;
    public final long f40707j;
    public final long f40708k;
    public final i0 f40709l;
    public final i0 f40710m;
    public final a1 f40711n;
    public final boolean f40712o;
    public final String f40713p;
    public final String f40714q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40701a = str;
        this.f40702b = uri;
        this.f40703c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40704f = j11;
        this.f40705g = j12;
        this.h = arrayList;
        this.f40706i = z10;
        this.f40707j = j13;
        this.f40708k = j14;
        this.f40709l = i0.v(arrayList2);
        this.f40710m = i0.v(arrayList3);
        this.f40711n = i0.B(new db1(5), arrayList4);
        this.f40712o = z11;
        this.f40713p = str2;
        this.f40714q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40704f == fVar.f40704f && this.f40705g == fVar.f40705g && this.f40706i == fVar.f40706i && this.f40707j == fVar.f40707j && this.f40708k == fVar.f40708k && this.f40712o == fVar.f40712o && Objects.equals(this.f40701a, fVar.f40701a) && Objects.equals(this.f40702b, fVar.f40702b) && Objects.equals(this.f40703c, fVar.f40703c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40709l, fVar.f40709l) && Objects.equals(this.f40710m, fVar.f40710m) && Objects.equals(this.f40711n, fVar.f40711n) && Objects.equals(this.f40713p, fVar.f40713p) && Objects.equals(this.f40714q, fVar.f40714q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40701a, this.f40702b, this.f40703c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40704f), Long.valueOf(this.f40705g), this.h, Boolean.valueOf(this.f40706i), Long.valueOf(this.f40707j), Long.valueOf(this.f40708k), this.f40709l, this.f40710m, this.f40711n, Boolean.valueOf(this.f40712o), this.f40713p, this.f40714q);
    }
}
