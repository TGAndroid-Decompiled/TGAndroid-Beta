package th;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f48326u = 1;
    public final long f48327a;
    public TL_iv.PageBlock f48328b;
    public int f48329c;
    public int d;
    public boolean f48330e;
    public boolean f48331f;
    public s f48332g;
    public ArrayList h;
    public boolean f48333i;
    public final ArrayList f48334j;
    public final ArrayList f48335k;
    public int f48336l;
    public int f48337m;
    public boolean f48338n;
    public boolean f48339o;
    public boolean f48340p;
    public boolean f48341q;
    public boolean f48342r;
    public boolean f48343s;
    public long f48344t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: th.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f48329c > 0 && this.f48330e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f48329c > 0) {
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
        this.f48334j = new ArrayList();
        this.f48335k = new ArrayList();
        this.f48328b = pageBlock;
        this.f48329c = i10;
        this.d = i11;
        this.f48327a = j10;
    }
}
