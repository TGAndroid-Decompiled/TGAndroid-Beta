package tc;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;

public abstract class h extends g implements kotlin.jvm.internal.g {

    public final int f48159a;

    public h(rc.c cVar) {
        super(cVar);
        this.f48159a = 2;
    }

    @Override
    public final int getArity() {
        return this.f48159a;
    }

    @Override
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        r.f15254a.getClass();
        String strA = s.a(this);
        j.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
