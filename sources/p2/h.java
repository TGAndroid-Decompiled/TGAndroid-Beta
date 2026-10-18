package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.lg0;
import v7.u6;
public final class h {
    public final String f44006a;
    public final Uri f44007b;
    public final Uri f44008c;
    public final long d;
    public final long e;
    public final long f44009f;
    public final long f44010g;
    public final List h;
    public final boolean f44011i;
    public final long f44012j;
    public final long f44013k;
    public final n0 f44014l;
    public final n0 f44015m;
    public final x1 f44016n;
    public final boolean f44017o;
    public final String f44018p;
    public final String f44019q;
    public final long f44020r;
    public final long f44021s;
    public final String f44022t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f44006a = str;
        this.f44007b = uri;
        this.f44008c = uri2;
        this.d = j10;
        this.e = j11;
        this.f44009f = j12;
        this.f44010g = j13;
        this.h = arrayList;
        this.f44011i = z10;
        this.f44012j = j14;
        this.f44013k = j15;
        this.f44014l = n0.u(arrayList2);
        this.f44015m = n0.u(arrayList3);
        this.f44016n = n0.A(new lg0(14), arrayList4);
        this.f44017o = z11;
        this.f44018p = str2;
        this.f44019q = str3;
        this.f44020r = j16;
        this.f44021s = j17;
        this.f44022t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f44009f == hVar.f44009f && this.f44010g == hVar.f44010g && this.f44011i == hVar.f44011i && this.f44012j == hVar.f44012j && this.f44013k == hVar.f44013k && this.f44017o == hVar.f44017o && this.f44020r == hVar.f44020r && this.f44021s == hVar.f44021s && Objects.equals(this.f44006a, hVar.f44006a) && Objects.equals(this.f44007b, hVar.f44007b) && Objects.equals(this.f44008c, hVar.f44008c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f44014l, hVar.f44014l) && Objects.equals(this.f44015m, hVar.f44015m) && Objects.equals(this.f44016n, hVar.f44016n) && Objects.equals(this.f44018p, hVar.f44018p) && Objects.equals(this.f44019q, hVar.f44019q) && Objects.equals(this.f44022t, hVar.f44022t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44006a, this.f44007b, this.f44008c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f44009f), Long.valueOf(this.f44010g), this.h, Boolean.valueOf(this.f44011i), Long.valueOf(this.f44012j), Long.valueOf(this.f44013k), this.f44014l, this.f44015m, this.f44016n, Boolean.valueOf(this.f44017o), this.f44018p, this.f44019q, Long.valueOf(this.f44020r), Long.valueOf(this.f44021s), this.f44022t);
    }
}
