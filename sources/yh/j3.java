package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47537a;
    public o3 f47538b;
    public o3 f47539c;
    public o3 d;
    public f3 h;
    public f3 f47542i;
    public f3 f47543j;
    public f3 f47544k;
    public TL_stars.TL_starGiftUnique f47545l;
    public long f47546m;
    public b1 f47551r;
    public b1 f47552s;
    public float f47553t;
    public boolean f47554u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47540f = new ArrayList();
    public final ArrayList f47541g = new ArrayList();
    public float f47547n = 0.0f;
    public boolean f47548o = false;
    public boolean f47549p = false;
    public boolean f47550q = false;

    public j3(u3 u3Var) {
        this.f47537a = u3Var;
        u3Var.f48072c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47548o = false;
        this.f47537a.f48072c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47542i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47543j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47544k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47548o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47548o) {
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
        this.f47540f.clear();
        this.f47541g.clear();
    }
}
