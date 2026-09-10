package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j61;
import org.telegram.ui.zp0;
public final class x extends j61 {
    public final o1 N;

    public x(o1 o1Var, zp0 zp0Var, Context context, int i10, w wVar, b bVar) {
        super(zp0Var, context, i10, 0, false, wVar, bVar);
        this.N = o1Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        f0 f0Var;
        k0 k0Var;
        super.v(c1Var, i10);
        o1 o1Var = this.N;
        if (o1Var.f48677y) {
            View view = c1Var.f41610a;
            if ((view instanceof f0) && (k0Var = (f0Var = (f0) view).K) != null && k0Var.f48575a == o1Var.f48676x) {
                f0Var.b();
                o1Var.f48677y = false;
            }
        }
    }

    @Override
    public final void y(s4.c1 c1Var) {
        f0 f0Var;
        k0 k0Var;
        super.y(c1Var);
        o1 o1Var = this.N;
        if (o1Var.f48677y) {
            View view = c1Var.f41610a;
            if ((view instanceof f0) && (k0Var = (f0Var = (f0) view).K) != null && k0Var.f48575a == o1Var.f48676x) {
                f0Var.b();
                o1Var.f48677y = false;
            }
        }
    }
}
