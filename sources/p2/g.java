package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.lb1;
public final class g {
    public final String f40456a;
    public final Uri f40457b;
    public final Uri f40458c;
    public final long d;
    public final long e;
    public final long f40459f;
    public final long f40460g;
    public final List h;
    public final boolean f40461i;
    public final long f40462j;
    public final long f40463k;
    public final i0 f40464l;
    public final i0 f40465m;
    public final a1 f40466n;
    public final boolean f40467o;
    public final String f40468p;
    public final String f40469q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40456a = str;
        this.f40457b = uri;
        this.f40458c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40459f = j11;
        this.f40460g = j12;
        this.h = arrayList;
        this.f40461i = z10;
        this.f40462j = j13;
        this.f40463k = j14;
        this.f40464l = i0.v(arrayList2);
        this.f40465m = i0.v(arrayList3);
        this.f40466n = i0.B(new lb1(5), arrayList4);
        this.f40467o = z11;
        this.f40468p = str2;
        this.f40469q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f40459f == gVar.f40459f && this.f40460g == gVar.f40460g && this.f40461i == gVar.f40461i && this.f40462j == gVar.f40462j && this.f40463k == gVar.f40463k && this.f40467o == gVar.f40467o && Objects.equals(this.f40456a, gVar.f40456a) && Objects.equals(this.f40457b, gVar.f40457b) && Objects.equals(this.f40458c, gVar.f40458c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f40464l, gVar.f40464l) && Objects.equals(this.f40465m, gVar.f40465m) && Objects.equals(this.f40466n, gVar.f40466n) && Objects.equals(this.f40468p, gVar.f40468p) && Objects.equals(this.f40469q, gVar.f40469q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40456a, this.f40457b, this.f40458c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40459f), Long.valueOf(this.f40460g), this.h, Boolean.valueOf(this.f40461i), Long.valueOf(this.f40462j), Long.valueOf(this.f40463k), this.f40464l, this.f40465m, this.f40466n, Boolean.valueOf(this.f40467o), this.f40468p, this.f40469q);
    }
}
