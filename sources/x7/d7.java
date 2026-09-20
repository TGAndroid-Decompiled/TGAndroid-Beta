package x7;

import android.graphics.Rect;
import android.view.View;
public final class d7 implements r0.n, ce.b {
    public Object f45681a;
    public Object f45682b;

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        z4.g gVar = (z4.g) this.f45682b;
        r0.l1 h = r0.i0.h(view, l1Var);
        if (h.f42154a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f45681a;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.l1 b10 = r0.i0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public Object s(ce.c cVar, kd.c cVar2) {
        Object s10 = ((n4.y) this.f45681a).s(new k1.p(cVar, (za.y) this.f45682b), cVar2);
        if (s10 == jd.a.f12971a) {
            return s10;
        }
        return gd.i.f9621a;
    }
}
