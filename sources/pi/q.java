package pi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.tj0;
import x7.p6;
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m f53602a;
    public boolean f53606f;
    public long f53607g;
    public long h;
    public long f53608i;
    public int f53609j;
    public int f53610k;
    public int f53611l;
    public View f53612m;
    public long f53615p;
    public long f53616q;
    public long f53617r;
    public long f53618s;
    public long f53619t;
    public int f53620u;
    public boolean f53623y;
    public int f53624z;
    public final h f53603b = new h(this);
    public final ArrayList f53604c = new ArrayList();
    public ri.b d = ri.b.f54545c;
    public final RectF f53605e = new RectF();
    public final ue.b f53613n = new ue.b();
    public final ArrayList f53614o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect f53621w = new Rect();
    public final Rect f53622x = new Rect();
    public final ri.a B = new ri.a();
    public final ri.a C = new ri.a();
    public final ri.a D = new ri.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = lc.e(256);
        boolean e11 = lc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.f53625a != e10 || rVar.f53626b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(eh.g gVar) {
        this.f53614o.add(gVar);
    }

    public final void b(tj0 tj0Var) {
        if (tj0Var == null) {
            return;
        }
        this.f53613n.add(tj0Var);
        tj0Var.E2.f36933b.add(new ms() {
            @Override
            public final void a(int i3, boolean z10) {
                int i10;
                q qVar = q.this;
                qVar.h++;
                int i11 = qVar.f53609j;
                if (z10) {
                    i10 = 1;
                } else {
                    i10 = -1;
                }
                qVar.f53609j = i11 + i10;
            }
        });
        j jVar = new j(this);
        if (tj0Var.Q == null) {
            tj0Var.Q = new ArrayList();
        }
        tj0Var.Q.add(jVar);
        tj0Var.j(new ji(this, 28));
    }

    public final void c(n61 n61Var) {
        if (n61Var != null) {
            g gVar = new g(this);
            ArrayList arrayList = n61Var.S;
            if (!arrayList.contains(gVar)) {
                arrayList.add(gVar);
            }
        }
    }

    public final si.c d(n nVar) {
        si.c cVar = new si.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.e());
        return cVar;
    }

    public final ri.a e() {
        ri.a aVar = this.D;
        ri.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.f54544b = 0;
        int i3 = aVar2.f54544b;
        for (int i10 = 0; i10 < i3; i10++) {
            RectF rectF = (RectF) aVar2.f54543a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.f53608i++;
    }

    public final void h(int i3, int i10) {
        if (i3 == 0 && i10 == 0) {
            return;
        }
        this.f53607g++;
        this.f53610k += i3;
        this.f53611l += i10;
    }

    public final void i(View view) {
        yf.a a10;
        yf.c cVar;
        View view2 = this.f53612m;
        if (view2 != view) {
            h hVar = this.f53603b;
            if (view2 != null && (cVar = (yf.c) view2.getTag(2131296697)) != null) {
                ArrayList arrayList = cVar.f59419a;
                if (arrayList.remove(hVar)) {
                    yf.a aVar = cVar.f59420b;
                    if (aVar != null) {
                        ((ue.b) aVar.f59418a.f10221b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.f59420b = null;
                        view2.removeOnAttachStateChangeListener(cVar.f59421c);
                        view2.setTag(2131296697, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                yf.c cVar2 = (yf.c) view.getTag(2131296697);
                if (cVar2 == null) {
                    cVar2 = new yf.c();
                    view.setTag(2131296697, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.f59421c);
                }
                ArrayList arrayList2 = cVar2.f59419a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = p6.a(view, cVar2)) != null) {
                        ((ue.b) a10.f59418a.f10221b).add(hVar);
                    }
                }
            }
            this.f53612m = view;
        }
    }
}
