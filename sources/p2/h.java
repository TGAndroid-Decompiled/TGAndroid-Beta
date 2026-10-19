package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ig0;
import v7.u6;
public final class h {
    public final String f43958a;
    public final Uri f43959b;
    public final Uri f43960c;
    public final long d;
    public final long e;
    public final long f43961f;
    public final long f43962g;
    public final List h;
    public final boolean f43963i;
    public final long f43964j;
    public final long f43965k;
    public final n0 f43966l;
    public final n0 f43967m;
    public final x1 f43968n;
    public final boolean f43969o;
    public final String f43970p;
    public final String f43971q;
    public final long f43972r;
    public final long f43973s;
    public final String f43974t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43958a = str;
        this.f43959b = uri;
        this.f43960c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43961f = j12;
        this.f43962g = j13;
        this.h = arrayList;
        this.f43963i = z10;
        this.f43964j = j14;
        this.f43965k = j15;
        this.f43966l = n0.u(arrayList2);
        this.f43967m = n0.u(arrayList3);
        this.f43968n = n0.A(new ig0(14), arrayList4);
        this.f43969o = z11;
        this.f43970p = str2;
        this.f43971q = str3;
        this.f43972r = j16;
        this.f43973s = j17;
        this.f43974t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43961f == hVar.f43961f && this.f43962g == hVar.f43962g && this.f43963i == hVar.f43963i && this.f43964j == hVar.f43964j && this.f43965k == hVar.f43965k && this.f43969o == hVar.f43969o && this.f43972r == hVar.f43972r && this.f43973s == hVar.f43973s && Objects.equals(this.f43958a, hVar.f43958a) && Objects.equals(this.f43959b, hVar.f43959b) && Objects.equals(this.f43960c, hVar.f43960c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43966l, hVar.f43966l) && Objects.equals(this.f43967m, hVar.f43967m) && Objects.equals(this.f43968n, hVar.f43968n) && Objects.equals(this.f43970p, hVar.f43970p) && Objects.equals(this.f43971q, hVar.f43971q) && Objects.equals(this.f43974t, hVar.f43974t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43958a, this.f43959b, this.f43960c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43961f), Long.valueOf(this.f43962g), this.h, Boolean.valueOf(this.f43963i), Long.valueOf(this.f43964j), Long.valueOf(this.f43965k), this.f43966l, this.f43967m, this.f43968n, Boolean.valueOf(this.f43969o), this.f43970p, this.f43971q, Long.valueOf(this.f43972r), Long.valueOf(this.f43973s), this.f43974t);
    }
}
