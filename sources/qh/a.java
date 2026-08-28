package qh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class a {
    public static long f46267u = 1;
    public final long f46268a;
    public TL_iv.PageBlock f46269b;
    public int f46270c;
    public int d;
    public boolean f46271e;
    public boolean f46272f;
    public s f46273g;
    public ArrayList h;
    public boolean f46274i;
    public final ArrayList f46275j;
    public final ArrayList f46276k;
    public int f46277l;
    public int f46278m;
    public boolean f46279n;
    public boolean f46280o;
    public boolean f46281p;
    public boolean f46282q;
    public boolean f46283r;
    public boolean f46284s;
    public long f46285t;

    public a(org.telegram.tgnet.tl.TL_iv.PageBlock r7, int r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: qh.a.<init>(org.telegram.tgnet.tl.TL_iv$PageBlock, int, int):void");
    }

    public final boolean a() {
        if (this.f46270c > 0 && this.f46271e) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.f46270c > 0) {
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

    public a(TL_iv.PageBlock pageBlock, int i9, int i10, long j10) {
        this.f46275j = new ArrayList();
        this.f46276k = new ArrayList();
        this.f46269b = pageBlock;
        this.f46270c = i9;
        this.d = i10;
        this.f46268a = j10;
    }
}
