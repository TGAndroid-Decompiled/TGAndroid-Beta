package s2;

import a8.ja;
import android.net.Uri;
import h9.i0;
import h9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.qv0;
public final class g {
    public final String f56215a;
    public final Uri f56216b;
    public final Uri f56217c;
    public final long d;
    public final long f56218e;
    public final long f56219f;
    public final long f56220g;
    public final List h;
    public final boolean f56221i;
    public final long f56222j;
    public final long f56223k;
    public final i0 f56224l;
    public final i0 f56225m;
    public final s1 f56226n;
    public final boolean f56227o;
    public final String f56228p;
    public final String f56229q;
    public final long f56230r;
    public final long f56231s;
    public final String f56232t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j15, long j16, String str4) {
        ja.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f56215a = str;
        this.f56216b = uri;
        this.f56217c = uri2;
        this.d = j3;
        this.f56218e = j10;
        this.f56219f = j11;
        this.f56220g = j12;
        this.h = arrayList;
        this.f56221i = z10;
        this.f56222j = j13;
        this.f56223k = j14;
        this.f56224l = i0.q(arrayList2);
        this.f56225m = i0.q(arrayList3);
        this.f56226n = i0.w(new qv0(12), arrayList4);
        this.f56227o = z11;
        this.f56228p = str2;
        this.f56229q = str3;
        this.f56230r = j15;
        this.f56231s = j16;
        this.f56232t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f56218e == gVar.f56218e && this.f56219f == gVar.f56219f && this.f56220g == gVar.f56220g && this.f56221i == gVar.f56221i && this.f56222j == gVar.f56222j && this.f56223k == gVar.f56223k && this.f56227o == gVar.f56227o && this.f56230r == gVar.f56230r && this.f56231s == gVar.f56231s && Objects.equals(this.f56215a, gVar.f56215a) && Objects.equals(this.f56216b, gVar.f56216b) && Objects.equals(this.f56217c, gVar.f56217c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f56224l, gVar.f56224l) && Objects.equals(this.f56225m, gVar.f56225m) && Objects.equals(this.f56226n, gVar.f56226n) && Objects.equals(this.f56228p, gVar.f56228p) && Objects.equals(this.f56229q, gVar.f56229q) && Objects.equals(this.f56232t, gVar.f56232t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f56215a, this.f56216b, this.f56217c, Long.valueOf(this.d), Long.valueOf(this.f56218e), Long.valueOf(this.f56219f), Long.valueOf(this.f56220g), this.h, Boolean.valueOf(this.f56221i), Long.valueOf(this.f56222j), Long.valueOf(this.f56223k), this.f56224l, this.f56225m, this.f56226n, Boolean.valueOf(this.f56227o), this.f56228p, this.f56229q, Long.valueOf(this.f56230r), Long.valueOf(this.f56231s), this.f56232t);
    }
}
