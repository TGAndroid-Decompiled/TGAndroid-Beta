package s2;

import j$.util.DesugarCollections;
import java.util.List;
public abstract class q implements w2.a {
    public final String f54607a;
    public final List f54608b;
    public final boolean f54609c;

    public q(String str, List list, boolean z9) {
        this.f54607a = str;
        this.f54608b = DesugarCollections.unmodifiableList(list);
        this.f54609c = z9;
    }
}
