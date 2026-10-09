package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52499a;
    public k3 f52500b;
    public k3 f52501c;
    public k3 d;
    public b3 h;
    public b3 f52505i;
    public b3 f52506j;
    public b3 f52507k;
    public TL_stars.TL_starGiftUnique f52508l;
    public long f52509m;
    public a1 f52514r;
    public a1 f52515s;
    public float f52516t;
    public boolean f52517u;
    public boolean v;
    public final ArrayList f52502e = new ArrayList();
    public final ArrayList f52503f = new ArrayList();
    public final ArrayList f52504g = new ArrayList();
    public float f52510n = 0.0f;
    public boolean f52511o = false;
    public boolean f52512p = false;
    public boolean f52513q = false;

    public f3(p3 p3Var) {
        this.f52499a = p3Var;
        p3Var.f53004c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52511o = false;
        this.f52499a.f53004c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52505i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52506j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52507k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52511o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52511o) {
            return;
        }
        ArrayList arrayList = this.f52502e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52503f.clear();
        this.f52504g.clear();
    }
}
