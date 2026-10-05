package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.eb1;
public final class f {
    public final String f44035a;
    public final Uri f44036b;
    public final Uri f44037c;
    public final long d;
    public final long f44038e;
    public final long f44039f;
    public final long f44040g;
    public final List h;
    public final boolean f44041i;
    public final long f44042j;
    public final long f44043k;
    public final i0 f44044l;
    public final i0 f44045m;
    public final a1 f44046n;
    public final boolean f44047o;
    public final String f44048p;
    public final String f44049q;

    public f(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f44035a = str;
        this.f44036b = uri;
        this.f44037c = uri2;
        this.d = j3;
        this.f44038e = j10;
        this.f44039f = j11;
        this.f44040g = j12;
        this.h = arrayList;
        this.f44041i = z10;
        this.f44042j = j13;
        this.f44043k = j14;
        this.f44044l = i0.v(arrayList2);
        this.f44045m = i0.v(arrayList3);
        this.f44046n = i0.B(new eb1(5), arrayList4);
        this.f44047o = z11;
        this.f44048p = str2;
        this.f44049q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.d == fVar.d && this.f44038e == fVar.f44038e && this.f44039f == fVar.f44039f && this.f44040g == fVar.f44040g && this.f44041i == fVar.f44041i && this.f44042j == fVar.f44042j && this.f44043k == fVar.f44043k && this.f44047o == fVar.f44047o && Objects.equals(this.f44035a, fVar.f44035a) && Objects.equals(this.f44036b, fVar.f44036b) && Objects.equals(this.f44037c, fVar.f44037c) && Objects.equals(this.h, fVar.h) && Objects.equals(this.f44044l, fVar.f44044l) && Objects.equals(this.f44045m, fVar.f44045m) && Objects.equals(this.f44046n, fVar.f44046n) && Objects.equals(this.f44048p, fVar.f44048p) && Objects.equals(this.f44049q, fVar.f44049q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f44035a, this.f44036b, this.f44037c, Long.valueOf(this.d), Long.valueOf(this.f44038e), Long.valueOf(this.f44039f), Long.valueOf(this.f44040g), this.h, Boolean.valueOf(this.f44041i), Long.valueOf(this.f44042j), Long.valueOf(this.f44043k), this.f44044l, this.f44045m, this.f44046n, Boolean.valueOf(this.f44047o), this.f44048p, this.f44049q);
    }
}
