package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final t3 f52101a;
    public o3 f52102b;
    public o3 f52103c;
    public o3 d;
    public f3 h;
    public f3 f52107i;
    public f3 f52108j;
    public f3 f52109k;
    public TL_stars.TL_starGiftUnique f52110l;
    public long f52111m;
    public b1 f52116r;
    public b1 f52117s;
    public float f52118t;
    public boolean f52119u;
    public boolean v;
    public final ArrayList f52104e = new ArrayList();
    public final ArrayList f52105f = new ArrayList();
    public final ArrayList f52106g = new ArrayList();
    public float f52112n = 0.0f;
    public boolean f52113o = false;
    public boolean f52114p = false;
    public boolean f52115q = false;

    public j3(t3 t3Var) {
        this.f52101a = t3Var;
        t3Var.f52651c.addOnAttachStateChangeListener(new bi.i2(this, 14));
    }

    public final void a() {
        this.f52113o = false;
        this.f52101a.f52651c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f52107i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f52108j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f52109k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52113o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f52113o) {
            return;
        }
        ArrayList arrayList = this.f52104e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f52105f.clear();
        this.f52106g.clear();
    }
}
