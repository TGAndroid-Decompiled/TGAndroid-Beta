package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47653a;
    public o3 f47654b;
    public o3 f47655c;
    public o3 d;
    public f3 h;
    public f3 f47658i;
    public f3 f47659j;
    public f3 f47660k;
    public TL_stars.TL_starGiftUnique f47661l;
    public long f47662m;
    public b1 f47667r;
    public b1 f47668s;
    public float f47669t;
    public boolean f47670u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47656f = new ArrayList();
    public final ArrayList f47657g = new ArrayList();
    public float f47663n = 0.0f;
    public boolean f47664o = false;
    public boolean f47665p = false;
    public boolean f47666q = false;

    public j3(u3 u3Var) {
        this.f47653a = u3Var;
        u3Var.f48192c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47664o = false;
        this.f47653a.f48192c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47658i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47659j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47660k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47664o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47664o) {
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
        this.f47656f.clear();
        this.f47657g.clear();
    }
}
