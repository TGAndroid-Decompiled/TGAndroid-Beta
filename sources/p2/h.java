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
    public final String f43968a;
    public final Uri f43969b;
    public final Uri f43970c;
    public final long d;
    public final long e;
    public final long f43971f;
    public final long f43972g;
    public final List h;
    public final boolean f43973i;
    public final long f43974j;
    public final long f43975k;
    public final n0 f43976l;
    public final n0 f43977m;
    public final x1 f43978n;
    public final boolean f43979o;
    public final String f43980p;
    public final String f43981q;
    public final long f43982r;
    public final long f43983s;
    public final String f43984t;

    public h(String str, Uri uri, Uri uri2, long j10, long j11, long j12, long j13, ArrayList arrayList, boolean z10, long j14, long j15, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3, long j16, long j17, String str4) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        u6.g(z12);
        this.f43968a = str;
        this.f43969b = uri;
        this.f43970c = uri2;
        this.d = j10;
        this.e = j11;
        this.f43971f = j12;
        this.f43972g = j13;
        this.h = arrayList;
        this.f43973i = z10;
        this.f43974j = j14;
        this.f43975k = j15;
        this.f43976l = n0.u(arrayList2);
        this.f43977m = n0.u(arrayList3);
        this.f43978n = n0.A(new jg0(14), arrayList4);
        this.f43979o = z11;
        this.f43980p = str2;
        this.f43981q = str3;
        this.f43982r = j16;
        this.f43983s = j17;
        this.f43984t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.d == hVar.d && this.e == hVar.e && this.f43971f == hVar.f43971f && this.f43972g == hVar.f43972g && this.f43973i == hVar.f43973i && this.f43974j == hVar.f43974j && this.f43975k == hVar.f43975k && this.f43979o == hVar.f43979o && this.f43982r == hVar.f43982r && this.f43983s == hVar.f43983s && Objects.equals(this.f43968a, hVar.f43968a) && Objects.equals(this.f43969b, hVar.f43969b) && Objects.equals(this.f43970c, hVar.f43970c) && Objects.equals(this.h, hVar.h) && Objects.equals(this.f43976l, hVar.f43976l) && Objects.equals(this.f43977m, hVar.f43977m) && Objects.equals(this.f43978n, hVar.f43978n) && Objects.equals(this.f43980p, hVar.f43980p) && Objects.equals(this.f43981q, hVar.f43981q) && Objects.equals(this.f43984t, hVar.f43984t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f43968a, this.f43969b, this.f43970c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f43971f), Long.valueOf(this.f43972g), this.h, Boolean.valueOf(this.f43973i), Long.valueOf(this.f43974j), Long.valueOf(this.f43975k), this.f43976l, this.f43977m, this.f43978n, Boolean.valueOf(this.f43979o), this.f43980p, this.f43981q, Long.valueOf(this.f43982r), Long.valueOf(this.f43983s), this.f43984t);
    }
}
