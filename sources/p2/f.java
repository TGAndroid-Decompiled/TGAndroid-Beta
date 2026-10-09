package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.mb1;
public final class f {
    public final String f45201a;
    public final Uri f45202b;
    public final Uri f45203c;
    public final long d;
    public final long f45204e;
    public final long f45205f;
    public final long f45206g;
    public final List h;
    public final boolean f45207i;
    public final long f45208j;
    public final long f45209k;
    public final i0 f45210l;
    public final i0 f45211m;
    public final a1 f45212n;
    public final boolean f45213o;
    public final String f45214p;
    public final String f45215q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45201a = str;
        this.f45202b = uri;
        this.f45203c = uri2;
        this.d = j3;
        this.f45204e = j10;
        this.f45205f = j11;
        this.f45206g = j12;
        this.h = arrayList;
        this.f45207i = z10;
        this.f45208j = j13;
        this.f45209k = j14;
        this.f45210l = i0.v(arrayList2);
        this.f45211m = i0.v(arrayList3);
        this.f45212n = i0.B(new mb1(7), arrayList4);
        this.f45213o = z11;
        this.f45214p = str2;
        this.f45215q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45204e == fVar.f45204e && this.f45205f == fVar.f45205f && this.f45206g == fVar.f45206g && this.f45207i == fVar.f45207i && this.f45208j == fVar.f45208j && this.f45209k == fVar.f45209k && this.f45213o == fVar.f45213o && Objects.equals(this.f45201a, fVar.f45201a) && Objects.equals(this.f45202b, fVar.f45202b) && Objects.equals(this.f45203c, fVar.f45203c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45210l, fVar.f45210l) && Objects.equals(this.f45211m, fVar.f45211m) && Objects.equals(this.f45212n, fVar.f45212n) && Objects.equals(this.f45214p, fVar.f45214p) && Objects.equals(this.f45215q, fVar.f45215q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45201a, this.f45202b, this.f45203c, Long.valueOf(this.d), Long.valueOf(this.f45204e), Long.valueOf(this.f45205f), Long.valueOf(this.f45206g), this.h, Boolean.valueOf(this.f45207i), Long.valueOf(this.f45208j), Long.valueOf(this.f45209k), this.f45210l, this.f45211m, this.f45212n, Boolean.valueOf(this.f45213o), this.f45214p, this.f45215q);
    }
}
