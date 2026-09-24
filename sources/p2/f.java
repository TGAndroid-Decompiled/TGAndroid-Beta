package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40687a;
    public final Uri f40688b;
    public final Uri f40689c;
    public final long d;
    public final long e;
    public final long f40690f;
    public final long f40691g;
    public final List h;
    public final boolean f40692i;
    public final long f40693j;
    public final long f40694k;
    public final i0 f40695l;
    public final i0 f40696m;
    public final a1 f40697n;
    public final boolean f40698o;
    public final String f40699p;
    public final String f40700q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40687a = str;
        this.f40688b = uri;
        this.f40689c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40690f = j11;
        this.f40691g = j12;
        this.h = arrayList;
        this.f40692i = z10;
        this.f40693j = j13;
        this.f40694k = j14;
        this.f40695l = i0.v(arrayList2);
        this.f40696m = i0.v(arrayList3);
        this.f40697n = i0.B(new db1(5), arrayList4);
        this.f40698o = z11;
        this.f40699p = str2;
        this.f40700q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40690f == fVar.f40690f && this.f40691g == fVar.f40691g && this.f40692i == fVar.f40692i && this.f40693j == fVar.f40693j && this.f40694k == fVar.f40694k && this.f40698o == fVar.f40698o && Objects.equals(this.f40687a, fVar.f40687a) && Objects.equals(this.f40688b, fVar.f40688b) && Objects.equals(this.f40689c, fVar.f40689c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40695l, fVar.f40695l) && Objects.equals(this.f40696m, fVar.f40696m) && Objects.equals(this.f40697n, fVar.f40697n) && Objects.equals(this.f40699p, fVar.f40699p) && Objects.equals(this.f40700q, fVar.f40700q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40687a, this.f40688b, this.f40689c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40690f), Long.valueOf(this.f40691g), this.h, Boolean.valueOf(this.f40692i), Long.valueOf(this.f40693j), Long.valueOf(this.f40694k), this.f40695l, this.f40696m, this.f40697n, Boolean.valueOf(this.f40698o), this.f40699p, this.f40700q);
    }
}
