package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.xd;
import java.util.ArrayList;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.oa;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f56739a;
    public boolean f56743f;
    public long f56744g;
    public long h;
    public long f56745i;
    public int f56746j;
    public int f56747k;
    public int f56748l;
    public View f56749m;
    public long f56752p;
    public long f56753q;
    public long f56754r;
    public long f56755s;
    public long f56756t;
    public int f56757u;
    public boolean f56760y;
    public int f56761z;
    public final h f56740b = new h(this);
    public final ArrayList f56741c = new ArrayList();
    public ti.b d = ti.b.f58276c;
    public final RectF f56742e = new RectF();
    public final xe.b f56750n = new xe.b();
    public final ArrayList f56751o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f56758w = new Rect();
    public final Rect f56759x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = qc.e(256);
        boolean e11 = qc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f56762a != e10 || rVar.f56763b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f56751o.add(gVar);
    }

    public final void b(ek0 ek0Var) {
        if (ek0Var == null) {
            return;
        }
        this.f56750n.add(ek0Var);
        ek0Var.E2.f34568b.add(new bt() {
            @Override
            public final void a(int i7, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f56746j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f56746j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (ek0Var.Q == null) {
            ek0Var.Q = new ArrayList();
        }
        ek0Var.Q.add(jVar);
        ek0Var.j(new oa(this, 29));
    }

    public final void c(j71 j71Var) {
        if (j71Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = j71Var.S;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final ui.c d(n nVar) {
        ui.c cVar = new ui.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.e());
        return cVar;
    }

    public final ti.a e() {
        ti.a aVar = this.D;
        ti.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f58275b = 0;
        int i7 = aVar2.f58275b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f58274a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f56745i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f56744g++;
        this.f56747k += i7;
        this.f56748l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f56749m;
        if (view2 != view) {
            h hVar = this.f56740b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = cVar.f60506a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f60507b;
                    if (aVar != null) {
                        ((xe.b) aVar.f60505a.f12653b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f60507b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f60508c);
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
                    view.addOnAttachStateChangeListener(cVar2.f60508c);
                }
                ArrayList arrayList2 = cVar2.f60506a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = xd.a(view, cVar2)) != null) {
                        ((xe.b) a10.f60505a.f12653b).add(hVar);
                    }
                }
            }
            this.f56749m = view;
        }
    }
}
