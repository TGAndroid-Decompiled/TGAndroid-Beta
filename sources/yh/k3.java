package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 {
    public final v3 f47586a;
    public p3 f47587b;
    public p3 f47588c;
    public p3 d;
    public g3 h;
    public g3 f47591i;
    public g3 f47592j;
    public g3 f47593k;
    public TL_stars.TL_starGiftUnique f47594l;
    public long f47595m;
    public b1 f47600r;
    public b1 f47601s;
    public float f47602t;
    public boolean f47603u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47589f = new ArrayList();
    public final ArrayList f47590g = new ArrayList();
    public float f47596n = 0.0f;
    public boolean f47597o = false;
    public boolean f47598p = false;
    public boolean f47599q = false;

    public k3(v3 v3Var) {
        this.f47586a = v3Var;
        v3Var.f48113c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47597o = false;
        this.f47586a.f48113c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.f47591i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.f47592j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.f47593k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47597o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.f47597o) {
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
        this.f47589f.clear();
        this.f47590g.clear();
    }
}
