package z7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class xf implements n5.b {
    public final Object f51722a;
    public final Object f51723b;

    public xf(Context context) {
        this.f51723b = new AtomicLong(-1L);
        this.f51722a = new com.google.android.gms.common.api.j(context, p6.b.f44654k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6368c);
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((n5.c) this.f51722a).f17214a, (m.g3) ((ki.t1) this.f51723b).mo27get());
    }

    public xf(n5.c cVar, ki.t1 t1Var) {
        this.f51722a = cVar;
        this.f51723b = t1Var;
    }
}
