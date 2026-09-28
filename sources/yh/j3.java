package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47546a;
    public o3 f47547b;
    public o3 f47548c;
    public o3 d;
    public f3 h;
    public f3 f47551i;
    public f3 f47552j;
    public f3 f47553k;
    public TL_stars.TL_starGiftUnique f47554l;
    public long f47555m;
    public b1 f47560r;
    public b1 f47561s;
    public float f47562t;
    public boolean f47563u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47549f = new ArrayList();
    public final ArrayList f47550g = new ArrayList();
    public float f47556n = 0.0f;
    public boolean f47557o = false;
    public boolean f47558p = false;
    public boolean f47559q = false;

    public j3(u3 u3Var) {
        this.f47546a = u3Var;
        u3Var.f48085c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47557o = false;
        this.f47546a.f48085c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47551i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47552j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47553k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47557o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47557o) {
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
        this.f47549f.clear();
        this.f47550g.clear();
    }
}
