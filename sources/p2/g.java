package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.dx0;
import v7.t6;
public final class g {
    public final String f44588a;
    public final Uri f44589b;
    public final Uri f44590c;
    public final long d;
    public final long e;
    public final long f44591f;
    public final long f44592g;
    public final List h;
    public final boolean f44593i;
    public final long f44594j;
    public final long f44595k;
    public final n0 f44596l;
    public final n0 f44597m;
    public final x1 f44598n;
    public final boolean f44599o;
    public final String f44600p;
    public final String f44601q;
    public final long f44602r;
    public final long f44603s;
    public final String f44604t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        t6.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f44588a = str;
        this.f44589b = uri;
        this.f44590c = uri2;
        this.d = j10;
        this.e = j11;
        this.f44591f = j12;
        this.f44592g = j13;
        this.h = arrayList;
        this.f44593i = z10;
        this.f44594j = j14;
        this.f44595k = j15;
        this.f44596l = n0.u(arrayList2);
        this.f44597m = n0.u(arrayList3);
        this.f44598n = n0.A(new dx0(11), arrayList4);
        this.f44599o = z11;
        this.f44600p = str2;
        this.f44601q = str3;
        this.f44602r = j16;
        this.f44603s = j17;
        this.f44604t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f44591f == gVar.f44591f && this.f44592g == gVar.f44592g && this.f44593i == gVar.f44593i && this.f44594j == gVar.f44594j && this.f44595k == gVar.f44595k && this.f44599o == gVar.f44599o && this.f44602r == gVar.f44602r && this.f44603s == gVar.f44603s && Objects.equals(this.f44588a, gVar.f44588a) && Objects.equals(this.f44589b, gVar.f44589b) && Objects.equals(this.f44590c, gVar.f44590c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f44596l, gVar.f44596l) && Objects.equals(this.f44597m, gVar.f44597m) && Objects.equals(this.f44598n, gVar.f44598n) && Objects.equals(this.f44600p, gVar.f44600p) && Objects.equals(this.f44601q, gVar.f44601q) && Objects.equals(this.f44604t, gVar.f44604t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44588a, this.f44589b, this.f44590c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f44591f), Long.valueOf(this.f44592g), this.h, Boolean.valueOf(this.f44593i), Long.valueOf(this.f44594j), Long.valueOf(this.f44595k), this.f44596l, this.f44597m, this.f44598n, Boolean.valueOf(this.f44599o), this.f44600p, this.f44601q, Long.valueOf(this.f44602r), Long.valueOf(this.f44603s), this.f44604t);
    }
}
