package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.yd;
import java.util.ArrayList;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.ys;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f56817a;
    public boolean f56821f;
    public long f56822g;
    public long h;
    public long f56823i;
    public int f56824j;
    public int f56825k;
    public int f56826l;
    public View f56827m;
    public long f56830p;
    public long f56831q;
    public long f56832r;
    public long f56833s;
    public long f56834t;
    public int f56835u;
    public boolean f56838y;
    public int f56839z;
    public final h f56818b = new h(this);
    public final ArrayList f56819c = new ArrayList();
    public ti.b d = ti.b.f58356c;
    public final RectF f56820e = new RectF();
    public final xe.b f56828n = new xe.b();
    public final ArrayList f56829o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f56836w = new Rect();
    public final Rect f56837x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = pc.e(256);
        boolean e11 = pc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f56840a != e10 || rVar.f56841b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f56829o.add(gVar);
    }

    public final void b(ek0 ek0Var) {
        if (ek0Var == null) {
            return;
        }
        this.f56828n.add(ek0Var);
        ek0Var.E2.f33550b.add(new ys() {
            @Override
            public final void a(int i7, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f56824j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f56824j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (ek0Var.Q == null) {
            ek0Var.Q = new ArrayList();
        }
        ek0Var.Q.add(jVar);
        ek0Var.j(new na(this, 29));
    }

    public final void c(k71 k71Var) {
        if (k71Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = k71Var.S;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final ui.c d(n nVar) {
        ui.c cVar = new ui.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.j());
        return cVar;
    }

    public final ti.a e() {
        ti.a aVar = this.D;
        ti.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f58355b = 0;
        int i7 = aVar2.f58355b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f58354a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f56823i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f56822g++;
        this.f56825k += i7;
        this.f56826l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f56827m;
        if (view2 != view) {
            h hVar = this.f56818b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = cVar.f60589a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f60590b;
                    if (aVar != null) {
                        ((xe.b) aVar.f60588a.f12615b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f60590b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f60591c);
                        view2.setTag(2131296699, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                xf.c cVar2 = (xf.c) view.getTag(2131296699);
                if (cVar2 == null) {
                    cVar2 = new xf.c();
                    view.setTag(2131296699, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.f60591c);
                }
                ArrayList arrayList2 = cVar2.f60589a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = yd.a(view, cVar2)) != null) {
                        ((xe.b) a10.f60588a.f12615b).add(hVar);
                    }
                }
            }
            this.f56827m = view;
        }
    }
}
