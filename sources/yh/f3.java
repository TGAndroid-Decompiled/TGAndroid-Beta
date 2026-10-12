package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52723a;
    public k3 f52724b;
    public k3 f52725c;
    public k3 d;
    public b3 h;
    public b3 f52729i;
    public b3 f52730j;
    public b3 f52731k;
    public TL_stars.TL_starGiftUnique f52732l;
    public long f52733m;
    public a1 f52738r;
    public a1 f52739s;
    public float f52740t;
    public boolean f52741u;
    public boolean v;
    public final ArrayList f52726e = new ArrayList();
    public final ArrayList f52727f = new ArrayList();
    public final ArrayList f52728g = new ArrayList();
    public float f52734n = 0.0f;
    public boolean f52735o = false;
    public boolean f52736p = false;
    public boolean f52737q = false;

    public f3(p3 p3Var) {
        this.f52723a = p3Var;
        p3Var.f53240c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52735o = false;
        this.f52723a.f53240c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52729i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52730j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52731k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52735o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52735o) {
            return;
        }
        ArrayList arrayList = this.f52726e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52727f.clear();
        this.f52728g.clear();
    }
}
