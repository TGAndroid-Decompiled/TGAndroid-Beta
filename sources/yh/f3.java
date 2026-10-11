package yh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class f3 {
    public final p3 f52574a;
    public k3 f52575b;
    public k3 f52576c;
    public k3 d;
    public b3 h;
    public b3 f52580i;
    public b3 f52581j;
    public b3 f52582k;
    public TL_stars.TL_starGiftUnique f52583l;
    public long f52584m;
    public a1 f52589r;
    public a1 f52590s;
    public float f52591t;
    public boolean f52592u;
    public boolean v;
    public final ArrayList f52577e = new ArrayList();
    public final ArrayList f52578f = new ArrayList();
    public final ArrayList f52579g = new ArrayList();
    public float f52585n = 0.0f;
    public boolean f52586o = false;
    public boolean f52587p = false;
    public boolean f52588q = false;

    public f3(p3 p3Var) {
        this.f52574a = p3Var;
        p3Var.f53091c.addOnAttachStateChangeListener(new ai.v2(this, 15));
    }

    public final void a() {
        this.f52586o = false;
        this.f52574a.f53091c.c();
        b3 b3Var = this.h;
        if (b3Var != null) {
            b3Var.a();
        }
        b3 b3Var2 = this.f52580i;
        if (b3Var2 != null) {
            b3Var2.a();
        }
        b3 b3Var3 = this.f52581j;
        if (b3Var3 != null) {
            b3Var3.a();
        }
        b3 b3Var4 = this.f52582k;
        if (b3Var4 != null) {
            b3Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.f52586o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new z2(this, 1));
        }
    }

    public final void c() {
        if (this.f52586o) {
            return;
        }
        ArrayList arrayList = this.f52577e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((d3) obj).a();
        }
        arrayList.clear();
        this.f52578f.clear();
        this.f52579g.clear();
    }
}
