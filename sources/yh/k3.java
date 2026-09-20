package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k3 {
    public final v3 f47625a;
    public p3 f47626b;
    public p3 f47627c;
    public p3 d;
    public g3 h;
    public g3 f47630i;
    public g3 f47631j;
    public g3 f47632k;
    public TL_stars.TL_starGiftUnique f47633l;
    public long f47634m;
    public b1 f47639r;
    public b1 f47640s;
    public float f47641t;
    public boolean f47642u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47628f = new ArrayList();
    public final ArrayList f47629g = new ArrayList();
    public float f47635n = 0.0f;
    public boolean f47636o = false;
    public boolean f47637p = false;
    public boolean f47638q = false;

    public k3(v3 v3Var) {
        this.f47625a = v3Var;
        v3Var.f48155c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47636o = false;
        this.f47625a.f48155c.c();
        g3 g3Var = this.h;
        if (g3Var != null) {
            g3Var.a();
        }
        g3 g3Var2 = this.f47630i;
        if (g3Var2 != null) {
            g3Var2.a();
        }
        g3 g3Var3 = this.f47631j;
        if (g3Var3 != null) {
            g3Var3.a();
        }
        g3 g3Var4 = this.f47632k;
        if (g3Var4 != null) {
            g3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47636o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new e3(this, 1));
        }
    }

    public final void c() {
        if (this.f47636o) {
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
        this.f47628f.clear();
        this.f47629g.clear();
    }
}
