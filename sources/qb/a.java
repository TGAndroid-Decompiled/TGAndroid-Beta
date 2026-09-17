package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f44270a = new ReferenceQueue();
    public final Set f44271b = DesugarCollections.synchronizedSet(new HashSet());
}
