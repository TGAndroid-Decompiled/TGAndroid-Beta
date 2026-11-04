package r2;

import android.net.Uri;
import b8.zb;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.d80;
public final class g {
    public final String f54115a;
    public final Uri f54116b;
    public final Uri f54117c;
    public final long d;
    public final long f54118e;
    public final long f54119f;
    public final long f54120g;
    public final List h;
    public final boolean f54121i;
    public final long f54122j;
    public final long f54123k;
    public final i0 f54124l;
    public final i0 f54125m;
    public final s1 f54126n;
    public final boolean f54127o;
    public final String f54128p;
    public final String f54129q;
    public final long f54130r;
    public final long f54131s;
    public final String f54132t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        zb.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54115a = str;
        this.f54116b = uri;
        this.f54117c = uri2;
        this.d = j10;
        this.f54118e = j11;
        this.f54119f = j12;
        this.f54120g = j13;
        this.h = arrayList;
        this.f54121i = z10;
        this.f54122j = j14;
        this.f54123k = j15;
        this.f54124l = i0.q(arrayList2);
        this.f54125m = i0.q(arrayList3);
        this.f54126n = i0.w(new d80(29), arrayList4);
        this.f54127o = z11;
        this.f54128p = str2;
        this.f54129q = str3;
        this.f54130r = j16;
        this.f54131s = j17;
        this.f54132t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54118e == gVar.f54118e && this.f54119f == gVar.f54119f && this.f54120g == gVar.f54120g && this.f54121i == gVar.f54121i && this.f54122j == gVar.f54122j && this.f54123k == gVar.f54123k && this.f54127o == gVar.f54127o && this.f54130r == gVar.f54130r && this.f54131s == gVar.f54131s && Objects.equals(this.f54115a, gVar.f54115a) && Objects.equals(this.f54116b, gVar.f54116b) && Objects.equals(this.f54117c, gVar.f54117c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54124l, gVar.f54124l) && Objects.equals(this.f54125m, gVar.f54125m) && Objects.equals(this.f54126n, gVar.f54126n) && Objects.equals(this.f54128p, gVar.f54128p) && Objects.equals(this.f54129q, gVar.f54129q) && Objects.equals(this.f54132t, gVar.f54132t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54115a, this.f54116b, this.f54117c, Long.valueOf(this.d), Long.valueOf(this.f54118e), Long.valueOf(this.f54119f), Long.valueOf(this.f54120g), this.h, Boolean.valueOf(this.f54121i), Long.valueOf(this.f54122j), Long.valueOf(this.f54123k), this.f54124l, this.f54125m, this.f54126n, Boolean.valueOf(this.f54127o), this.f54128p, this.f54129q, Long.valueOf(this.f54130r), Long.valueOf(this.f54131s), this.f54132t);
    }
}
