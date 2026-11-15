package tb;

import a8.r7;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import q6.m;
public final class b implements u9.d {
    public static final b f57071b = new b(0);
    public static final b f57072c = new b(1);
    public final int f57073a;

    public b(int i7) {
        this.f57073a = i7;
    }

    @Override
    public final Object i(r7 r7Var) {
        switch (this.f57073a) {
            case 0:
                ArrayList arrayList = new ArrayList(r7Var.I(sb.a.class));
                m.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f57074a);
                return new e((Context) r7Var.a(Context.class), (sb.a) arrayList.get(0));
            default:
                return new a((e) r7Var.a(e.class), (pb.d) r7Var.a(pb.d.class));
        }
    }
}
