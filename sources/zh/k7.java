package zh;

import android.content.Context;
import java.util.ArrayList;
public final class k7 extends q {
    public final u7 Q0;

    public k7(u7 u7Var, int i10, Context context, u7 u7Var2, b bVar) {
        super(context);
        boolean z10;
        this.Q0 = u7Var;
        this.A0 = new ArrayList();
        this.D0 = true;
        this.M0 = new sg.a1(this, 11);
        this.O0 = -1;
        this.f48419y0 = i10;
        this.H0 = new y2(context);
        this.N0 = u7Var2;
        c6 c6Var = new c6(this, context, u7Var2, bVar);
        this.f48420z0 = c6Var;
        setAdapter(c6Var);
        th.e eVar = new th.e(this, 25);
        if (this.m0 != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.m0 = eVar;
        setChildrenDrawingOrderEnabled(true);
        this.f47259o0 = 1;
        this.f47258n0 = 2;
        if (z10) {
            s();
        }
        setOffscreenPageLimit(0);
        b(new d6(this, u7Var2));
        setOverScrollMode(2);
    }
}
