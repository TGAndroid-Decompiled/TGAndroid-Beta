package z3;

import android.util.Log;
import e9.f0;
import za.a0;
import za.b0;
public final class g implements e2.h, i5.e {
    public final int f52366a;
    public final Object f52367b;

    public g(Object obj, int i10) {
        this.f52366a = i10;
        this.f52367b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52366a) {
            case 0:
                i iVar = (i) this.f52367b;
                a aVar = (a) obj;
                h hVar = new h(aVar.f52360b, ob.a.C2(aVar.f52359a, aVar.f52361c));
                iVar.f52372c.add(hVar);
                long j3 = iVar.f52377j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    iVar.a(hVar);
                    return;
                }
                return;
            default:
                ((f0) this.f52367b).b((a) obj);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        ((l2.g) this.f52367b).getClass();
        String c10 = b0.f53065b.c((a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.f49826a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
