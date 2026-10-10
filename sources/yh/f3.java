package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52543a;
    public k3 f52544b;
    public k3 f52545c;
    public k3 d;
    public b3 h;
    public b3 f52549i;
    public b3 f52550j;
    public b3 f52551k;
    public TL_stars.TL_starGiftUnique f52552l;
    public long f52553m;
    public a1 f52558r;
    public a1 f52559s;
    public float f52560t;
    public boolean f52561u;
    public boolean v;
    public final ArrayList f52546e = new ArrayList();
    public final ArrayList f52547f = new ArrayList();
    public final ArrayList f52548g = new ArrayList();
    public float f52554n = 0.0f;
    public boolean f52555o = false;
    public boolean f52556p = false;
    public boolean f52557q = false;

    public f3(p3 p3Var) {
        this.f52543a = p3Var;
        p3Var.f53048c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52555o = false;
        this.f52543a.f53048c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52549i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52550j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52551k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52555o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52555o) {
            return;
        }
        ArrayList arrayList = this.f52546e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52547f.clear();
        this.f52548g.clear();
    }
}
