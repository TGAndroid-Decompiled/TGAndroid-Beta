package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.gb1;
public final class f {
    public final String f44020a;
    public final Uri f44021b;
    public final Uri f44022c;
    public final long d;
    public final long f44023e;
    public final long f44024f;
    public final long f44025g;
    public final List h;
    public final boolean f44026i;
    public final long f44027j;
    public final long f44028k;
    public final i0 f44029l;
    public final i0 f44030m;
    public final a1 f44031n;
    public final boolean f44032o;
    public final String f44033p;
    public final String f44034q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f44020a = str;
        this.f44021b = uri;
        this.f44022c = uri2;
        this.d = j3;
        this.f44023e = j10;
        this.f44024f = j11;
        this.f44025g = j12;
        this.h = arrayList;
        this.f44026i = z10;
        this.f44027j = j13;
        this.f44028k = j14;
        this.f44029l = i0.v(arrayList2);
        this.f44030m = i0.v(arrayList3);
        this.f44031n = i0.B(new gb1(5), arrayList4);
        this.f44032o = z11;
        this.f44033p = str2;
        this.f44034q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f44023e == fVar.f44023e && this.f44024f == fVar.f44024f && this.f44025g == fVar.f44025g && this.f44026i == fVar.f44026i && this.f44027j == fVar.f44027j && this.f44028k == fVar.f44028k && this.f44032o == fVar.f44032o && Objects.equals(this.f44020a, fVar.f44020a) && Objects.equals(this.f44021b, fVar.f44021b) && Objects.equals(this.f44022c, fVar.f44022c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f44029l, fVar.f44029l) && Objects.equals(this.f44030m, fVar.f44030m) && Objects.equals(this.f44031n, fVar.f44031n) && Objects.equals(this.f44033p, fVar.f44033p) && Objects.equals(this.f44034q, fVar.f44034q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44020a, this.f44021b, this.f44022c, Long.valueOf(this.d), Long.valueOf(this.f44023e), Long.valueOf(this.f44024f), Long.valueOf(this.f44025g), this.h, Boolean.valueOf(this.f44026i), Long.valueOf(this.f44027j), Long.valueOf(this.f44028k), this.f44029l, this.f44030m, this.f44031n, Boolean.valueOf(this.f44032o), this.f44033p, this.f44034q);
    }
}
