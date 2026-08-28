package ya;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f49682a = new ReferenceQueue();
    public final Set f49683b = DesugarCollections.synchronizedSet(new HashSet());
}
