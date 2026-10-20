package rb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f45183a = new ReferenceQueue();
    public final Set f45184b = DesugarCollections.synchronizedSet(new HashSet());
}
