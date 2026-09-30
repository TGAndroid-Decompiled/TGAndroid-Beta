package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40703a;
    public final Uri f40704b;
    public final Uri f40705c;
    public final long d;
    public final long e;
    public final long f40706f;
    public final long f40707g;
    public final List h;
    public final boolean f40708i;
    public final long f40709j;
    public final long f40710k;
    public final i0 f40711l;
    public final i0 f40712m;
    public final a1 f40713n;
    public final boolean f40714o;
    public final String f40715p;
    public final String f40716q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40703a = str;
        this.f40704b = uri;
        this.f40705c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40706f = j11;
        this.f40707g = j12;
        this.h = arrayList;
        this.f40708i = z10;
        this.f40709j = j13;
        this.f40710k = j14;
        this.f40711l = i0.v(arrayList2);
        this.f40712m = i0.v(arrayList3);
        this.f40713n = i0.B(new db1(5), arrayList4);
        this.f40714o = z11;
        this.f40715p = str2;
        this.f40716q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40706f == fVar.f40706f && this.f40707g == fVar.f40707g && this.f40708i == fVar.f40708i && this.f40709j == fVar.f40709j && this.f40710k == fVar.f40710k && this.f40714o == fVar.f40714o && Objects.equals(this.f40703a, fVar.f40703a) && Objects.equals(this.f40704b, fVar.f40704b) && Objects.equals(this.f40705c, fVar.f40705c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40711l, fVar.f40711l) && Objects.equals(this.f40712m, fVar.f40712m) && Objects.equals(this.f40713n, fVar.f40713n) && Objects.equals(this.f40715p, fVar.f40715p) && Objects.equals(this.f40716q, fVar.f40716q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40703a, this.f40704b, this.f40705c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40706f), Long.valueOf(this.f40707g), this.h, Boolean.valueOf(this.f40708i), Long.valueOf(this.f40709j), Long.valueOf(this.f40710k), this.f40711l, this.f40712m, this.f40713n, Boolean.valueOf(this.f40714o), this.f40715p, this.f40716q);
    }
}
