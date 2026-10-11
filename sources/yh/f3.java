package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52608a;
    public k3 f52609b;
    public k3 f52610c;
    public k3 d;
    public b3 h;
    public b3 f52614i;
    public b3 f52615j;
    public b3 f52616k;
    public TL_stars.TL_starGiftUnique f52617l;
    public long f52618m;
    public a1 f52623r;
    public a1 f52624s;
    public float f52625t;
    public boolean f52626u;
    public boolean v;
    public final ArrayList f52611e = new ArrayList();
    public final ArrayList f52612f = new ArrayList();
    public final ArrayList f52613g = new ArrayList();
    public float f52619n = 0.0f;
    public boolean f52620o = false;
    public boolean f52621p = false;
    public boolean f52622q = false;

    public f3(p3 p3Var) {
        this.f52608a = p3Var;
        p3Var.f53125c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52620o = false;
        this.f52608a.f53125c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52614i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52615j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52616k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52620o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52620o) {
            return;
        }
        ArrayList arrayList = this.f52611e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52612f.clear();
        this.f52613g.clear();
    }
}
