package vb;

import android.content.Context;
import com.google.android.gms.internal.cast.z5;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;
public final class b implements r9.d {
    public static final b f48333b = new b(0);
    public static final b f48334c = new b(1);
    public final int f48335a;

    public b(int i10) {
        this.f48335a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f48335a) {
            case 0:
                ArrayList arrayList = new ArrayList(z5Var.y(ub.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f48336a);
                return new e((Context) z5Var.a(Context.class), (ub.a) arrayList.get(0));
            default:
                return new a((e) z5Var.a(e.class), (rb.d) z5Var.a(rb.d.class));
        }
    }
}
