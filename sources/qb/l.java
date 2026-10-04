package qb;

import ai.z9;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
public final class l extends PhantomReference {
    public final Set f44925a;
    public final z9 f44926b;

    public l(a aVar, ReferenceQueue referenceQueue, Set set, z9 z9Var) {
        super(aVar, referenceQueue);
        this.f44925a = set;
        this.f44926b = z9Var;
    }
}
