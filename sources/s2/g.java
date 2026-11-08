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
    public final String f54649a;
    public final Uri f54650b;
    public final Uri f54651c;
    public final long d;
    public final long f54652e;
    public final long f54653f;
    public final long f54654g;
    public final List h;
    public final boolean f54655i;
    public final long f54656j;
    public final long f54657k;
    public final i0 f54658l;
    public final i0 f54659m;
    public final t1 f54660n;
    public final boolean f54661o;
    public final String f54662p;
    public final String f54663q;
    public final long f54664r;
    public final long f54665s;
    public final String f54666t;

    public g(String str, Uri uri, Uri uri2, long j3, long j10, long j11, long j12, ArrayList arrayList, boolean z9, long j13, long j14, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z10, String str2, String str3, long j15, long j16, String str4) {
        ia.f((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.f54649a = str;
        this.f54650b = uri;
        this.f54651c = uri2;
        this.d = j3;
        this.f54652e = j10;
        this.f54653f = j11;
        this.f54654g = j12;
        this.h = arrayList;
        this.f54655i = z9;
        this.f54656j = j13;
        this.f54657k = j14;
        this.f54658l = i0.q(arrayList2);
        this.f54659m = i0.q(arrayList3);
        this.f54660n = i0.w(new un0(12), arrayList4);
        this.f54661o = z10;
        this.f54662p = str2;
        this.f54663q = str3;
        this.f54664r = j15;
        this.f54665s = j16;
        this.f54666t = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.d == gVar.d && this.f54652e == gVar.f54652e && this.f54653f == gVar.f54653f && this.f54654g == gVar.f54654g && this.f54655i == gVar.f54655i && this.f54656j == gVar.f54656j && this.f54657k == gVar.f54657k && this.f54661o == gVar.f54661o && this.f54664r == gVar.f54664r && this.f54665s == gVar.f54665s && Objects.equals(this.f54649a, gVar.f54649a) && Objects.equals(this.f54650b, gVar.f54650b) && Objects.equals(this.f54651c, gVar.f54651c) && Objects.equals(this.h, gVar.h) && Objects.equals(this.f54658l, gVar.f54658l) && Objects.equals(this.f54659m, gVar.f54659m) && Objects.equals(this.f54660n, gVar.f54660n) && Objects.equals(this.f54662p, gVar.f54662p) && Objects.equals(this.f54663q, gVar.f54663q) && Objects.equals(this.f54666t, gVar.f54666t)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f54649a, this.f54650b, this.f54651c, Long.valueOf(this.d), Long.valueOf(this.f54652e), Long.valueOf(this.f54653f), Long.valueOf(this.f54654g), this.h, Boolean.valueOf(this.f54655i), Long.valueOf(this.f54656j), Long.valueOf(this.f54657k), this.f54658l, this.f54659m, this.f54660n, Boolean.valueOf(this.f54661o), this.f54662p, this.f54663q, Long.valueOf(this.f54664r), Long.valueOf(this.f54665s), this.f54666t);
    }
}
