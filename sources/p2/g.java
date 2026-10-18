package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.kg0;
import v7.u6;
public final class g {
    public final String f43963a;
    public final Uri f43964b;
    public final Uri f43965c;
    public final long d;
    public final long e;
    public final long f43966f;
    public final long f43967g;
    public final List h;
    public final boolean f43968i;
    public final long f43969j;
    public final long f43970k;
    public final n0 f43971l;
    public final n0 f43972m;
    public final x1 f43973n;
    public final boolean f43974o;
    public final String f43975p;
    public final String f43976q;
    public final long f43977r;
    public final long f43978s;
    public final String f43979t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43963a = str;
        this.f43964b = uri;
        this.f43965c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43966f = j12;
        this.f43967g = j13;
        this.h = arrayList;
        this.f43968i = z10;
        this.f43969j = j14;
        this.f43970k = j15;
        this.f43971l = n0.u(arrayList2);
        this.f43972m = n0.u(arrayList3);
        this.f43973n = n0.A(new kg0(14), arrayList4);
        this.f43974o = z11;
        this.f43975p = str2;
        this.f43976q = str3;
        this.f43977r = j16;
        this.f43978s = j17;
        this.f43979t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f43966f == gVar.f43966f && this.f43967g == gVar.f43967g && this.f43968i == gVar.f43968i && this.f43969j == gVar.f43969j && this.f43970k == gVar.f43970k && this.f43974o == gVar.f43974o && this.f43977r == gVar.f43977r && this.f43978s == gVar.f43978s && Objects.equals(this.f43963a, gVar.f43963a) && Objects.equals(this.f43964b, gVar.f43964b) && Objects.equals(this.f43965c, gVar.f43965c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f43971l, gVar.f43971l) && Objects.equals(this.f43972m, gVar.f43972m) && Objects.equals(this.f43973n, gVar.f43973n) && Objects.equals(this.f43975p, gVar.f43975p) && Objects.equals(this.f43976q, gVar.f43976q) && Objects.equals(this.f43979t, gVar.f43979t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43963a, this.f43964b, this.f43965c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43966f), Long.valueOf(this.f43967g), this.h, Boolean.valueOf(this.f43968i), Long.valueOf(this.f43969j), Long.valueOf(this.f43970k), this.f43971l, this.f43972m, this.f43973n, Boolean.valueOf(this.f43974o), this.f43975p, this.f43976q, Long.valueOf(this.f43977r), Long.valueOf(this.f43978s), this.f43979t);
    }
}
