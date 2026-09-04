package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f46984b = new b(0);
    public static final b f46985c = new b(1);
    public final int f46986a;

    public b(int i10) {
        this.f46986a = i10;
    }

    @Override
    public final Object D(cf.c cVar) {
        switch (this.f46986a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.s(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f46987a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
