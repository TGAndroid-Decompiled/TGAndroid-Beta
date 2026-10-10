package ub;

import android.content.Context;
import ci.u5;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f48929b = new b(0);
    public static final b f48930c = new b(1);
    public final int f48931a;

    public b(int i10) {
        this.f48931a = i10;
    }

    @Override
    public final Object y0(u5 u5Var) {
        switch (this.f48931a) {
            case 0:
                ArrayList arrayList = new ArrayList(u5Var.y(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f48932a);
                return new e((Context) u5Var.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) u5Var.a(e.class), (qb.d) u5Var.a(qb.d.class));
        }
    }
}
