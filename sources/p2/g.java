package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ex0;
import v7.t6;
public final class g {
    public final String f44577a;
    public final Uri f44578b;
    public final Uri f44579c;
    public final long d;
    public final long e;
    public final long f44580f;
    public final long f44581g;
    public final List h;
    public final boolean f44582i;
    public final long f44583j;
    public final long f44584k;
    public final n0 f44585l;
    public final n0 f44586m;
    public final x1 f44587n;
    public final boolean f44588o;
    public final String f44589p;
    public final String f44590q;
    public final long f44591r;
    public final long f44592s;
    public final String f44593t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        t6.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f44577a = str;
        this.f44578b = uri;
        this.f44579c = uri2;
        this.d = j10;
        this.e = j11;
        this.f44580f = j12;
        this.f44581g = j13;
        this.h = arrayList;
        this.f44582i = z10;
        this.f44583j = j14;
        this.f44584k = j15;
        this.f44585l = n0.u(arrayList2);
        this.f44586m = n0.u(arrayList3);
        this.f44587n = n0.A(new ex0(11), arrayList4);
        this.f44588o = z11;
        this.f44589p = str2;
        this.f44590q = str3;
        this.f44591r = j16;
        this.f44592s = j17;
        this.f44593t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f44580f == gVar.f44580f && this.f44581g == gVar.f44581g && this.f44582i == gVar.f44582i && this.f44583j == gVar.f44583j && this.f44584k == gVar.f44584k && this.f44588o == gVar.f44588o && this.f44591r == gVar.f44591r && this.f44592s == gVar.f44592s && Objects.equals(this.f44577a, gVar.f44577a) && Objects.equals(this.f44578b, gVar.f44578b) && Objects.equals(this.f44579c, gVar.f44579c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f44585l, gVar.f44585l) && Objects.equals(this.f44586m, gVar.f44586m) && Objects.equals(this.f44587n, gVar.f44587n) && Objects.equals(this.f44589p, gVar.f44589p) && Objects.equals(this.f44590q, gVar.f44590q) && Objects.equals(this.f44593t, gVar.f44593t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44577a, this.f44578b, this.f44579c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f44580f), Long.valueOf(this.f44581g), this.h, Boolean.valueOf(this.f44582i), Long.valueOf(this.f44583j), Long.valueOf(this.f44584k), this.f44585l, this.f44586m, this.f44587n, Boolean.valueOf(this.f44588o), this.f44589p, this.f44590q, Long.valueOf(this.f44591r), Long.valueOf(this.f44592s), this.f44593t);
    }
}
