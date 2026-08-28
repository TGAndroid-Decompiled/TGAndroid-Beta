package sc;

import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
public abstract class i extends c implements kotlin.jvm.internal.f {
    private final int arity;

    public i(int i9, qc.c cVar) {
        super(cVar);
        this.arity = i9;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            q.f16500a.getClass();
            String a2 = r.a(this);
            kotlin.jvm.internal.i.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
