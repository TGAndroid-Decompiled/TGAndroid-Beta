package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f49614u = 1;
    public final long f49615a;
    public TL_iv.PageBlock f49616b;
    public int f49617c;
    public int d;
    public boolean f49618e;
    public boolean f49619f;
    public t f49620g;
    public ArrayList h;
    public boolean f49621i;
    public final ArrayList f49622j;
    public final ArrayList f49623k;
    public int f49624l;
    public int f49625m;
    public boolean f49626n;
    public boolean f49627o;
    public boolean f49628p;
    public boolean f49629q;
    public boolean f49630r;
    public boolean f49631s;
    public long f49632t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f49617c > 0 && this.f49618e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f49617c > 0) {
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
        this.f49622j = new ArrayList();
        this.f49623k = new ArrayList();
        this.f49616b = pageBlock;
        this.f49617c = i10;
        this.d = i11;
        this.f49615a = j10;
    }
}
