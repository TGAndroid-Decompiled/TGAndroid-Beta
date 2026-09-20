package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.mb1;
public final class f {
    public final String f40728a;
    public final Uri f40729b;
    public final Uri f40730c;
    public final long d;
    public final long e;
    public final long f40731f;
    public final long f40732g;
    public final List h;
    public final boolean f40733i;
    public final long f40734j;
    public final long f40735k;
    public final i0 f40736l;
    public final i0 f40737m;
    public final a1 f40738n;
    public final boolean f40739o;
    public final String f40740p;
    public final String f40741q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40728a = str;
        this.f40729b = uri;
        this.f40730c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40731f = j11;
        this.f40732g = j12;
        this.h = arrayList;
        this.f40733i = z10;
        this.f40734j = j13;
        this.f40735k = j14;
        this.f40736l = i0.v(arrayList2);
        this.f40737m = i0.v(arrayList3);
        this.f40738n = i0.B(new mb1(5), arrayList4);
        this.f40739o = z11;
        this.f40740p = str2;
        this.f40741q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40731f == fVar.f40731f && this.f40732g == fVar.f40732g && this.f40733i == fVar.f40733i && this.f40734j == fVar.f40734j && this.f40735k == fVar.f40735k && this.f40739o == fVar.f40739o && Objects.equals(this.f40728a, fVar.f40728a) && Objects.equals(this.f40729b, fVar.f40729b) && Objects.equals(this.f40730c, fVar.f40730c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40736l, fVar.f40736l) && Objects.equals(this.f40737m, fVar.f40737m) && Objects.equals(this.f40738n, fVar.f40738n) && Objects.equals(this.f40740p, fVar.f40740p) && Objects.equals(this.f40741q, fVar.f40741q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40728a, this.f40729b, this.f40730c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40731f), Long.valueOf(this.f40732g), this.h, Boolean.valueOf(this.f40733i), Long.valueOf(this.f40734j), Long.valueOf(this.f40735k), this.f40736l, this.f40737m, this.f40738n, Boolean.valueOf(this.f40739o), this.f40740p, this.f40741q);
    }
}
