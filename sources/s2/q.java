package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54736a;
    public final List f54737b;
    public final boolean f54738c;

    public q(String str, List list, boolean z9) {
        this.f54736a = str;
        this.f54737b = DesugarCollections.unmodifiableList(list);
        this.f54738c = z9;
    }
}
