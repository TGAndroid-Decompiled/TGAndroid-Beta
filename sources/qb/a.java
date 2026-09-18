package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f41258a = new ReferenceQueue();
    public final Set f41259b = DesugarCollections.synchronizedSet(new HashSet());
}
