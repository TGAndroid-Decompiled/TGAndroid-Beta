package p2;

import android.net.Uri;
import e9.a1;
import e9.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ob1;
public final class g {
    public final String f45084a;
    public final Uri f45085b;
    public final Uri f45086c;
    public final long d;
    public final long f45087e;
    public final long f45088f;
    public final long f45089g;
    public final List h;
    public final boolean f45090i;
    public final long f45091j;
    public final long f45092k;
    public final i0 f45093l;
    public final i0 f45094m;
    public final a1 f45095n;
    public final boolean f45096o;
    public final String f45097p;
    public final String f45098q;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z10, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z11, String str2, String str3) {
        boolean z12;
        if ((uri != null && uri2 != null) || (uri == null && uri2 == null)) {
            z12 = false;
        } else {
            z12 = true;
        }
        e2.d.b(z12);
        this.f45084a = str;
        this.f45085b = uri;
        this.f45086c = uri2;
        this.d = j3;
        this.f45087e = j10;
        this.f45088f = j11;
        this.f45089g = j12;
        this.h = arrayList;
        this.f45090i = z10;
        this.f45091j = j13;
        this.f45092k = j14;
        this.f45093l = i0.v(arrayList2);
        this.f45094m = i0.v(arrayList3);
        this.f45095n = i0.B(new ob1(7), arrayList4);
        this.f45096o = z11;
        this.f45097p = str2;
        this.f45098q = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f45087e == gVar.f45087e && this.f45088f == gVar.f45088f && this.f45089g == gVar.f45089g && this.f45090i == gVar.f45090i && this.f45091j == gVar.f45091j && this.f45092k == gVar.f45092k && this.f45096o == gVar.f45096o && Objects.equals(this.f45084a, gVar.f45084a) && Objects.equals(this.f45085b, gVar.f45085b) && Objects.equals(this.f45086c, gVar.f45086c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f45093l, gVar.f45093l) && Objects.equals(this.f45094m, gVar.f45094m) && Objects.equals(this.f45095n, gVar.f45095n) && Objects.equals(this.f45097p, gVar.f45097p) && Objects.equals(this.f45098q, gVar.f45098q)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f45084a, this.f45085b, this.f45086c, Long.valueOf(this.d), Long.valueOf(this.f45087e), Long.valueOf(this.f45088f), Long.valueOf(this.f45089g), this.h, Boolean.valueOf(this.f45090i), Long.valueOf(this.f45091j), Long.valueOf(this.f45092k), this.f45093l, this.f45094m, this.f45095n, Boolean.valueOf(this.f45096o), this.f45097p, this.f45098q);
    }
}
