package z3;

import android.util.Log;
import e9.f0;
import za.a0;
import za.b0;
public final class k implements e2.h, i5.e {
    public final Object f48416a;

    public k(Object obj) {
        this.f48416a = obj;
    }

    @Override
    public void accept(Object obj) {
        ((f0) this.f48416a).b((a) obj);
    }

    @Override
    public Object apply(Object obj) {
        ((w9.k) this.f48416a).getClass();
        String J = b0.f49064b.J((a0) obj);
        kotlin.jvm.internal.i.d(J, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(J));
        byte[] bytes = J.getBytes(xd.a.f46066a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
