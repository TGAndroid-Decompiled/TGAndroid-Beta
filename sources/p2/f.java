package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.m9;
public final class f {
    public final String f39559a;
    public final Uri f39560b;
    public final Uri f39561c;
    public final long d;
    public final long e;
    public final long f39562f;
    public final long f39563g;
    public final List h;
    public final boolean f39564i;
    public final long f39565j;
    public final long f39566k;
    public final i0 f39567l;
    public final i0 f39568m;
    public final a1 f39569n;
    public final boolean f39570o;
    public final String f39571p;
    public final String f39572q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f39559a = str;
        this.f39560b = uri;
        this.f39561c = uri2;
        this.d = j3;
        this.e = j10;
        this.f39562f = j11;
        this.f39563g = j12;
        this.h = arrayList;
        this.f39564i = z10;
        this.f39565j = j13;
        this.f39566k = j14;
        this.f39567l = i0.v(arrayList2);
        this.f39568m = i0.v(arrayList3);
        this.f39569n = i0.B(new m9(28), arrayList4);
        this.f39570o = z11;
        this.f39571p = str2;
        this.f39572q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.e == fVar.e && this.f39562f == fVar.f39562f && this.f39563g == fVar.f39563g && this.f39564i == fVar.f39564i && this.f39565j == fVar.f39565j && this.f39566k == fVar.f39566k && this.f39570o == fVar.f39570o && Objects.equals(this.f39559a, fVar.f39559a) && Objects.equals(this.f39560b, fVar.f39560b) && Objects.equals(this.f39561c, fVar.f39561c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f39567l, fVar.f39567l) && Objects.equals(this.f39568m, fVar.f39568m) && Objects.equals(this.f39569n, fVar.f39569n) && Objects.equals(this.f39571p, fVar.f39571p) && Objects.equals(this.f39572q, fVar.f39572q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f39559a, this.f39560b, this.f39561c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f39562f), Long.valueOf(this.f39563g), this.h, Boolean.valueOf(this.f39564i), Long.valueOf(this.f39565j), Long.valueOf(this.f39566k), this.f39567l, this.f39568m, this.f39569n, Boolean.valueOf(this.f39570o), this.f39571p, this.f39572q);
    }
}
