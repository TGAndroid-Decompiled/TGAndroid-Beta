package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47600a;
    public o3 f47601b;
    public o3 f47602c;
    public o3 d;
    public f3 h;
    public f3 f47605i;
    public f3 f47606j;
    public f3 f47607k;
    public TL_stars.TL_starGiftUnique f47608l;
    public long f47609m;
    public b1 f47614r;
    public b1 f47615s;
    public float f47616t;
    public boolean f47617u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47603f = new ArrayList();
    public final ArrayList f47604g = new ArrayList();
    public float f47610n = 0.0f;
    public boolean f47611o = false;
    public boolean f47612p = false;
    public boolean f47613q = false;

    public j3(u3 u3Var) {
        this.f47600a = u3Var;
        u3Var.f48133c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47611o = false;
        this.f47600a.f48133c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47605i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47606j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47607k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47611o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47611o) {
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
        this.f47603f.clear();
        this.f47604g.clear();
    }
}
