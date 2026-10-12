package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52711a;
    public k3 f52712b;
    public k3 f52713c;
    public k3 d;
    public b3 h;
    public b3 f52717i;
    public b3 f52718j;
    public b3 f52719k;
    public TL_stars.TL_starGiftUnique f52720l;
    public long f52721m;
    public a1 f52726r;
    public a1 f52727s;
    public float f52728t;
    public boolean f52729u;
    public boolean v;
    public final ArrayList f52714e = new ArrayList();
    public final ArrayList f52715f = new ArrayList();
    public final ArrayList f52716g = new ArrayList();
    public float f52722n = 0.0f;
    public boolean f52723o = false;
    public boolean f52724p = false;
    public boolean f52725q = false;

    public f3(p3 p3Var) {
        this.f52711a = p3Var;
        p3Var.f53228c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52723o = false;
        this.f52711a.f53228c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52717i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52718j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52719k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52723o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52723o) {
            return;
        }
        ArrayList arrayList = this.f52714e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52715f.clear();
        this.f52716g.clear();
    }
}
