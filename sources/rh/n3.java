package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class n3 {
    public final y3 f47233a;
    public s3 f47234b;
    public s3 f47235c;
    public s3 d;
    public j3 h;
    public j3 f47238i;
    public j3 f47239j;
    public j3 f47240k;
    public TL_stars.TL_starGiftUnique f47241l;
    public long f47242m;
    public w0 f47247r;
    public w0 f47248s;
    public float f47249t;
    public boolean f47250u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47236f = new ArrayList();
    public final ArrayList f47237g = new ArrayList();
    public float f47243n = 0.0f;
    public boolean f47244o = false;
    public boolean f47245p = false;
    public boolean f47246q = false;

    public n3(y3 y3Var) {
        this.f47233a = y3Var;
        y3Var.f47720c.addOnAttachStateChangeListener(new l.d(this, 14));
    }

    public final void a() {
        this.f47244o = false;
        this.f47233a.f47720c.c();
        j3 j3Var = this.h;
        if (j3Var != null) {
            j3Var.a();
        }
        j3 j3Var2 = this.f47238i;
        if (j3Var2 != null) {
            j3Var2.a();
        }
        j3 j3Var3 = this.f47239j;
        if (j3Var3 != null) {
            j3Var3.a();
        }
        j3 j3Var4 = this.f47240k;
        if (j3Var4 != null) {
            j3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47244o && !this.v) {
            this.v = true;
            org.telegram.messenger.i0.g3(new h3(this, 1));
        }
    }

    public final void c() {
        if (this.f47244o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((l3) obj).a();
        }
        arrayList.clear();
        this.f47236f.clear();
        this.f47237g.clear();
    }
}
