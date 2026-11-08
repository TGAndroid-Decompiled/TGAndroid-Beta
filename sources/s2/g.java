package s2;

import a8.ia;
import android.net.Uri;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.un0;
public final class g {
    public final String f54650a;
    public final Uri f54651b;
    public final Uri f54652c;
    public final long d;
    public final long f54653e;
    public final long f54654f;
    public final long f54655g;
    public final List h;
    public final boolean f54656i;
    public final long f54657j;
    public final long f54658k;
    public final i0 f54659l;
    public final i0 f54660m;
    public final t1 f54661n;
    public final boolean f54662o;
    public final String f54663p;
    public final String f54664q;
    public final long f54665r;
    public final long f54666s;
    public final String f54667t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54650a = str;
        this.f54651b = uri;
        this.f54652c = uri2;
        this.d = j3;
        this.f54653e = j10;
        this.f54654f = j11;
        this.f54655g = j12;
        this.h = arrayList;
        this.f54656i = z9;
        this.f54657j = j13;
        this.f54658k = j14;
        this.f54659l = i0.q(arrayList2);
        this.f54660m = i0.q(arrayList3);
        this.f54661n = i0.w(new un0(12), arrayList4);
        this.f54662o = z10;
        this.f54663p = str2;
        this.f54664q = str3;
        this.f54665r = j15;
        this.f54666s = j16;
        this.f54667t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54653e == gVar.f54653e && this.f54654f == gVar.f54654f && this.f54655g == gVar.f54655g && this.f54656i == gVar.f54656i && this.f54657j == gVar.f54657j && this.f54658k == gVar.f54658k && this.f54662o == gVar.f54662o && this.f54665r == gVar.f54665r && this.f54666s == gVar.f54666s && Objects.equals(this.f54650a, gVar.f54650a) && Objects.equals(this.f54651b, gVar.f54651b) && Objects.equals(this.f54652c, gVar.f54652c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54659l, gVar.f54659l) && Objects.equals(this.f54660m, gVar.f54660m) && Objects.equals(this.f54661n, gVar.f54661n) && Objects.equals(this.f54663p, gVar.f54663p) && Objects.equals(this.f54664q, gVar.f54664q) && Objects.equals(this.f54667t, gVar.f54667t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54650a, this.f54651b, this.f54652c, Long.valueOf(this.d), Long.valueOf(this.f54653e), Long.valueOf(this.f54654f), Long.valueOf(this.f54655g), this.h, Boolean.valueOf(this.f54656i), Long.valueOf(this.f54657j), Long.valueOf(this.f54658k), this.f54659l, this.f54660m, this.f54661n, Boolean.valueOf(this.f54662o), this.f54663p, this.f54664q, Long.valueOf(this.f54665r), Long.valueOf(this.f54666s), this.f54667t);
    }
}
