package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f49615u = 1;
    public final long f49616a;
    public TL_iv.PageBlock f49617b;
    public int f49618c;
    public int d;
    public boolean f49619e;
    public boolean f49620f;
    public t f49621g;
    public ArrayList h;
    public boolean f49622i;
    public final ArrayList f49623j;
    public final ArrayList f49624k;
    public int f49625l;
    public int f49626m;
    public boolean f49627n;
    public boolean f49628o;
    public boolean f49629p;
    public boolean f49630q;
    public boolean f49631r;
    public boolean f49632s;
    public long f49633t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f49618c > 0 && this.f49619e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f49618c > 0) {
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
        this.f49623j = new ArrayList();
        this.f49624k = new ArrayList();
        this.f49617b = pageBlock;
        this.f49618c = i10;
        this.d = i11;
        this.f49616a = j10;
    }
}
