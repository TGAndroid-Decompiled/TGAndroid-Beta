package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f51453a;
    public o3 f51454b;
    public o3 f51455c;
    public o3 d;
    public f3 h;
    public f3 f51459i;
    public f3 f51460j;
    public f3 f51461k;
    public TL_stars.TL_starGiftUnique f51462l;
    public long f51463m;
    public b1 f51468r;
    public b1 f51469s;
    public float f51470t;
    public boolean f51471u;
    public boolean v;
    public final ArrayList f51456e = new ArrayList();
    public final ArrayList f51457f = new ArrayList();
    public final ArrayList f51458g = new ArrayList();
    public float f51464n = 0.0f;
    public boolean f51465o = false;
    public boolean f51466p = false;
    public boolean f51467q = false;

    public j3(u3 u3Var) {
        this.f51453a = u3Var;
        u3Var.f52056c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f51465o = false;
        this.f51453a.f52056c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f51459i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f51460j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f51461k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f51465o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f51465o) {
            return;
        }
        ArrayList arrayList = this.f51456e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f51457f.clear();
        this.f51458g.clear();
    }
}
