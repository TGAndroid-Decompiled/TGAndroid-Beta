package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 {
    public final v3 f47273a;
    public p3 f47274b;
    public p3 f47275c;
    public p3 d;
    public g3 h;
    public g3 f47278i;
    public g3 f47279j;
    public g3 f47280k;
    public TL_stars.TL_starGiftUnique f47281l;
    public long f47282m;
    public b1 f47287r;
    public b1 f47288s;
    public float f47289t;
    public boolean f47290u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47276f = new ArrayList();
    public final ArrayList f47277g = new ArrayList();
    public float f47283n = 0.0f;
    public boolean f47284o = false;
    public boolean f47285p = false;
    public boolean f47286q = false;

    public k3(v3 v3Var) {
        this.f47273a = v3Var;
        v3Var.f47806c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47284o = false;
        this.f47273a.f47806c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.f47278i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.f47279j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.f47280k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47284o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.f47284o) {
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
        this.f47276f.clear();
        this.f47277g.clear();
    }
}
