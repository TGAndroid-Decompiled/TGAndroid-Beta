package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class l extends PhantomReference {
    public final Set f41252a;
    public final z9 f41253b;

    public l(a aVar, ReferenceQueue referenceQueue, Set set, z9 z9Var) {
        super(aVar, referenceQueue);
        this.f41252a = set;
        this.f41253b = z9Var;
    }
}
