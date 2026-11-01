package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class n3 {
    public final y3 f47244a;
    public s3 f47245b;
    public s3 f47246c;
    public s3 d;
    public j3 h;
    public j3 f47249i;
    public j3 f47250j;
    public j3 f47251k;
    public TL_stars.TL_starGiftUnique f47252l;
    public long f47253m;
    public w0 f47258r;
    public w0 f47259s;
    public float f47260t;
    public boolean f47261u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47247f = new ArrayList();
    public final ArrayList f47248g = new ArrayList();
    public float f47254n = 0.0f;
    public boolean f47255o = false;
    public boolean f47256p = false;
    public boolean f47257q = false;

    public n3(y3 y3Var) {
        this.f47244a = y3Var;
        y3Var.f47732c.addOnAttachStateChangeListener(new l.d(this, 14));
    }

    public final void a() {
        this.f47255o = false;
        this.f47244a.f47732c.c();
        j3 j3Var = this.h;
        if (j3Var != null) {
            j3Var.a();
        }
        j3 j3Var2 = this.f47249i;
        if (j3Var2 != null) {
            j3Var2.a();
        }
        j3 j3Var3 = this.f47250j;
        if (j3Var3 != null) {
            j3Var3.a();
        }
        j3 j3Var4 = this.f47251k;
        if (j3Var4 != null) {
            j3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f47255o && !this.v) {
            this.v = true;
            org.telegram.messenger.i0.g3(new h3(this, 1));
        }
    }

    public final void c() {
        if (this.f47255o) {
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
        this.f47247f.clear();
        this.f47248g.clear();
    }
}
