package qb;

import android.content.Context;
import b8.ke;
import java.util.ArrayList;
import java.util.Collections;
import p6.m;
public final class b implements t9.d {
    public static final b f53826b = new b(0);
    public static final b f53827c = new b(1);
    public final int f53828a;

    public b(int i3) {
        this.f53828a = i3;
    }

    @Override
    public final Object q1(ke keVar) {
        switch (this.f53828a) {
            case 0:
                ArrayList arrayList = new ArrayList(keVar.I(pb.a.class));
                m.i("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.f53829a);
                return new e((Context) keVar.a(Context.class), (pb.a) arrayList.get(0));
            default:
                return new a((e) keVar.a(e.class), (mb.d) keVar.a(mb.d.class));
        }
    }
}
