package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f41522a = new ReferenceQueue();
    public final Set f41523b = DesugarCollections.synchronizedSet(new HashSet());
}
