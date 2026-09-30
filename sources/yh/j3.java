package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47547a;
    public o3 f47548b;
    public o3 f47549c;
    public o3 d;
    public f3 h;
    public f3 f47552i;
    public f3 f47553j;
    public f3 f47554k;
    public TL_stars.TL_starGiftUnique f47555l;
    public long f47556m;
    public b1 f47561r;
    public b1 f47562s;
    public float f47563t;
    public boolean f47564u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47550f = new ArrayList();
    public final ArrayList f47551g = new ArrayList();
    public float f47557n = 0.0f;
    public boolean f47558o = false;
    public boolean f47559p = false;
    public boolean f47560q = false;

    public j3(u3 u3Var) {
        this.f47547a = u3Var;
        u3Var.f48085c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47558o = false;
        this.f47547a.f48085c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47552i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47553j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47554k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47558o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47558o) {
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
        this.f47550f.clear();
        this.f47551g.clear();
    }
}
