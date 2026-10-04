package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f51459a;
    public o3 f51460b;
    public o3 f51461c;
    public o3 d;
    public f3 h;
    public f3 f51465i;
    public f3 f51466j;
    public f3 f51467k;
    public TL_stars.TL_starGiftUnique f51468l;
    public long f51469m;
    public b1 f51474r;
    public b1 f51475s;
    public float f51476t;
    public boolean f51477u;
    public boolean v;
    public final ArrayList f51462e = new ArrayList();
    public final ArrayList f51463f = new ArrayList();
    public final ArrayList f51464g = new ArrayList();
    public float f51470n = 0.0f;
    public boolean f51471o = false;
    public boolean f51472p = false;
    public boolean f51473q = false;

    public j3(u3 u3Var) {
        this.f51459a = u3Var;
        u3Var.f52061c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f51471o = false;
        this.f51459a.f52061c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f51465i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f51466j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f51467k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f51471o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f51471o) {
            return;
        }
        ArrayList arrayList = this.f51462e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f51463f.clear();
        this.f51464g.clear();
    }
}
