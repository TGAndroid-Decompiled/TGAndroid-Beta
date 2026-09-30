package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f43939b = new b(0);
    public static final b f43940c = new b(1);
    public final int f43941a;

    public b(int i10) {
        this.f43941a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f43941a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.x(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f43942a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
