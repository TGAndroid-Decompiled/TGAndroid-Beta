package za;

import j$.util.DesugarCollections;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Set;

public final class a {

    public final ReferenceQueue f50278a = new ReferenceQueue();

    public final Set f50279b = DesugarCollections.synchronizedSet(new HashSet());
}
