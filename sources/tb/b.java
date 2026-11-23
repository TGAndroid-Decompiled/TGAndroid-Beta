package tb;

import a8.r7;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import q6.m;
public final class b implements u9.d {
    public static final b f57686b = new b(0);
    public static final b f57687c = new b(1);
    public final int f57688a;

    public b(int i7) {
        this.f57688a = i7;
    }

    @Override
    public final Object e(r7 r7Var) {
        switch (this.f57688a) {
            case 0:
                ArrayList arrayList = new ArrayList(r7Var.L(sb.a.class));
                m.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f57689a);
                return new e((Context) r7Var.a(Context.class), (sb.a) arrayList.get(0));
            default:
                return new a((e) r7Var.a(e.class), (pb.d) r7Var.a(pb.d.class));
        }
    }
}
