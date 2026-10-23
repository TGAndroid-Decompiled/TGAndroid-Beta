package z4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import r0.i0;
import r0.k1;
import r0.n;
public final class b implements n {
    public Object f51134a;
    public Object f51135b;

    public b(String str, PointF[] pointFArr) {
        this.f51134a = str;
        this.f51135b = pointFArr;
    }

    @Override
    public k1 B0(View view, k1 k1Var) {
        h hVar = (h) this.f51135b;
        k1 g10 = i0.g(view, k1Var);
        if (g10.f45251a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f51134a;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = hVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            k1 b10 = i0.b(hVar.getChildAt(i10), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }
}
