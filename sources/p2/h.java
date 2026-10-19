package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.jg0;
import v7.u6;
public final class h {
    public final String f43960a;
    public final Uri f43961b;
    public final Uri f43962c;
    public final long d;
    public final long e;
    public final long f43963f;
    public final long f43964g;
    public final List h;
    public final boolean f43965i;
    public final long f43966j;
    public final long f43967k;
    public final n0 f43968l;
    public final n0 f43969m;
    public final x1 f43970n;
    public final boolean f43971o;
    public final String f43972p;
    public final String f43973q;
    public final long f43974r;
    public final long f43975s;
    public final String f43976t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43960a = str;
        this.f43961b = uri;
        this.f43962c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43963f = j12;
        this.f43964g = j13;
        this.h = arrayList;
        this.f43965i = z10;
        this.f43966j = j14;
        this.f43967k = j15;
        this.f43968l = n0.u(arrayList2);
        this.f43969m = n0.u(arrayList3);
        this.f43970n = n0.A(new jg0(14), arrayList4);
        this.f43971o = z11;
        this.f43972p = str2;
        this.f43973q = str3;
        this.f43974r = j16;
        this.f43975s = j17;
        this.f43976t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43963f == hVar.f43963f && this.f43964g == hVar.f43964g && this.f43965i == hVar.f43965i && this.f43966j == hVar.f43966j && this.f43967k == hVar.f43967k && this.f43971o == hVar.f43971o && this.f43974r == hVar.f43974r && this.f43975s == hVar.f43975s && Objects.equals(this.f43960a, hVar.f43960a) && Objects.equals(this.f43961b, hVar.f43961b) && Objects.equals(this.f43962c, hVar.f43962c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43968l, hVar.f43968l) && Objects.equals(this.f43969m, hVar.f43969m) && Objects.equals(this.f43970n, hVar.f43970n) && Objects.equals(this.f43972p, hVar.f43972p) && Objects.equals(this.f43973q, hVar.f43973q) && Objects.equals(this.f43976t, hVar.f43976t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43960a, this.f43961b, this.f43962c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43963f), Long.valueOf(this.f43964g), this.h, Boolean.valueOf(this.f43965i), Long.valueOf(this.f43966j), Long.valueOf(this.f43967k), this.f43968l, this.f43969m, this.f43970n, Boolean.valueOf(this.f43971o), this.f43972p, this.f43973q, Long.valueOf(this.f43974r), Long.valueOf(this.f43975s), this.f43976t);
    }
}
