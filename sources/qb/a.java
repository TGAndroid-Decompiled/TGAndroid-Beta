package qb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f44269a = new ReferenceQueue();
    public final Set f44270b = DesugarCollections.synchronizedSet(new HashSet());
}
