package rb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f45598a = new ReferenceQueue();
    public final Set f45599b = DesugarCollections.synchronizedSet(new HashSet());
}
