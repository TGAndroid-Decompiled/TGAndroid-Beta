package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.rv0;
public final class g {
    public final String f54533a;
    public final Uri f54534b;
    public final Uri f54535c;
    public final long d;
    public final long f54536e;
    public final long f54537f;
    public final long f54538g;
    public final List h;
    public final boolean f54539i;
    public final long f54540j;
    public final long f54541k;
    public final i0 f54542l;
    public final i0 f54543m;
    public final t1 f54544n;
    public final boolean f54545o;
    public final String f54546p;
    public final String f54547q;
    public final long f54548r;
    public final long f54549s;
    public final String f54550t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54533a = str;
        this.f54534b = uri;
        this.f54535c = uri2;
        this.d = j3;
        this.f54536e = j10;
        this.f54537f = j11;
        this.f54538g = j12;
        this.h = arrayList;
        this.f54539i = z9;
        this.f54540j = j13;
        this.f54541k = j14;
        this.f54542l = i0.q(arrayList2);
        this.f54543m = i0.q(arrayList3);
        this.f54544n = i0.w(new rv0(11), arrayList4);
        this.f54545o = z10;
        this.f54546p = str2;
        this.f54547q = str3;
        this.f54548r = j15;
        this.f54549s = j16;
        this.f54550t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54536e == gVar.f54536e && this.f54537f == gVar.f54537f && this.f54538g == gVar.f54538g && this.f54539i == gVar.f54539i && this.f54540j == gVar.f54540j && this.f54541k == gVar.f54541k && this.f54545o == gVar.f54545o && this.f54548r == gVar.f54548r && this.f54549s == gVar.f54549s && Objects.equals(this.f54533a, gVar.f54533a) && Objects.equals(this.f54534b, gVar.f54534b) && Objects.equals(this.f54535c, gVar.f54535c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54542l, gVar.f54542l) && Objects.equals(this.f54543m, gVar.f54543m) && Objects.equals(this.f54544n, gVar.f54544n) && Objects.equals(this.f54546p, gVar.f54546p) && Objects.equals(this.f54547q, gVar.f54547q) && Objects.equals(this.f54550t, gVar.f54550t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54533a, this.f54534b, this.f54535c, Long.valueOf(this.d), Long.valueOf(this.f54536e), Long.valueOf(this.f54537f), Long.valueOf(this.f54538g), this.h, Boolean.valueOf(this.f54539i), Long.valueOf(this.f54540j), Long.valueOf(this.f54541k), this.f54542l, this.f54543m, this.f54544n, Boolean.valueOf(this.f54545o), this.f54546p, this.f54547q, Long.valueOf(this.f54548r), Long.valueOf(this.f54549s), this.f54550t);
    }
}
