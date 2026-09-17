package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j3 {
    public final t3 f52070a;
    public o3 f52071b;
    public o3 f52072c;
    public o3 d;
    public f3 h;
    public f3 f52076i;
    public f3 f52077j;
    public f3 f52078k;
    public TL_stars.TL_starGiftUnique f52079l;
    public long f52080m;
    public b1 f52085r;
    public b1 f52086s;
    public float f52087t;
    public boolean f52088u;
    public boolean v;
    public final ArrayList f52073e = new ArrayList();
    public final ArrayList f52074f = new ArrayList();
    public final ArrayList f52075g = new ArrayList();
    public float f52081n = 0.0f;
    public boolean f52082o = false;
    public boolean f52083p = false;
    public boolean f52084q = false;

    public j3(t3 t3Var) {
        this.f52070a = t3Var;
        t3Var.f52620c.addOnAttachStateChangeListener(new bi.i2(this, 14));
    }

    public final void a() {
        this.f52082o = false;
        this.f52070a.f52620c.c();
        f3 f3Var = this.h;
        if (f3Var != null) {
            f3Var.a();
        }
        f3 f3Var2 = this.f52076i;
        if (f3Var2 != null) {
            f3Var2.a();
        }
        f3 f3Var3 = this.f52077j;
        if (f3Var3 != null) {
            f3Var3.a();
        }
        f3 f3Var4 = this.f52078k;
        if (f3Var4 != null) {
            f3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52082o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new d3(this, 1));
        }
    }

    public final void c() {
        if (this.f52082o) {
            return;
        }
        ArrayList arrayList = this.f52073e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((h3) obj).a();
        }
        arrayList.clear();
        this.f52074f.clear();
        this.f52075g.clear();
    }
}
