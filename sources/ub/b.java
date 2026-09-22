package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f43975b = new b(0);
    public static final b f43976c = new b(1);
    public final int f43977a;

    public b(int i10) {
        this.f43977a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f43977a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.x(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f43978a);
                return new e((Context) cVar.b(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.b(e.class), (qb.d) cVar.b(qb.d.class));
        }
    }
}
