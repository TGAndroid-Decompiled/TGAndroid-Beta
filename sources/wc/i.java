package wc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
public abstract class i extends c implements kotlin.jvm.internal.g {
    private final int arity;

    public i(int i10, uc.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            r.f10991a.getClass();
            String a2 = s.a(this);
            j.d(a2, "renderLambdaToString(...)");
            return a2;
        }
        return super.toString();
    }
}
