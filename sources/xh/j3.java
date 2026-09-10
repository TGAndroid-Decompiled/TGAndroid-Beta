package xh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final u3 f45576a;
    public o3 f45577b;
    public o3 f45578c;
    public o3 d;
    public f3 h;
    public f3 f45581i;
    public f3 f45582j;
    public f3 f45583k;
    public TL_stars.TL_starGiftUnique f45584l;
    public long f45585m;
    public b1 f45590r;
    public b1 f45591s;
    public float f45592t;
    public boolean f45593u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f45579f = new ArrayList();
    public final ArrayList f45580g = new ArrayList();
    public float f45586n = 0.0f;
    public boolean f45587o = false;
    public boolean f45588p = false;
    public boolean f45589q = false;

    public j3(u3 u3Var) {
        this.f45576a = u3Var;
        u3Var.f46101c.addOnAttachStateChangeListener(new l.d(this, 13));
    }

    public final void a() {
        this.f45587o = false;
        this.f45576a.f46101c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f45581i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f45582j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f45583k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f45587o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f45587o) {
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
        this.f45579f.clear();
        this.f45580g.clear();
    }
}
