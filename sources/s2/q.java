package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54735a;
    public final List f54736b;
    public final boolean f54737c;

    public q(String str, List list, boolean z9) {
        this.f54735a = str;
        this.f54736b = DesugarCollections.unmodifiableList(list);
        this.f54737c = z9;
    }
}
