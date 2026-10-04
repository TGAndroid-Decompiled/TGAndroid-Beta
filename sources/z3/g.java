package z3;

import android.util.Log;
import e9.f0;
import za.a0;
import za.b0;
public final class g implements e2.h, i5.e {
    public final int f52360a;
    public final Object f52361b;

    public g(Object obj, int i10) {
        this.f52360a = i10;
        this.f52361b = obj;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f52360a) {
            case 0:
                i iVar = (i) this.f52361b;
                a aVar = (a) obj;
                h hVar = new h(aVar.f52354b, ob.a.C2(aVar.f52353a, aVar.f52355c));
                iVar.f52366c.add(hVar);
                long j3 = iVar.f52371j;
                if (j3 == -9223372036854775807L || aVar.d >= j3) {
                    iVar.a(hVar);
                    return;
                }
                return;
            default:
                ((f0) this.f52361b).b((a) obj);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        ((l2.g) this.f52361b).getClass();
        String c10 = b0.f53059b.c((a0) obj);
        kotlin.jvm.internal.i.d(c10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(c10));
        byte[] bytes = c10.getBytes(xd.a.f49817a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
