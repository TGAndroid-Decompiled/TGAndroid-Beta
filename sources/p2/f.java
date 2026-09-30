package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.db1;
public final class f {
    public final String f40800a;
    public final Uri f40801b;
    public final Uri f40802c;
    public final long d;
    public final long e;
    public final long f40803f;
    public final long f40804g;
    public final List h;
    public final boolean f40805i;
    public final long f40806j;
    public final long f40807k;
    public final i0 f40808l;
    public final i0 f40809m;
    public final a1 f40810n;
    public final boolean f40811o;
    public final String f40812p;
    public final String f40813q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40800a = str;
        this.f40801b = uri;
        this.f40802c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40803f = j11;
        this.f40804g = j12;
        this.h = arrayList;
        this.f40805i = z10;
        this.f40806j = j13;
        this.f40807k = j14;
        this.f40808l = i0.v(arrayList2);
        this.f40809m = i0.v(arrayList3);
        this.f40810n = i0.B(new db1(5), arrayList4);
        this.f40811o = z11;
        this.f40812p = str2;
        this.f40813q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f40803f == fVar.f40803f && this.f40804g == fVar.f40804g && this.f40805i == fVar.f40805i && this.f40806j == fVar.f40806j && this.f40807k == fVar.f40807k && this.f40811o == fVar.f40811o && Objects.equals(this.f40800a, fVar.f40800a) && Objects.equals(this.f40801b, fVar.f40801b) && Objects.equals(this.f40802c, fVar.f40802c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f40808l, fVar.f40808l) && Objects.equals(this.f40809m, fVar.f40809m) && Objects.equals(this.f40810n, fVar.f40810n) && Objects.equals(this.f40812p, fVar.f40812p) && Objects.equals(this.f40813q, fVar.f40813q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40800a, this.f40801b, this.f40802c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40803f), Long.valueOf(this.f40804g), this.h, Boolean.valueOf(this.f40805i), Long.valueOf(this.f40806j), Long.valueOf(this.f40807k), this.f40808l, this.f40809m, this.f40810n, Boolean.valueOf(this.f40811o), this.f40812p, this.f40813q);
    }
}
