package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f45851u = 1;
    public final long f45852a;
    public TL_iv.PageBlock f45853b;
    public int f45854c;
    public int d;
    public boolean e;
    public boolean f45855f;
    public t f45856g;
    public ArrayList h;
    public boolean f45857i;
    public final ArrayList f45858j;
    public final ArrayList f45859k;
    public int f45860l;
    public int f45861m;
    public boolean f45862n;
    public boolean f45863o;
    public boolean f45864p;
    public boolean f45865q;
    public boolean f45866r;
    public boolean f45867s;
    public long f45868t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: vh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f45854c > 0 && this.e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f45854c > 0) {
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
        this.f45858j = new ArrayList();
        this.f45859k = new ArrayList();
        this.f45853b = pageBlock;
        this.f45854c = i10;
        this.d = i11;
        this.f45852a = j10;
    }
}
