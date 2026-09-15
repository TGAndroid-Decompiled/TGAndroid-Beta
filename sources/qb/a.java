package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f41231a = new ReferenceQueue();
    public final Set f41232b = DesugarCollections.synchronizedSet(new HashSet());
}
