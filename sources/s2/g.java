package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.wn0;
public final class g {
    public final String f54662a;
    public final Uri f54663b;
    public final Uri f54664c;
    public final long d;
    public final long f54665e;
    public final long f54666f;
    public final long f54667g;
    public final List h;
    public final boolean f54668i;
    public final long f54669j;
    public final long f54670k;
    public final i0 f54671l;
    public final i0 f54672m;
    public final t1 f54673n;
    public final boolean f54674o;
    public final String f54675p;
    public final String f54676q;
    public final long f54677r;
    public final long f54678s;
    public final String f54679t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54662a = str;
        this.f54663b = uri;
        this.f54664c = uri2;
        this.d = j3;
        this.f54665e = j10;
        this.f54666f = j11;
        this.f54667g = j12;
        this.h = arrayList;
        this.f54668i = z9;
        this.f54669j = j13;
        this.f54670k = j14;
        this.f54671l = i0.q(arrayList2);
        this.f54672m = i0.q(arrayList3);
        this.f54673n = i0.w(new wn0(12), arrayList4);
        this.f54674o = z10;
        this.f54675p = str2;
        this.f54676q = str3;
        this.f54677r = j15;
        this.f54678s = j16;
        this.f54679t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54665e == gVar.f54665e && this.f54666f == gVar.f54666f && this.f54667g == gVar.f54667g && this.f54668i == gVar.f54668i && this.f54669j == gVar.f54669j && this.f54670k == gVar.f54670k && this.f54674o == gVar.f54674o && this.f54677r == gVar.f54677r && this.f54678s == gVar.f54678s && Objects.equals(this.f54662a, gVar.f54662a) && Objects.equals(this.f54663b, gVar.f54663b) && Objects.equals(this.f54664c, gVar.f54664c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54671l, gVar.f54671l) && Objects.equals(this.f54672m, gVar.f54672m) && Objects.equals(this.f54673n, gVar.f54673n) && Objects.equals(this.f54675p, gVar.f54675p) && Objects.equals(this.f54676q, gVar.f54676q) && Objects.equals(this.f54679t, gVar.f54679t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54662a, this.f54663b, this.f54664c, Long.valueOf(this.d), Long.valueOf(this.f54665e), Long.valueOf(this.f54666f), Long.valueOf(this.f54667g), this.h, Boolean.valueOf(this.f54668i), Long.valueOf(this.f54669j), Long.valueOf(this.f54670k), this.f54671l, this.f54672m, this.f54673n, Boolean.valueOf(this.f54674o), this.f54675p, this.f54676q, Long.valueOf(this.f54677r), Long.valueOf(this.f54678s), this.f54679t);
    }
}
