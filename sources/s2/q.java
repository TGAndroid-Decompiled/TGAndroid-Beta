package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54632a;
    public final List f54633b;
    public final boolean f54634c;

    public q(String str, List list, boolean z9) {
        this.f54632a = str;
        this.f54633b = DesugarCollections.unmodifiableList(list);
        this.f54634c = z9;
    }
}
