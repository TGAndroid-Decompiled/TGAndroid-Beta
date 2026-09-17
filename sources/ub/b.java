package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f47013b = new b(0);
    public static final b f47014c = new b(1);
    public final int f47015a;

    public b(int i10) {
        this.f47015a = i10;
    }

    @Override
    public final Object D(cf.c cVar) {
        switch (this.f47015a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.s(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f47016a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
