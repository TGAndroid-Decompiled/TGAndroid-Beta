package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f49651u = 1;
    public final long f49652a;
    public TL_iv.PageBlock f49653b;
    public int f49654c;
    public int d;
    public boolean f49655e;
    public boolean f49656f;
    public t f49657g;
    public ArrayList h;
    public boolean f49658i;
    public final ArrayList f49659j;
    public final ArrayList f49660k;
    public int f49661l;
    public int f49662m;
    public boolean f49663n;
    public boolean f49664o;
    public boolean f49665p;
    public boolean f49666q;
    public boolean f49667r;
    public boolean f49668s;
    public long f49669t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: wh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f49654c > 0 && this.f49655e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f49654c > 0) {
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
        this.f49659j = new ArrayList();
        this.f49660k = new ArrayList();
        this.f49653b = pageBlock;
        this.f49654c = i10;
        this.d = i11;
        this.f49652a = j10;
    }
}
