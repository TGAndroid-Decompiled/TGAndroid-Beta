package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.lb1;
public final class f {
    public final String f45269a;
    public final Uri f45270b;
    public final Uri f45271c;
    public final long d;
    public final long f45272e;
    public final long f45273f;
    public final long f45274g;
    public final List h;
    public final boolean f45275i;
    public final long f45276j;
    public final long f45277k;
    public final i0 f45278l;
    public final i0 f45279m;
    public final a1 f45280n;
    public final boolean f45281o;
    public final String f45282p;
    public final String f45283q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45269a = str;
        this.f45270b = uri;
        this.f45271c = uri2;
        this.d = j3;
        this.f45272e = j10;
        this.f45273f = j11;
        this.f45274g = j12;
        this.h = arrayList;
        this.f45275i = z10;
        this.f45276j = j13;
        this.f45277k = j14;
        this.f45278l = i0.v(arrayList2);
        this.f45279m = i0.v(arrayList3);
        this.f45280n = i0.B(new lb1(7), arrayList4);
        this.f45281o = z11;
        this.f45282p = str2;
        this.f45283q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45272e == fVar.f45272e && this.f45273f == fVar.f45273f && this.f45274g == fVar.f45274g && this.f45275i == fVar.f45275i && this.f45276j == fVar.f45276j && this.f45277k == fVar.f45277k && this.f45281o == fVar.f45281o && Objects.equals(this.f45269a, fVar.f45269a) && Objects.equals(this.f45270b, fVar.f45270b) && Objects.equals(this.f45271c, fVar.f45271c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45278l, fVar.f45278l) && Objects.equals(this.f45279m, fVar.f45279m) && Objects.equals(this.f45280n, fVar.f45280n) && Objects.equals(this.f45282p, fVar.f45282p) && Objects.equals(this.f45283q, fVar.f45283q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45269a, this.f45270b, this.f45271c, Long.valueOf(this.d), Long.valueOf(this.f45272e), Long.valueOf(this.f45273f), Long.valueOf(this.f45274g), this.h, Boolean.valueOf(this.f45275i), Long.valueOf(this.f45276j), Long.valueOf(this.f45277k), this.f45278l, this.f45279m, this.f45280n, Boolean.valueOf(this.f45281o), this.f45282p, this.f45283q);
    }
}
