package z3;

import android.util.Log;
import e9.f0;
import za.a0;
import za.b0;
public final class g implements e2.h, i5.e {
    public final int f52361a;
    public final Object f52362b;

    public g(Object obj, int i10) {
        this.f52361a = i10;
        this.f52362b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52361a) {
            case 0:
                i iVar = (i) this.f52362b;
                a aVar = (a) obj;
                h hVar = new h(aVar.f52355b, ob.a.C2(aVar.f52354a, aVar.f52356c));
                iVar.f52367c.add(hVar);
                long j3 = iVar.f52372j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    iVar.a(hVar);
                    return;
                }
                return;
            default:
                ((f0) this.f52362b).b((a) obj);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        ((l2.g) this.f52362b).getClass();
        String c10 = b0.f53060b.c((a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.f49818a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
