package tg;

import android.view.View;
import android.view.ViewGroup;
import ei.q;
import ei.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.telegram.ui.web.k0;
public final class b {
    public final hi.a f48697a;
    public int f48698b;
    public int f48699c;
    public je.b d;
    public je.b e;
    public zg.h f48700f;
    public ViewGroup f48701g;
    public r h;
    public boolean f48702i;

    public b(hi.a aVar) {
        this.f48697a = aVar;
    }

    public final vg.f a(View view) {
        return c(view, null, false);
    }

    public final vg.f b(View view, wg.a aVar) {
        return c(view, aVar, false);
    }

    public final vg.f c(View view, wg.a aVar, boolean z10) {
        vg.f fVar;
        hi.a aVar2 = this.f48697a;
        if (aVar2 instanceof a) {
            fVar = ((a) aVar2).a();
        } else {
            fVar = new vg.f(aVar2);
        }
        if (this.f48702i && !fVar.S) {
            fVar.S = true;
            fVar.V = true;
        }
        fVar.o(aVar);
        int i10 = this.f48698b;
        int i11 = this.f48699c;
        fVar.H = i10;
        fVar.I = i11;
        je.b bVar = this.e;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        r rVar = this.h;
        if (rVar != null && view != null) {
            rVar.f6672c.add(new q(view, fVar));
        }
        if (this.f48700f != null && this.f48701g != null && view != null) {
            this.f48700f.d(view, this.f48701g, new k0(17, fVar, new WeakReference(view)), z10);
        }
        je.b bVar2 = this.d;
        if (bVar2 != null) {
            bVar2.add(fVar);
        }
        return fVar;
    }

    public final void d() {
        je.b bVar = this.e;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(r rVar) {
        this.h = rVar;
    }

    public final void f(je.b bVar) {
        this.e = bVar;
    }

    public final void g(zg.h hVar, ViewGroup viewGroup) {
        this.f48700f = hVar;
        this.f48701g = viewGroup;
    }
}
