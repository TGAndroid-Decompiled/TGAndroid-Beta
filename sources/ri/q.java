package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.xd;
import java.util.ArrayList;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.bt;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.oa;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f56735a;
    public boolean f56739f;
    public long f56740g;
    public long h;
    public long f56741i;
    public int f56742j;
    public int f56743k;
    public int f56744l;
    public View f56745m;
    public long f56748p;
    public long f56749q;
    public long f56750r;
    public long f56751s;
    public long f56752t;
    public int f56753u;
    public boolean f56756y;
    public int f56757z;
    public final h f56736b = new h(this);
    public final ArrayList f56737c = new ArrayList();
    public ti.b d = ti.b.f58272c;
    public final RectF f56738e = new RectF();
    public final xe.b f56746n = new xe.b();
    public final ArrayList f56747o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f56754w = new Rect();
    public final Rect f56755x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = pc.e(256);
        boolean e11 = pc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f56758a != e10 || rVar.f56759b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f56747o.add(gVar);
    }

    public final void b(ek0 ek0Var) {
        if (ek0Var == null) {
            return;
        }
        this.f56746n.add(ek0Var);
        ek0Var.E2.f34573b.add(new bt() {
            @Override
            public final void a(int i7, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f56742j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f56742j = i11 + i10;
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
        aVar.f58271b = 0;
        int i7 = aVar2.f58271b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f58270a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f56741i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f56740g++;
        this.f56743k += i7;
        this.f56744l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f56745m;
        if (view2 != view) {
            h hVar = this.f56736b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296699)) != null) {
                ArrayList arrayList = cVar.f60502a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f60503b;
                    if (aVar != null) {
                        ((xe.b) aVar.f60501a.f12650b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f60503b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f60504c);
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
                    view.addOnAttachStateChangeListener(cVar2.f60504c);
                }
                ArrayList arrayList2 = cVar2.f60502a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = xd.a(view, cVar2)) != null) {
                        ((xe.b) a10.f60501a.f12650b).add(hVar);
                    }
                }
            }
            this.f56745m = view;
        }
    }
}
