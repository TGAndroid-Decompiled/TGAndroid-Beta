package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47545a;
    public o3 f47546b;
    public o3 f47547c;
    public o3 d;
    public f3 h;
    public f3 f47550i;
    public f3 f47551j;
    public f3 f47552k;
    public TL_stars.TL_starGiftUnique f47553l;
    public long f47554m;
    public b1 f47559r;
    public b1 f47560s;
    public float f47561t;
    public boolean f47562u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47548f = new ArrayList();
    public final ArrayList f47549g = new ArrayList();
    public float f47555n = 0.0f;
    public boolean f47556o = false;
    public boolean f47557p = false;
    public boolean f47558q = false;

    public j3(u3 u3Var) {
        this.f47545a = u3Var;
        u3Var.f48084c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47556o = false;
        this.f47545a.f48084c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47550i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47551j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47552k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47556o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47556o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f47548f.clear();
        this.f47549g.clear();
    }
}
