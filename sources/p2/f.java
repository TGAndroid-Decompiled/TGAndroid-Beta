package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ob1;
public final class f {
    public final String f45089a;
    public final Uri f45090b;
    public final Uri f45091c;
    public final long d;
    public final long f45092e;
    public final long f45093f;
    public final long f45094g;
    public final List h;
    public final boolean f45095i;
    public final long f45096j;
    public final long f45097k;
    public final i0 f45098l;
    public final i0 f45099m;
    public final a1 f45100n;
    public final boolean f45101o;
    public final String f45102p;
    public final String f45103q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45089a = str;
        this.f45090b = uri;
        this.f45091c = uri2;
        this.d = j3;
        this.f45092e = j10;
        this.f45093f = j11;
        this.f45094g = j12;
        this.h = arrayList;
        this.f45095i = z10;
        this.f45096j = j13;
        this.f45097k = j14;
        this.f45098l = i0.v(arrayList2);
        this.f45099m = i0.v(arrayList3);
        this.f45100n = i0.B(new ob1(7), arrayList4);
        this.f45101o = z11;
        this.f45102p = str2;
        this.f45103q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f45092e == fVar.f45092e && this.f45093f == fVar.f45093f && this.f45094g == fVar.f45094g && this.f45095i == fVar.f45095i && this.f45096j == fVar.f45096j && this.f45097k == fVar.f45097k && this.f45101o == fVar.f45101o && Objects.equals(this.f45089a, fVar.f45089a) && Objects.equals(this.f45090b, fVar.f45090b) && Objects.equals(this.f45091c, fVar.f45091c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f45098l, fVar.f45098l) && Objects.equals(this.f45099m, fVar.f45099m) && Objects.equals(this.f45100n, fVar.f45100n) && Objects.equals(this.f45102p, fVar.f45102p) && Objects.equals(this.f45103q, fVar.f45103q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45089a, this.f45090b, this.f45091c, Long.valueOf(this.d), Long.valueOf(this.f45092e), Long.valueOf(this.f45093f), Long.valueOf(this.f45094g), this.h, Boolean.valueOf(this.f45095i), Long.valueOf(this.f45096j), Long.valueOf(this.f45097k), this.f45098l, this.f45099m, this.f45100n, Boolean.valueOf(this.f45101o), this.f45102p, this.f45103q);
    }
}
