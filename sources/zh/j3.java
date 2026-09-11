package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final t3 f52069a;
    public o3 f52070b;
    public o3 f52071c;
    public o3 d;
    public f3 h;
    public f3 f52075i;
    public f3 f52076j;
    public f3 f52077k;
    public TL_stars.TL_starGiftUnique f52078l;
    public long f52079m;
    public b1 f52084r;
    public b1 f52085s;
    public float f52086t;
    public boolean f52087u;
    public boolean v;
    public final ArrayList f52072e = new ArrayList();
    public final ArrayList f52073f = new ArrayList();
    public final ArrayList f52074g = new ArrayList();
    public float f52080n = 0.0f;
    public boolean f52081o = false;
    public boolean f52082p = false;
    public boolean f52083q = false;

    public j3(t3 t3Var) {
        this.f52069a = t3Var;
        t3Var.f52619c.addOnAttachStateChangeListener(new bi.i2(this, 14));
    }

    public final void a() {
        this.f52081o = false;
        this.f52069a.f52619c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f52075i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f52076j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f52077k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52081o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f52081o) {
            return;
        }
        ArrayList arrayList = this.f52072e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f52073f.clear();
        this.f52074g.clear();
    }
}
