package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.ud;
import java.util.ArrayList;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ri;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f56120a;
    public boolean f56124f;
    public long f56125g;
    public long h;
    public long f56126i;
    public int f56127j;
    public int f56128k;
    public int f56129l;
    public View f56130m;
    public long f56133p;
    public long f56134q;
    public long f56135r;
    public long f56136s;
    public long f56137t;
    public int f56138u;
    public boolean f56141y;
    public int f56142z;
    public final h f56121b = new h(this);
    public final ArrayList f56122c = new ArrayList();
    public ti.b d = ti.b.f57663c;
    public final RectF f56123e = new RectF();
    public final xe.b f56131n = new xe.b();
    public final ArrayList f56132o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f56139w = new Rect();
    public final Rect f56140x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = qc.e(256);
        boolean e11 = qc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f56143a != e10 || rVar.f56144b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f56132o.add(gVar);
    }

    public final void b(uj0 uj0Var) {
        if (uj0Var == null) {
            return;
        }
        this.f56131n.add(uj0Var);
        uj0Var.E2.f40156b.add(new ss() {
            @Override
            public final void a(int i7, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f56127j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f56127j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (uj0Var.Q == null) {
            uj0Var.Q = new ArrayList();
        }
        uj0Var.Q.add(jVar);
        uj0Var.j(new ri(this, 28));
    }

    public final void c(w61 w61Var) {
        if (w61Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = w61Var.S;
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
        aVar.f57662b = 0;
        int i7 = aVar2.f57662b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f57661a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f56126i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f56125g++;
        this.f56128k += i7;
        this.f56129l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f56130m;
        if (view2 != view) {
            h hVar = this.f56121b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f59891a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f59892b;
                    if (aVar != null) {
                        ((xe.b) aVar.f59890a.f12459b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f59892b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f59893c);
                        view2.setTag(2131296697, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                xf.c cVar2 = (xf.c) view.getTag(2131296697);
                if (cVar2 == null) {
                    cVar2 = new xf.c();
                    view.setTag(2131296697, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.f59893c);
                }
                ArrayList arrayList2 = cVar2.f59891a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = ud.a(view, cVar2)) != null) {
                        ((xe.b) a10.f59890a.f12459b).add(hVar);
                    }
                }
            }
            this.f56130m = view;
        }
    }
}
