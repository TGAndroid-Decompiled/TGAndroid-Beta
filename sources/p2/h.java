package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.o70;
import v7.u6;
public final class h {
    public final String f44387a;
    public final Uri f44388b;
    public final Uri f44389c;
    public final long d;
    public final long e;
    public final long f44390f;
    public final long f44391g;
    public final List h;
    public final boolean f44392i;
    public final long f44393j;
    public final long f44394k;
    public final n0 f44395l;
    public final n0 f44396m;
    public final x1 f44397n;
    public final boolean f44398o;
    public final String f44399p;
    public final String f44400q;
    public final long f44401r;
    public final long f44402s;
    public final String f44403t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f44387a = str;
        this.f44388b = uri;
        this.f44389c = uri2;
        this.d = j10;
        this.e = j11;
        this.f44390f = j12;
        this.f44391g = j13;
        this.h = arrayList;
        this.f44392i = z10;
        this.f44393j = j14;
        this.f44394k = j15;
        this.f44395l = n0.u(arrayList2);
        this.f44396m = n0.u(arrayList3);
        this.f44397n = n0.A(new o70(15), arrayList4);
        this.f44398o = z11;
        this.f44399p = str2;
        this.f44400q = str3;
        this.f44401r = j16;
        this.f44402s = j17;
        this.f44403t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f44390f == hVar.f44390f && this.f44391g == hVar.f44391g && this.f44392i == hVar.f44392i && this.f44393j == hVar.f44393j && this.f44394k == hVar.f44394k && this.f44398o == hVar.f44398o && this.f44401r == hVar.f44401r && this.f44402s == hVar.f44402s && Objects.equals(this.f44387a, hVar.f44387a) && Objects.equals(this.f44388b, hVar.f44388b) && Objects.equals(this.f44389c, hVar.f44389c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f44395l, hVar.f44395l) && Objects.equals(this.f44396m, hVar.f44396m) && Objects.equals(this.f44397n, hVar.f44397n) && Objects.equals(this.f44399p, hVar.f44399p) && Objects.equals(this.f44400q, hVar.f44400q) && Objects.equals(this.f44403t, hVar.f44403t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44387a, this.f44388b, this.f44389c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f44390f), Long.valueOf(this.f44391g), this.h, Boolean.valueOf(this.f44392i), Long.valueOf(this.f44393j), Long.valueOf(this.f44394k), this.f44395l, this.f44396m, this.f44397n, Boolean.valueOf(this.f44398o), this.f44399p, this.f44400q, Long.valueOf(this.f44401r), Long.valueOf(this.f44402s), this.f44403t);
    }
}
