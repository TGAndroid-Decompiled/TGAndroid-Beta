package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class m3 {
    public final x3 f47437a;
    public r3 f47438b;
    public r3 f47439c;
    public r3 d;
    public i3 h;
    public i3 f47442i;
    public i3 f47443j;
    public i3 f47444k;
    public TL_stars.TL_starGiftUnique f47445l;
    public long f47446m;
    public b1 f47451r;
    public b1 f47452s;
    public float f47453t;
    public boolean f47454u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47440f = new ArrayList();
    public final ArrayList f47441g = new ArrayList();
    public float f47447n = 0.0f;
    public boolean f47448o = false;
    public boolean f47449p = false;
    public boolean f47450q = false;

    public m3(x3 x3Var) {
        this.f47437a = x3Var;
        x3Var.f47967c.addOnAttachStateChangeListener(new ai.u2(this, 14));
    }

    public final void a() {
        this.f47448o = false;
        this.f47437a.f47967c.c();
        i3 i3Var = this.h;
        if (i3Var != null) {
            i3Var.a();
        }
        i3 i3Var2 = this.f47442i;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        i3 i3Var3 = this.f47443j;
        if (i3Var3 != null) {
            i3Var3.a();
        }
        i3 i3Var4 = this.f47444k;
        if (i3Var4 != null) {
            i3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47448o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new g3(this, 1));
        }
    }

    public final void c() {
        if (this.f47448o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((k3) obj).a();
        }
        arrayList.clear();
        this.f47440f.clear();
        this.f47441g.clear();
    }
}
