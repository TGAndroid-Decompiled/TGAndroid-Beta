package sb;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;
public final class a {
    public final ReferenceQueue f48078a = new ReferenceQueue();
    public final Set f48079b = DesugarCollections.synchronizedSet(new HashSet());
}
