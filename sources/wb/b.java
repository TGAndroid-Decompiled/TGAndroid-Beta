package wb;

import a8.me;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import o6.l;
public final class b implements s9.d {
    public static final b f51149b = new b(0);
    public static final b f51150c = new b(1);
    public final int f51151a;

    public b(int i10) {
        this.f51151a = i10;
    }

    @Override
    public final Object d1(me meVar) {
        switch (this.f51151a) {
            case 0:
                ArrayList arrayList = new ArrayList(meVar.x(vb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f51152a);
                return new e((Context) meVar.a(Context.class), (vb.a) arrayList.get(0));
            default:
                return new a((e) meVar.a(e.class), (sb.d) meVar.a(sb.d.class));
        }
    }
}
