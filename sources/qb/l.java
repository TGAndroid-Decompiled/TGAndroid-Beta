package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class l extends PhantomReference {
    public final Set f44917a;
    public final z9 f44918b;

    public l(a aVar, ReferenceQueue referenceQueue, Set set, z9 z9Var) {
        super(aVar, referenceQueue);
        this.f44917a = set;
        this.f44918b = z9Var;
    }
}
