package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

public final class a {

    public static long f47026u = 1;

    public final long f47027a;

    public TL_iv.PageBlock f47028b;

    public int f47029c;
    public int d;

    public boolean f47030e;

    public boolean f47031f;

    public s f47032g;
    public ArrayList h;

    public boolean f47033i;

    public final ArrayList f47034j;

    public final ArrayList f47035k;

    public int f47036l;

    public int f47037m;

    public boolean f47038n;

    public boolean f47039o;

    public boolean f47040p;

    public boolean f47041q;

    public boolean f47042r;

    public boolean f47043s;

    public long f47044t;

    public a(TL_iv.PageBlock pageBlock, int i10, int i11) {
        long j10 = f47026u;
        f47026u = 1 + j10;
        this(pageBlock, i10, i11, j10);
    }

    public final boolean a() {
        return this.f47029c > 0 && this.f47030e;
    }

    public final boolean b() {
        return this.f47029c > 0;
    }

    public final boolean c() {
        return this.d > 0;
    }

    public a(TL_iv.PageBlock pageBlock, int i10, int i11, long j10) {
        this.f47034j = new ArrayList();
        this.f47035k = new ArrayList();
        this.f47028b = pageBlock;
        this.f47029c = i10;
        this.d = i11;
        this.f47027a = j10;
    }
}
