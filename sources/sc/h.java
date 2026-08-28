package sc;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class h extends g implements kotlin.jvm.internal.f {
    public final int f47510a;

    public h(qc.c cVar) {
        super(cVar);
        this.f47510a = 2;
    }

    @Override
    public final int getArity() {
        return this.f47510a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            q.f16500a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
