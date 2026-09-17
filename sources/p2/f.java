package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.f11;
public final class f {
    public final String f43707a;
    public final Uri f43708b;
    public final Uri f43709c;
    public final long d;
    public final long f43710e;
    public final long f43711f;
    public final long f43712g;
    public final List h;
    public final boolean f43713i;
    public final long f43714j;
    public final long f43715k;
    public final i0 f43716l;
    public final i0 f43717m;
    public final a1 f43718n;
    public final boolean f43719o;
    public final String f43720p;
    public final String f43721q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f43707a = str;
        this.f43708b = uri;
        this.f43709c = uri2;
        this.d = j3;
        this.f43710e = j10;
        this.f43711f = j11;
        this.f43712g = j12;
        this.h = arrayList;
        this.f43713i = z10;
        this.f43714j = j13;
        this.f43715k = j14;
        this.f43716l = i0.v(arrayList2);
        this.f43717m = i0.v(arrayList3);
        this.f43718n = i0.B(new f11(7), arrayList4);
        this.f43719o = z11;
        this.f43720p = str2;
        this.f43721q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f43710e == fVar.f43710e && this.f43711f == fVar.f43711f && this.f43712g == fVar.f43712g && this.f43713i == fVar.f43713i && this.f43714j == fVar.f43714j && this.f43715k == fVar.f43715k && this.f43719o == fVar.f43719o && Objects.equals(this.f43707a, fVar.f43707a) && Objects.equals(this.f43708b, fVar.f43708b) && Objects.equals(this.f43709c, fVar.f43709c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f43716l, fVar.f43716l) && Objects.equals(this.f43717m, fVar.f43717m) && Objects.equals(this.f43718n, fVar.f43718n) && Objects.equals(this.f43720p, fVar.f43720p) && Objects.equals(this.f43721q, fVar.f43721q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43707a, this.f43708b, this.f43709c, Long.valueOf(this.d), Long.valueOf(this.f43710e), Long.valueOf(this.f43711f), Long.valueOf(this.f43712g), this.h, Boolean.valueOf(this.f43713i), Long.valueOf(this.f43714j), Long.valueOf(this.f43715k), this.f43716l, this.f43717m, this.f43718n, Boolean.valueOf(this.f43719o), this.f43720p, this.f43721q);
    }
}
