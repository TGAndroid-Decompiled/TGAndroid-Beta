package zh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class e3 {
    public final o3 f50421a;
    public j3 f50422b;
    public j3 f50423c;
    public j3 d;
    public a3 h;
    public a3 f50426i;
    public a3 f50427j;
    public a3 f50428k;
    public TL_stars.TL_starGiftUnique f50429l;
    public long f50430m;
    public a1 f50435r;
    public a1 f50436s;
    public float f50437t;
    public boolean f50438u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f50424f = new ArrayList();
    public final ArrayList f50425g = new ArrayList();
    public float f50431n = 0.0f;
    public boolean f50432o = false;
    public boolean f50433p = false;
    public boolean f50434q = false;

    public e3(o3 o3Var) {
        this.f50421a = o3Var;
        o3Var.f50911c.addOnAttachStateChangeListener(new bi.j2(this, 15));
    }

    public final void a() {
        this.f50432o = false;
        this.f50421a.f50911c.c();
        a3 a3Var = this.h;
        if (a3Var != null) {
            a3Var.a();
        }
        a3 a3Var2 = this.f50426i;
        if (a3Var2 != null) {
            a3Var2.a();
        }
        a3 a3Var3 = this.f50427j;
        if (a3Var3 != null) {
            a3Var3.a();
        }
        a3 a3Var4 = this.f50428k;
        if (a3Var4 != null) {
            a3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f50432o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new y2(this, 1));
        }
    }

    public final void c() {
        if (this.f50432o) {
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
        this.f50424f.clear();
        this.f50425g.clear();
    }
}
