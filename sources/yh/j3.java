package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f47544a;
    public o3 f47545b;
    public o3 f47546c;
    public o3 d;
    public f3 h;
    public f3 f47549i;
    public f3 f47550j;
    public f3 f47551k;
    public TL_stars.TL_starGiftUnique f47552l;
    public long f47553m;
    public b1 f47558r;
    public b1 f47559s;
    public float f47560t;
    public boolean f47561u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47547f = new ArrayList();
    public final ArrayList f47548g = new ArrayList();
    public float f47554n = 0.0f;
    public boolean f47555o = false;
    public boolean f47556p = false;
    public boolean f47557q = false;

    public j3(u3 u3Var) {
        this.f47544a = u3Var;
        u3Var.f48083c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47555o = false;
        this.f47544a.f48083c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f47549i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f47550j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f47551k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47555o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f47555o) {
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
        this.f47547f.clear();
        this.f47548g.clear();
    }
}
