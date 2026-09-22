package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class l3 {
    public final w3 f47341a;
    public q3 f47342b;
    public q3 f47343c;
    public q3 d;
    public h3 h;
    public h3 f47346i;
    public h3 f47347j;
    public h3 f47348k;
    public TL_stars.TL_starGiftUnique f47349l;
    public long f47350m;
    public b1 f47355r;
    public b1 f47356s;
    public float f47357t;
    public boolean f47358u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47344f = new ArrayList();
    public final ArrayList f47345g = new ArrayList();
    public float f47351n = 0.0f;
    public boolean f47352o = false;
    public boolean f47353p = false;
    public boolean f47354q = false;

    public l3(w3 w3Var) {
        this.f47341a = w3Var;
        w3Var.f47874c.addOnAttachStateChangeListener(new ai.u2(this, 15));
    }

    public final void a() {
        this.f47352o = false;
        this.f47341a.f47874c.c();
        h3 h3Var = this.h;
        if (h3Var != null) {
            h3Var.a();
        }
        h3 h3Var2 = this.f47346i;
        if (h3Var2 != null) {
            h3Var2.a();
        }
        h3 h3Var3 = this.f47347j;
        if (h3Var3 != null) {
            h3Var3.a();
        }
        h3 h3Var4 = this.f47348k;
        if (h3Var4 != null) {
            h3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47352o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new f3(this, 1));
        }
    }

    public final void c() {
        if (this.f47352o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((j3) obj).a();
        }
        arrayList.clear();
        this.f47344f.clear();
        this.f47345g.clear();
    }
}
