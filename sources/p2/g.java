package p2;

import android.net.Uri;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.es0;
import v7.u6;
public final class g {
    public final String f42876a;
    public final Uri f42877b;
    public final Uri f42878c;
    public final long d;
    public final long e;
    public final long f42879f;
    public final long f42880g;
    public final List h;
    public final boolean f42881i;
    public final long f42882j;
    public final long f42883k;
    public final n0 f42884l;
    public final n0 f42885m;
    public final x1 f42886n;
    public final boolean f42887o;
    public final String f42888p;
    public final String f42889q;
    public final long f42890r;
    public final long f42891s;
    public final String f42892t;

    public g(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f42876a = str;
        this.f42877b = uri;
        this.f42878c = uri2;
        this.d = j10;
        this.e = j11;
        this.f42879f = j12;
        this.f42880g = j13;
        this.h = arrayList;
        this.f42881i = z10;
        this.f42882j = j14;
        this.f42883k = j15;
        this.f42884l = n0.u(arrayList2);
        this.f42885m = n0.u(arrayList3);
        this.f42886n = n0.A(new es0(11), arrayList4);
        this.f42887o = z11;
        this.f42888p = str2;
        this.f42889q = str3;
        this.f42890r = j16;
        this.f42891s = j17;
        this.f42892t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f42879f == gVar.f42879f && this.f42880g == gVar.f42880g && this.f42881i == gVar.f42881i && this.f42882j == gVar.f42882j && this.f42883k == gVar.f42883k && this.f42887o == gVar.f42887o && this.f42890r == gVar.f42890r && this.f42891s == gVar.f42891s && Objects.equals(this.f42876a, gVar.f42876a) && Objects.equals(this.f42877b, gVar.f42877b) && Objects.equals(this.f42878c, gVar.f42878c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f42884l, gVar.f42884l) && Objects.equals(this.f42885m, gVar.f42885m) && Objects.equals(this.f42886n, gVar.f42886n) && Objects.equals(this.f42888p, gVar.f42888p) && Objects.equals(this.f42889q, gVar.f42889q) && Objects.equals(this.f42892t, gVar.f42892t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f42876a, this.f42877b, this.f42878c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f42879f), Long.valueOf(this.f42880g), this.h, Boolean.valueOf(this.f42881i), Long.valueOf(this.f42882j), Long.valueOf(this.f42883k), this.f42884l, this.f42885m, this.f42886n, Boolean.valueOf(this.f42887o), this.f42888p, this.f42889q, Long.valueOf(this.f42890r), Long.valueOf(this.f42891s), this.f42892t);
    }
}
