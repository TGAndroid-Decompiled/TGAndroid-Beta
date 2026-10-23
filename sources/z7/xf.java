package z7;

import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;
public final class xf implements n5.b {
    public final Object f51723a;
    public final Object f51724b;

    public xf(Context context) {
        this.f51724b = new AtomicLong(-1L);
        this.f51723a = new com.google.android.gms.common.api.j(context, p6.b.f44655k, new n6.p("mlkit:vision"), com.google.android.gms.common.api.i.f6368c);
    }

    @Override
    public Object mo27get() {
        return new m5.d((Context) ((n5.c) this.f51723a).f17214a, (m.g3) ((ki.t1) this.f51724b).mo27get());
    }

    public xf(n5.c cVar, ki.t1 t1Var) {
        this.f51723a = cVar;
        this.f51724b = t1Var;
    }
}
