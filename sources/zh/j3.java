package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final t3 f52100a;
    public o3 f52101b;
    public o3 f52102c;
    public o3 d;
    public f3 h;
    public f3 f52106i;
    public f3 f52107j;
    public f3 f52108k;
    public TL_stars.TL_starGiftUnique f52109l;
    public long f52110m;
    public b1 f52115r;
    public b1 f52116s;
    public float f52117t;
    public boolean f52118u;
    public boolean v;
    public final ArrayList f52103e = new ArrayList();
    public final ArrayList f52104f = new ArrayList();
    public final ArrayList f52105g = new ArrayList();
    public float f52111n = 0.0f;
    public boolean f52112o = false;
    public boolean f52113p = false;
    public boolean f52114q = false;

    public j3(t3 t3Var) {
        this.f52100a = t3Var;
        t3Var.f52650c.addOnAttachStateChangeListener(new bi.i2(this, 14));
    }

    public final void a() {
        this.f52112o = false;
        this.f52100a.f52650c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f52106i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f52107j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f52108k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52112o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f52112o) {
            return;
        }
        ArrayList arrayList = this.f52103e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f52104f.clear();
        this.f52105g.clear();
    }
}
