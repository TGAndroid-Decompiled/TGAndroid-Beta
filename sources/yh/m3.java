package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class m3 {
    public final x3 f47465a;
    public r3 f47466b;
    public r3 f47467c;
    public r3 d;
    public i3 h;
    public i3 f47470i;
    public i3 f47471j;
    public i3 f47472k;
    public TL_stars.TL_starGiftUnique f47473l;
    public long f47474m;
    public b1 f47479r;
    public b1 f47480s;
    public float f47481t;
    public boolean f47482u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47468f = new ArrayList();
    public final ArrayList f47469g = new ArrayList();
    public float f47475n = 0.0f;
    public boolean f47476o = false;
    public boolean f47477p = false;
    public boolean f47478q = false;

    public m3(x3 x3Var) {
        this.f47465a = x3Var;
        x3Var.f47995c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47476o = false;
        this.f47465a.f47995c.c();
        i3 i3Var = this.h;
        if (i3Var != null) {
            i3Var.a();
        }
        i3 i3Var2 = this.f47470i;
        if (i3Var2 != null) {
            i3Var2.a();
        }
        i3 i3Var3 = this.f47471j;
        if (i3Var3 != null) {
            i3Var3.a();
        }
        i3 i3Var4 = this.f47472k;
        if (i3Var4 != null) {
            i3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47476o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new g3(this, 1));
        }
    }

    public final void c() {
        if (this.f47476o) {
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
        this.f47468f.clear();
        this.f47469g.clear();
    }
}
