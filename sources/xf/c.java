package xf;

import android.graphics.Rect;
import android.view.View;
import r0.i0;
import r0.k1;
import r0.n;
import z4.g;
public final class c implements n {
    public Object f49785a;
    public Object f49786b;

    public c(Object obj, Cloneable cloneable) {
        this.f49785a = obj;
        this.f49786b = cloneable;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        g gVar = (g) this.f49786b;
        k1 g10 = i0.g(view, k1Var);
        if (g10.f44839a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f49785a;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = i0.b(gVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
