package zg;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import sg.f0;
public final class a {
    public final eh.a f48080a;
    public pe.b f48081b;
    public pe.b f48082c;
    public gh.k d;
    public ViewGroup e;
    public boolean f48083f;

    public a(eh.a aVar) {
        this.f48080a = aVar;
    }

    public final bh.d a(View view) {
        return c(view, null, false);
    }

    public final bh.d b(View view, ch.a aVar) {
        return c(view, aVar, false);
    }

    public final bh.d c(View view, ch.a aVar, boolean z10) {
        ViewGroup viewGroup;
        bh.d k10 = this.f48080a.k();
        if (this.f48083f && Build.VERSION.SDK_INT >= 33 && (k10 instanceof bh.e)) {
            bh.e eVar = (bh.e) k10;
            eVar.N = new f(eVar.I);
        }
        k10.n(aVar);
        pe.b bVar = this.f48082c;
        if (bVar != null && view != null) {
            bVar.add(view);
        }
        gh.k kVar = this.d;
        if (kVar != null && (viewGroup = this.e) != null && view != null) {
            kVar.d(view, viewGroup, new f0(14, k10, view), z10);
        }
        pe.b bVar2 = this.f48081b;
        if (bVar2 != null) {
            bVar2.add(k10);
        }
        return k10;
    }

    public final void d() {
        pe.b bVar = this.f48082c;
        if (bVar != null) {
            Iterator it = bVar.iterator();
            while (it.hasNext()) {
                ((View) it.next()).invalidate();
            }
        }
    }

    public final void e(pe.b bVar) {
        this.f48082c = bVar;
    }

    public final void f(gh.k kVar, ViewGroup viewGroup) {
        this.d = kVar;
        this.e = viewGroup;
    }
}
