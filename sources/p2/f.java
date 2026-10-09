package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.mb1;
public final class f {
    public final String f45199a;
    public final Uri f45200b;
    public final Uri f45201c;
    public final long d;
    public final long f45202e;
    public final long f45203f;
    public final long f45204g;
    public final List h;
    public final boolean f45205i;
    public final long f45206j;
    public final long f45207k;
    public final i0 f45208l;
    public final i0 f45209m;
    public final a1 f45210n;
    public final boolean f45211o;
    public final String f45212p;
    public final String f45213q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45199a = str;
        this.f45200b = uri;
        this.f45201c = uri2;
        this.d = j3;
        this.f45202e = j10;
        this.f45203f = j11;
        this.f45204g = j12;
        this.h = arrayList;
        this.f45205i = z10;
        this.f45206j = j13;
        this.f45207k = j14;
        this.f45208l = i0.v(arrayList2);
        this.f45209m = i0.v(arrayList3);
        this.f45210n = i0.B(new mb1(7), arrayList4);
        this.f45211o = z11;
        this.f45212p = str2;
        this.f45213q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45202e == fVar.f45202e && this.f45203f == fVar.f45203f && this.f45204g == fVar.f45204g && this.f45205i == fVar.f45205i && this.f45206j == fVar.f45206j && this.f45207k == fVar.f45207k && this.f45211o == fVar.f45211o && Objects.equals(this.f45199a, fVar.f45199a) && Objects.equals(this.f45200b, fVar.f45200b) && Objects.equals(this.f45201c, fVar.f45201c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45208l, fVar.f45208l) && Objects.equals(this.f45209m, fVar.f45209m) && Objects.equals(this.f45210n, fVar.f45210n) && Objects.equals(this.f45212p, fVar.f45212p) && Objects.equals(this.f45213q, fVar.f45213q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45199a, this.f45200b, this.f45201c, Long.valueOf(this.d), Long.valueOf(this.f45202e), Long.valueOf(this.f45203f), Long.valueOf(this.f45204g), this.h, Boolean.valueOf(this.f45205i), Long.valueOf(this.f45206j), Long.valueOf(this.f45207k), this.f45208l, this.f45209m, this.f45210n, Boolean.valueOf(this.f45211o), this.f45212p, this.f45213q);
    }
}
