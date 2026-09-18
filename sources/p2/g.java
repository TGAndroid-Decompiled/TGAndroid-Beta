package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.lb1;
public final class g {
    public final String f40461a;
    public final Uri f40462b;
    public final Uri f40463c;
    public final long d;
    public final long e;
    public final long f40464f;
    public final long f40465g;
    public final List h;
    public final boolean f40466i;
    public final long f40467j;
    public final long f40468k;
    public final i0 f40469l;
    public final i0 f40470m;
    public final a1 f40471n;
    public final boolean f40472o;
    public final String f40473p;
    public final String f40474q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40461a = str;
        this.f40462b = uri;
        this.f40463c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40464f = j11;
        this.f40465g = j12;
        this.h = arrayList;
        this.f40466i = z10;
        this.f40467j = j13;
        this.f40468k = j14;
        this.f40469l = i0.v(arrayList2);
        this.f40470m = i0.v(arrayList3);
        this.f40471n = i0.B(new lb1(5), arrayList4);
        this.f40472o = z11;
        this.f40473p = str2;
        this.f40474q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f40464f == gVar.f40464f && this.f40465g == gVar.f40465g && this.f40466i == gVar.f40466i && this.f40467j == gVar.f40467j && this.f40468k == gVar.f40468k && this.f40472o == gVar.f40472o && Objects.equals(this.f40461a, gVar.f40461a) && Objects.equals(this.f40462b, gVar.f40462b) && Objects.equals(this.f40463c, gVar.f40463c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f40469l, gVar.f40469l) && Objects.equals(this.f40470m, gVar.f40470m) && Objects.equals(this.f40471n, gVar.f40471n) && Objects.equals(this.f40473p, gVar.f40473p) && Objects.equals(this.f40474q, gVar.f40474q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40461a, this.f40462b, this.f40463c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40464f), Long.valueOf(this.f40465g), this.h, Boolean.valueOf(this.f40466i), Long.valueOf(this.f40467j), Long.valueOf(this.f40468k), this.f40469l, this.f40470m, this.f40471n, Boolean.valueOf(this.f40472o), this.f40473p, this.f40474q);
    }
}
