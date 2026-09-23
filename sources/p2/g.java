package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.cb1;
public final class g {
    public final String f40385a;
    public final Uri f40386b;
    public final Uri f40387c;
    public final long d;
    public final long e;
    public final long f40388f;
    public final long f40389g;
    public final List h;
    public final boolean f40390i;
    public final long f40391j;
    public final long f40392k;
    public final i0 f40393l;
    public final i0 f40394m;
    public final a1 f40395n;
    public final boolean f40396o;
    public final String f40397p;
    public final String f40398q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f40385a = str;
        this.f40386b = uri;
        this.f40387c = uri2;
        this.d = j3;
        this.e = j10;
        this.f40388f = j11;
        this.f40389g = j12;
        this.h = arrayList;
        this.f40390i = z10;
        this.f40391j = j13;
        this.f40392k = j14;
        this.f40393l = i0.v(arrayList2);
        this.f40394m = i0.v(arrayList3);
        this.f40395n = i0.B(new cb1(5), arrayList4);
        this.f40396o = z11;
        this.f40397p = str2;
        this.f40398q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.e == gVar.e && this.f40388f == gVar.f40388f && this.f40389g == gVar.f40389g && this.f40390i == gVar.f40390i && this.f40391j == gVar.f40391j && this.f40392k == gVar.f40392k && this.f40396o == gVar.f40396o && Objects.equals(this.f40385a, gVar.f40385a) && Objects.equals(this.f40386b, gVar.f40386b) && Objects.equals(this.f40387c, gVar.f40387c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f40393l, gVar.f40393l) && Objects.equals(this.f40394m, gVar.f40394m) && Objects.equals(this.f40395n, gVar.f40395n) && Objects.equals(this.f40397p, gVar.f40397p) && Objects.equals(this.f40398q, gVar.f40398q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f40385a, this.f40386b, this.f40387c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f40388f), Long.valueOf(this.f40389g), this.h, Boolean.valueOf(this.f40390i), Long.valueOf(this.f40391j), Long.valueOf(this.f40392k), this.f40393l, this.f40394m, this.f40395n, Boolean.valueOf(this.f40396o), this.f40397p, this.f40398q);
    }
}
