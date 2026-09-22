package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 {
    public final v3 f47646a;
    public p3 f47647b;
    public p3 f47648c;
    public p3 d;
    public g3 h;
    public g3 f47651i;
    public g3 f47652j;
    public g3 f47653k;
    public TL_stars.TL_starGiftUnique f47654l;
    public long f47655m;
    public b1 f47660r;
    public b1 f47661s;
    public float f47662t;
    public boolean f47663u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47649f = new ArrayList();
    public final ArrayList f47650g = new ArrayList();
    public float f47656n = 0.0f;
    public boolean f47657o = false;
    public boolean f47658p = false;
    public boolean f47659q = false;

    public k3(v3 v3Var) {
        this.f47646a = v3Var;
        v3Var.f48176c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47657o = false;
        this.f47646a.f48176c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.f47651i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.f47652j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.f47653k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47657o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.f47657o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i3) obj).a();
        }
        arrayList.clear();
        this.f47649f.clear();
        this.f47650g.clear();
    }
}
