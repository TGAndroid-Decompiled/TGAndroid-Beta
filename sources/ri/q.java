package ri;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.xd;
import java.util.ArrayList;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.oa;
import org.telegram.ui.Components.zs;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f56694a;
    public boolean f56698f;
    public long f56699g;
    public long h;
    public long f56700i;
    public int f56701j;
    public int f56702k;
    public int f56703l;
    public View f56704m;
    public long f56707p;
    public long f56708q;
    public long f56709r;
    public long f56710s;
    public long f56711t;
    public int f56712u;
    public boolean f56715y;
    public int f56716z;
    public final h f56695b = new h(this);
    public final ArrayList f56696c = new ArrayList();
    public ti.b d = ti.b.f58231c;
    public final RectF f56697e = new RectF();
    public final xe.b f56705n = new xe.b();
    public final ArrayList f56706o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f56713w = new Rect();
    public final Rect f56714x = new Rect();
    public final ti.a B = new ti.a();
    public final ti.a C = new ti.a();
    public final ti.a D = new ti.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = pc.e(256);
        boolean e11 = pc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f56717a != e10 || rVar.f56718b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.f56706o.add(gVar);
    }

    public final void b(ck0 ck0Var) {
        if (ck0Var == null) {
            return;
        }
        this.f56705n.add(ck0Var);
        ck0Var.E2.f33778b.add(new zs() {
            @Override
            public final void a(int i7, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f56701j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f56701j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (ck0Var.Q == null) {
            ck0Var.Q = new ArrayList();
        }
        ck0Var.Q.add(jVar);
        ck0Var.j(new oa(this, 29));
    }

    public final void c(g71 g71Var) {
        if (g71Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = g71Var.S;
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
        aVar.f58230b = 0;
        int i7 = aVar2.f58230b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.f58229a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f56700i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.f56699g++;
        this.f56702k += i7;
        this.f56703l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.f56704m;
        if (view2 != view) {
            h hVar = this.f56695b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f60461a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.f60462b;
                    if (aVar != null) {
                        ((xe.b) aVar.f60460a.f12611b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f60462b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f60463c);
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
                    view.addOnAttachStateChangeListener(cVar2.f60463c);
                }
                ArrayList arrayList2 = cVar2.f60461a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = xd.a(view, cVar2)) != null) {
                        ((xe.b) a10.f60460a.f12611b).add(hVar);
                    }
                }
            }
            this.f56704m = view;
        }
    }
}
