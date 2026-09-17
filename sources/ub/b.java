package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements q9.d {
    public static final b f43675b = new b(0);
    public static final b f43676c = new b(1);
    public final int f43677a;

    public b(int i10) {
        this.f43677a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f43677a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.w(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f43678a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
