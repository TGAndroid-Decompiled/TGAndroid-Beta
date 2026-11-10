package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.xn0;
public final class g {
    public final String f54661a;
    public final Uri f54662b;
    public final Uri f54663c;
    public final long d;
    public final long f54664e;
    public final long f54665f;
    public final long f54666g;
    public final List h;
    public final boolean f54667i;
    public final long f54668j;
    public final long f54669k;
    public final i0 f54670l;
    public final i0 f54671m;
    public final t1 f54672n;
    public final boolean f54673o;
    public final String f54674p;
    public final String f54675q;
    public final long f54676r;
    public final long f54677s;
    public final String f54678t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54661a = str;
        this.f54662b = uri;
        this.f54663c = uri2;
        this.d = j3;
        this.f54664e = j10;
        this.f54665f = j11;
        this.f54666g = j12;
        this.h = arrayList;
        this.f54667i = z9;
        this.f54668j = j13;
        this.f54669k = j14;
        this.f54670l = i0.q(arrayList2);
        this.f54671m = i0.q(arrayList3);
        this.f54672n = i0.w(new xn0(12), arrayList4);
        this.f54673o = z10;
        this.f54674p = str2;
        this.f54675q = str3;
        this.f54676r = j15;
        this.f54677s = j16;
        this.f54678t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54664e == gVar.f54664e && this.f54665f == gVar.f54665f && this.f54666g == gVar.f54666g && this.f54667i == gVar.f54667i && this.f54668j == gVar.f54668j && this.f54669k == gVar.f54669k && this.f54673o == gVar.f54673o && this.f54676r == gVar.f54676r && this.f54677s == gVar.f54677s && Objects.equals(this.f54661a, gVar.f54661a) && Objects.equals(this.f54662b, gVar.f54662b) && Objects.equals(this.f54663c, gVar.f54663c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54670l, gVar.f54670l) && Objects.equals(this.f54671m, gVar.f54671m) && Objects.equals(this.f54672n, gVar.f54672n) && Objects.equals(this.f54674p, gVar.f54674p) && Objects.equals(this.f54675q, gVar.f54675q) && Objects.equals(this.f54678t, gVar.f54678t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54661a, this.f54662b, this.f54663c, Long.valueOf(this.d), Long.valueOf(this.f54664e), Long.valueOf(this.f54665f), Long.valueOf(this.f54666g), this.h, Boolean.valueOf(this.f54667i), Long.valueOf(this.f54668j), Long.valueOf(this.f54669k), this.f54670l, this.f54671m, this.f54672n, Boolean.valueOf(this.f54673o), this.f54674p, this.f54675q, Long.valueOf(this.f54676r), Long.valueOf(this.f54677s), this.f54678t);
    }
}
