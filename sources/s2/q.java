package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54631a;
    public final List f54632b;
    public final boolean f54633c;

    public q(String str, List list, boolean z9) {
        this.f54631a = str;
        this.f54632b = DesugarCollections.unmodifiableList(list);
        this.f54633c = z9;
    }
}
