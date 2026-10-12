package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class e3 {
    public final o3 f50420a;
    public j3 f50421b;
    public j3 f50422c;
    public j3 d;
    public a3 h;
    public a3 f50425i;
    public a3 f50426j;
    public a3 f50427k;
    public TL_stars.TL_starGiftUnique f50428l;
    public long f50429m;
    public a1 f50434r;
    public a1 f50435s;
    public float f50436t;
    public boolean f50437u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f50423f = new ArrayList();
    public final ArrayList f50424g = new ArrayList();
    public float f50430n = 0.0f;
    public boolean f50431o = false;
    public boolean f50432p = false;
    public boolean f50433q = false;

    public e3(o3 o3Var) {
        this.f50420a = o3Var;
        o3Var.f50910c.addOnAttachStateChangeListener(new bi.j2(this, 15));
    }

    public final void a() {
        this.f50431o = false;
        this.f50420a.f50910c.c();
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a();
        }
        a3 a3Var2 = this.f50425i;
        if (a3Var2 != null) {
            a3Var2.a();
        }
        a3 a3Var3 = this.f50426j;
        if (a3Var3 != null) {
            a3Var3.a();
        }
        a3 a3Var4 = this.f50427k;
        if (a3Var4 != null) {
            a3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f50431o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new y2(this, 1));
        }
    }

    public final void c() {
        if (this.f50431o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((c3) obj).a();
        }
        arrayList.clear();
        this.f50423f.clear();
        this.f50424g.clear();
    }
}
