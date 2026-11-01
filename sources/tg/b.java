package tg;

import android.view.View;
import android.view.ViewGroup;
import ei.q;
import ei.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.ui.web.k0;
public final class b {
    public final hi.a f48708a;
    public final hi.a f48709b;
    public final hi.a f48710c;
    public int d;
    public int e;
    public je.b f48711f;
    public je.b f48712g;
    public zg.h h;
    public ViewGroup f48713i;
    public r f48714j;
    public boolean f48715k;

    public b(hi.a aVar) {
        this(aVar, aVar, aVar);
    }

    public final vg.f a(View view) {
        return c(view, null, false);
    }

    public final vg.f b(View view, wg.a aVar) {
        return c(view, aVar, false);
    }

    public final vg.f c(View view, wg.a aVar, boolean z10) {
        vg.f fVar;
        hi.a aVar2 = this.f48710c;
        hi.a aVar3 = this.f48708a;
        hi.a aVar4 = this.f48709b;
        if (aVar3 == aVar4 && aVar4 == aVar2) {
            if (aVar3 instanceof a) {
                fVar = ((a) aVar3).b();
            } else {
                fVar = new vg.f(aVar3, aVar3, aVar3);
            }
        } else {
            vg.f fVar2 = new vg.f(aVar3, aVar4, aVar2);
            if (aVar3 instanceof a) {
                ((a) aVar3).c(fVar2);
            }
            if (aVar4 != aVar3 && (aVar4 instanceof a)) {
                ((a) aVar4).c(fVar2);
            }
            if (aVar2 != aVar3 && aVar2 != aVar4 && (aVar2 instanceof a)) {
                ((a) aVar2).c(fVar2);
            }
            fVar = fVar2;
        }
        if (this.f48715k && !fVar.V) {
            fVar.V = true;
            fVar.Y = true;
        }
        fVar.o(aVar);
        int i10 = this.d;
        int i11 = this.e;
        fVar.K = i10;
        fVar.L = i11;
        je.b bVar = this.f48712g;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        r rVar = this.f48714j;
        if (rVar != null && view != null) {
            rVar.f6673c.add(new q(view, fVar));
        }
        if (this.h != null && this.f48713i != null && view != null) {
            this.h.d(view, this.f48713i, new k0(17, fVar, new WeakReference(view)), z10);
        }
        je.b bVar2 = this.f48711f;
        if (bVar2 != null) {
            bVar2.add(fVar);
        }
        return fVar;
    }

    public final void d() {
        je.b bVar = this.f48712g;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(r rVar) {
        this.f48714j = rVar;
    }

    public final void f(je.b bVar) {
        this.f48712g = bVar;
    }

    public final void g(zg.h hVar, ViewGroup viewGroup) {
        this.h = hVar;
        this.f48713i = viewGroup;
    }

    public b(hi.a aVar, hi.a aVar2, hi.a aVar3) {
        this.f48708a = aVar;
        this.f48709b = aVar2;
        this.f48710c = aVar3;
    }
}
