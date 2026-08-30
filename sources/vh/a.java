package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f45773u = 1;
    public final long f45774a;
    public TL_iv.PageBlock f45775b;
    public int f45776c;
    public int d;
    public boolean e;
    public boolean f45777f;
    public s f45778g;
    public ArrayList h;
    public boolean f45779i;
    public final ArrayList f45780j;
    public final ArrayList f45781k;
    public int f45782l;
    public int f45783m;
    public boolean f45784n;
    public boolean f45785o;
    public boolean f45786p;
    public boolean f45787q;
    public boolean f45788r;
    public boolean f45789s;
    public long f45790t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: vh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f45776c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f45776c > 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j10) {
        this.f45780j = new ArrayList();
        this.f45781k = new ArrayList();
        this.f45775b = pageBlock;
        this.f45776c = i10;
        this.d = i11;
        this.f45774a = j10;
    }
}
