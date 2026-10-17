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
    public final String f43986a;
    public final Uri f43987b;
    public final Uri f43988c;
    public final long d;
    public final long e;
    public final long f43989f;
    public final long f43990g;
    public final List h;
    public final boolean f43991i;
    public final long f43992j;
    public final long f43993k;
    public final n0 f43994l;
    public final n0 f43995m;
    public final x1 f43996n;
    public final boolean f43997o;
    public final String f43998p;
    public final String f43999q;
    public final long f44000r;
    public final long f44001s;
    public final String f44002t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43986a = str;
        this.f43987b = uri;
        this.f43988c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43989f = j12;
        this.f43990g = j13;
        this.h = arrayList;
        this.f43991i = z10;
        this.f43992j = j14;
        this.f43993k = j15;
        this.f43994l = n0.u(arrayList2);
        this.f43995m = n0.u(arrayList3);
        this.f43996n = n0.A(new lg0(14), arrayList4);
        this.f43997o = z11;
        this.f43998p = str2;
        this.f43999q = str3;
        this.f44000r = j16;
        this.f44001s = j17;
        this.f44002t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43989f == hVar.f43989f && this.f43990g == hVar.f43990g && this.f43991i == hVar.f43991i && this.f43992j == hVar.f43992j && this.f43993k == hVar.f43993k && this.f43997o == hVar.f43997o && this.f44000r == hVar.f44000r && this.f44001s == hVar.f44001s && Objects.equals(this.f43986a, hVar.f43986a) && Objects.equals(this.f43987b, hVar.f43987b) && Objects.equals(this.f43988c, hVar.f43988c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43994l, hVar.f43994l) && Objects.equals(this.f43995m, hVar.f43995m) && Objects.equals(this.f43996n, hVar.f43996n) && Objects.equals(this.f43998p, hVar.f43998p) && Objects.equals(this.f43999q, hVar.f43999q) && Objects.equals(this.f44002t, hVar.f44002t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43986a, this.f43987b, this.f43988c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43989f), Long.valueOf(this.f43990g), this.h, Boolean.valueOf(this.f43991i), Long.valueOf(this.f43992j), Long.valueOf(this.f43993k), this.f43994l, this.f43995m, this.f43996n, Boolean.valueOf(this.f43997o), this.f43998p, this.f43999q, Long.valueOf(this.f44000r), Long.valueOf(this.f44001s), this.f44002t);
    }
}
