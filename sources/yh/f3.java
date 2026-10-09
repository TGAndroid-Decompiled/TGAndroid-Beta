package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52497a;
    public k3 f52498b;
    public k3 f52499c;
    public k3 d;
    public b3 h;
    public b3 f52503i;
    public b3 f52504j;
    public b3 f52505k;
    public TL_stars.TL_starGiftUnique f52506l;
    public long f52507m;
    public a1 f52512r;
    public a1 f52513s;
    public float f52514t;
    public boolean f52515u;
    public boolean v;
    public final ArrayList f52500e = new ArrayList();
    public final ArrayList f52501f = new ArrayList();
    public final ArrayList f52502g = new ArrayList();
    public float f52508n = 0.0f;
    public boolean f52509o = false;
    public boolean f52510p = false;
    public boolean f52511q = false;

    public f3(p3 p3Var) {
        this.f52497a = p3Var;
        p3Var.f53002c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52509o = false;
        this.f52497a.f53002c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52503i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52504j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52505k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52509o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52509o) {
            return;
        }
        ArrayList arrayList = this.f52500e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52501f.clear();
        this.f52502g.clear();
    }
}
