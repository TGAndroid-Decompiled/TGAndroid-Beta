package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f47583b = new b(0);
    public static final b f47584c = new b(1);
    public final int f47585a;

    public b(int i10) {
        this.f47585a = i10;
    }

    @Override
    public final Object E(cf.c cVar) {
        switch (this.f47585a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.v(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f47586a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
