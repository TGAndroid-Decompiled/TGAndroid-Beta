package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40700a;
    public final Uri f40701b;
    public final Uri f40702c;
    public final long d;
    public final long e;
    public final long f40703f;
    public final long f40704g;
    public final List h;
    public final boolean f40705i;
    public final long f40706j;
    public final long f40707k;
    public final i0 f40708l;
    public final i0 f40709m;
    public final a1 f40710n;
    public final boolean f40711o;
    public final String f40712p;
    public final String f40713q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40700a = str;
        this.f40701b = uri;
        this.f40702c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40703f = j11;
        this.f40704g = j12;
        this.h = arrayList;
        this.f40705i = z10;
        this.f40706j = j13;
        this.f40707k = j14;
        this.f40708l = i0.v(arrayList2);
        this.f40709m = i0.v(arrayList3);
        this.f40710n = i0.B(new db1(5), arrayList4);
        this.f40711o = z11;
        this.f40712p = str2;
        this.f40713q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40703f == fVar.f40703f && this.f40704g == fVar.f40704g && this.f40705i == fVar.f40705i && this.f40706j == fVar.f40706j && this.f40707k == fVar.f40707k && this.f40711o == fVar.f40711o && Objects.equals(this.f40700a, fVar.f40700a) && Objects.equals(this.f40701b, fVar.f40701b) && Objects.equals(this.f40702c, fVar.f40702c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40708l, fVar.f40708l) && Objects.equals(this.f40709m, fVar.f40709m) && Objects.equals(this.f40710n, fVar.f40710n) && Objects.equals(this.f40712p, fVar.f40712p) && Objects.equals(this.f40713q, fVar.f40713q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40700a, this.f40701b, this.f40702c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40703f), Long.valueOf(this.f40704g), this.h, Boolean.valueOf(this.f40705i), Long.valueOf(this.f40706j), Long.valueOf(this.f40707k), this.f40708l, this.f40709m, this.f40710n, Boolean.valueOf(this.f40711o), this.f40712p, this.f40713q);
    }
}
