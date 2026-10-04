package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f51452a;
    public o3 f51453b;
    public o3 f51454c;
    public o3 d;
    public f3 h;
    public f3 f51458i;
    public f3 f51459j;
    public f3 f51460k;
    public TL_stars.TL_starGiftUnique f51461l;
    public long f51462m;
    public b1 f51467r;
    public b1 f51468s;
    public float f51469t;
    public boolean f51470u;
    public boolean v;
    public final ArrayList f51455e = new ArrayList();
    public final ArrayList f51456f = new ArrayList();
    public final ArrayList f51457g = new ArrayList();
    public float f51463n = 0.0f;
    public boolean f51464o = false;
    public boolean f51465p = false;
    public boolean f51466q = false;

    public j3(u3 u3Var) {
        this.f51452a = u3Var;
        u3Var.f52055c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f51464o = false;
        this.f51452a.f52055c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f51458i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f51459j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f51460k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f51464o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f51464o) {
            return;
        }
        ArrayList arrayList = this.f51455e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f51456f.clear();
        this.f51457g.clear();
    }
}
