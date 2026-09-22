package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.mb1;
public final class f {
    public final String f40749a;
    public final Uri f40750b;
    public final Uri f40751c;
    public final long d;
    public final long e;
    public final long f40752f;
    public final long f40753g;
    public final List h;
    public final boolean f40754i;
    public final long f40755j;
    public final long f40756k;
    public final i0 f40757l;
    public final i0 f40758m;
    public final a1 f40759n;
    public final boolean f40760o;
    public final String f40761p;
    public final String f40762q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40749a = str;
        this.f40750b = uri;
        this.f40751c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40752f = j11;
        this.f40753g = j12;
        this.h = arrayList;
        this.f40754i = z10;
        this.f40755j = j13;
        this.f40756k = j14;
        this.f40757l = i0.v(arrayList2);
        this.f40758m = i0.v(arrayList3);
        this.f40759n = i0.B(new mb1(5), arrayList4);
        this.f40760o = z11;
        this.f40761p = str2;
        this.f40762q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40752f == fVar.f40752f && this.f40753g == fVar.f40753g && this.f40754i == fVar.f40754i && this.f40755j == fVar.f40755j && this.f40756k == fVar.f40756k && this.f40760o == fVar.f40760o && Objects.equals(this.f40749a, fVar.f40749a) && Objects.equals(this.f40750b, fVar.f40750b) && Objects.equals(this.f40751c, fVar.f40751c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40757l, fVar.f40757l) && Objects.equals(this.f40758m, fVar.f40758m) && Objects.equals(this.f40759n, fVar.f40759n) && Objects.equals(this.f40761p, fVar.f40761p) && Objects.equals(this.f40762q, fVar.f40762q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40749a, this.f40750b, this.f40751c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40752f), Long.valueOf(this.f40753g), this.h, Boolean.valueOf(this.f40754i), Long.valueOf(this.f40755j), Long.valueOf(this.f40756k), this.f40757l, this.f40758m, this.f40759n, Boolean.valueOf(this.f40760o), this.f40761p, this.f40762q);
    }
}
