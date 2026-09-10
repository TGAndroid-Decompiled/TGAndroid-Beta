package ub;

import android.content.Context;
import bi.u6;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f42623b = new b(0);
    public static final b f42624c = new b(1);
    public final int f42625a;

    public b(int i10) {
        this.f42625a = i10;
    }

    @Override
    public final Object P1(u6 u6Var) {
        switch (this.f42625a) {
            case 0:
                ArrayList arrayList = new ArrayList(u6Var.x(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f42626a);
                return new e((Context) u6Var.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) u6Var.a(e.class), (qb.d) u6Var.a(qb.d.class));
        }
    }
}
