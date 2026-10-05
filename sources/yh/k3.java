package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 {
    public final v3 f51521a;
    public p3 f51522b;
    public p3 f51523c;
    public p3 d;
    public g3 h;
    public g3 f51527i;
    public g3 f51528j;
    public g3 f51529k;
    public TL_stars.TL_starGiftUnique f51530l;
    public long f51531m;
    public d1 f51536r;
    public d1 f51537s;
    public float f51538t;
    public boolean f51539u;
    public boolean v;
    public final ArrayList f51524e = new ArrayList();
    public final ArrayList f51525f = new ArrayList();
    public final ArrayList f51526g = new ArrayList();
    public float f51532n = 0.0f;
    public boolean f51533o = false;
    public boolean f51534p = false;
    public boolean f51535q = false;

    public k3(v3 v3Var) {
        this.f51521a = v3Var;
        v3Var.f52131c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f51533o = false;
        this.f51521a.f52131c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.f51527i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.f51528j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.f51529k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f51533o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.f51533o) {
            return;
        }
        ArrayList arrayList = this.f51524e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i3) obj).a();
        }
        arrayList.clear();
        this.f51525f.clear();
        this.f51526g.clear();
    }
}
